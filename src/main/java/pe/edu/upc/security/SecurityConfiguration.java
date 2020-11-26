package pe.edu.upc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UsuarioDetailsService usuarioDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				//.antMatchers("/clientes").hasRole("CUSTOMER")
				//.antMatchers("/productos").hasRole("CUSTOMER")
				.antMatchers("/clientes").hasAnyRole("EMPLOYEE","CUSTOMER")
				.antMatchers("/productos").hasAnyRole("EMPLOYEE","CUSTOMER")
				//.antMatchers("/clientes").hasRole("EMPLOYEE")
				//.antMatchers("/productos").hasRole("EMPLOYEE")
				.antMatchers("/marcas").hasRole("EMPLOYEE")
				.antMatchers("/categorias").hasRole("EMPLOYEE")
				.antMatchers("/empleados").hasRole("EMPLOYEE")
				.antMatchers("/proveedores").hasRole("EMPLOYEE")
				.antMatchers("/transporte").hasRole("EMPLOYEE")
				.antMatchers("/pedidos/mis").hasRole("CUSTOMER")
				.antMatchers("/carritos/mis").hasRole("CUSTOMER")


				//.antMatchers("/categorias/**/p").hasRole("CUSTOMER")
				
			.and()
			.formLogin()
				.loginProcessingUrl("/signin")
				.loginPage("/login").permitAll()
				.usernameParameter("username")
				.passwordParameter("password")
			.and()
			.logout()
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutSuccessUrl("/");
			
		
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// Aqui se crea el vinculo entre el Spring security y: el PasswordEncoder y UsuarioDetailsService
	DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		daoAuthenticationProvider.setUserDetailsService(this.usuarioDetailsService);
		return daoAuthenticationProvider;
	}
}
