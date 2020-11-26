package pe.edu.upc.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pe.edu.upc.models.entities.Usuario;
import pe.edu.upc.models.repositories.UsuarioRepository;
import pe.edu.upc.utils.Segmento;

@Service
public class AddUserDB implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// SOLO DESBLOQUEAR CUANDO SE REQUIERA CREAR USUARIO DE FORMA MANUAL
		
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		
		/*Usuario cliente1 = new Usuario();
		cliente1.setUsername("cliente1");
		cliente1.setPassword( bcpe.encode("cliente") );
		cliente1.setEnable(true);
		cliente1.setSegmento(Segmento.CLIENTE);
		cliente1.setIdSegmento(1);
		
		Usuario cliente2 = new Usuario();
		cliente2.setUsername("cliente2");
		cliente2.setPassword( bcpe.encode("cliente") );
		cliente2.setEnable(true);
		cliente2.setSegmento(Segmento.CLIENTE);
		cliente2.setIdSegmento(2);
		
		Usuario cliente3 = new Usuario();
		cliente3.setUsername("cliente3");
		cliente3.setPassword( bcpe.encode("cliente") );
		cliente3.setEnable(true);
		cliente3.setSegmento(Segmento.CLIENTE);
		cliente3.setIdSegmento(3);
		
		Usuario cliente4 = new Usuario();
		cliente4.setUsername("cliente4");
		cliente4.setPassword( bcpe.encode("cliente") );
		cliente4.setEnable(true);
		cliente4.setSegmento(Segmento.CLIENTE);
		cliente4.setIdSegmento(4);
		
		Usuario empleado1 = new Usuario();
		empleado1.setUsername("empleado1");
		empleado1.setPassword( bcpe.encode("empleado") );
		empleado1.setEnable(true);
		empleado1.setSegmento(Segmento.EMPLEADO);
		empleado1.setIdSegmento(1);
		
		Usuario empleado2 = new Usuario();
		empleado2.setUsername("empleado2");
		empleado2.setPassword( bcpe.encode("empleado") );
		empleado2.setEnable(true);
		empleado2.setSegmento(Segmento.EMPLEADO);
		empleado2.setIdSegmento(2);
		
		Usuario empleado3 = new Usuario();
		empleado3.setUsername("empleado3");
		empleado3.setPassword( bcpe.encode("empleado") );
		empleado3.setEnable(true);
		empleado3.setSegmento(Segmento.EMPLEADO);
		empleado3.setIdSegmento(3);
		
		// ROLE_CUSTOMER, ROLE_EMPLOYEE, ROLE_ADMIN
		cliente1.addAuthority("ROLE_CUSTOMER");
		cliente2.addAuthority("ROLE_CUSTOMER");
		cliente3.addAuthority("ROLE_CUSTOMER");
		cliente4.addAuthority("ROLE_CUSTOMER");
		
		empleado1.addAuthority("ROLE_EMPLOYEE");
		empleado2.addAuthority("ROLE_EMPLOYEE");
		empleado3.addAuthority("ROLE_EMPLOYEE");
		
		// ACCESS_
		cliente1.addAuthority("ACCESS_DESC");
		cliente2.addAuthority("ACCESS_PROMO");
	
		usuarioRepository.save(cliente1);
		usuarioRepository.save(cliente2);
		usuarioRepository.save(cliente3);
		usuarioRepository.save(cliente4);
		
		usuarioRepository.save(empleado1);
		usuarioRepository.save(empleado2);
		usuarioRepository.save(empleado3);*/
		
		///////////////////////////////////
		
		/*Usuario cliente11 = new Usuario();
		cliente11.setUsername("cliente11");
		cliente11.setPassword( bcpe.encode("cliente") );
		cliente11.setEnable(true);
		cliente11.setSegmento(Segmento.CLIENTE);
		cliente11.setIdSegmento(11);
		
		Usuario cliente12 = new Usuario();
		cliente12.setUsername("cliente12");
		cliente12.setPassword( bcpe.encode("cliente") );
		cliente12.setEnable(true);
		cliente12.setSegmento(Segmento.CLIENTE);
		cliente12.setIdSegmento(12);
		
		Usuario cliente13 = new Usuario();
		cliente13.setUsername("cliente13");
		cliente13.setPassword( bcpe.encode("cliente") );
		cliente13.setEnable(true);
		cliente13.setSegmento(Segmento.CLIENTE);
		cliente13.setIdSegmento(13);
		
		Usuario cliente14 = new Usuario();
		cliente14.setUsername("cliente14");
		cliente14.setPassword( bcpe.encode("cliente") );
		cliente14.setEnable(true);
		cliente14.setSegmento(Segmento.CLIENTE);
		cliente14.setIdSegmento(14);
		
		Usuario empleado11 = new Usuario();
		empleado11.setUsername("empleado11");
		empleado11.setPassword( bcpe.encode("empleado") );
		empleado11.setEnable(true);
		empleado11.setSegmento(Segmento.EMPLEADO);
		empleado11.setIdSegmento(11);
		
		Usuario empleado12 = new Usuario();
		empleado12.setUsername("empleado12");
		empleado12.setPassword( bcpe.encode("empleado") );
		empleado12.setEnable(true);
		empleado12.setSegmento(Segmento.EMPLEADO);
		empleado12.setIdSegmento(12);
		
		Usuario empleado13 = new Usuario();
		empleado13.setUsername("empleado13");
		empleado13.setPassword( bcpe.encode("empleado") );
		empleado13.setEnable(true);
		empleado13.setSegmento(Segmento.EMPLEADO);
		empleado13.setIdSegmento(13);
		
		// ROLE_CUSTOMER, ROLE_EMPLOYEE, ROLE_ADMIN
		cliente11.addAuthority("ROLE_CUSTOMER");
		cliente12.addAuthority("ROLE_CUSTOMER");
		cliente13.addAuthority("ROLE_CUSTOMER");
		cliente14.addAuthority("ROLE_CUSTOMER");
		
		empleado11.addAuthority("ROLE_EMPLOYEE");
		empleado12.addAuthority("ROLE_EMPLOYEE");
		empleado13.addAuthority("ROLE_EMPLOYEE");
		
		// ACCESS_
		cliente11.addAuthority("ACCESS_DESC");
		cliente12.addAuthority("ACCESS_PROMO");
	
		usuarioRepository.save(cliente11);
		usuarioRepository.save(cliente12);
		usuarioRepository.save(cliente13);
		usuarioRepository.save(cliente14);
		
		usuarioRepository.save(empleado11);
		usuarioRepository.save(empleado12);
		usuarioRepository.save(empleado13);*/
		
		//////////////////////////////////
		
		/*Usuario cliente21 = new Usuario();
		cliente21.setUsername("cliente21");
		cliente21.setPassword( bcpe.encode("cliente") );
		cliente21.setEnable(true);
		cliente21.setSegmento(Segmento.CLIENTE);
		cliente21.setIdSegmento(21);
		
		Usuario cliente22 = new Usuario();
		cliente22.setUsername("cliente22");
		cliente22.setPassword( bcpe.encode("cliente") );
		cliente22.setEnable(true);
		cliente22.setSegmento(Segmento.CLIENTE);
		cliente22.setIdSegmento(22);
		
		Usuario cliente23 = new Usuario();
		cliente23.setUsername("cliente23");
		cliente23.setPassword( bcpe.encode("cliente") );
		cliente23.setEnable(true);
		cliente23.setSegmento(Segmento.CLIENTE);
		cliente23.setIdSegmento(23);
		
		Usuario cliente24 = new Usuario();
		cliente24.setUsername("cliente24");
		cliente24.setPassword( bcpe.encode("cliente") );
		cliente24.setEnable(true);
		cliente24.setSegmento(Segmento.CLIENTE);
		cliente24.setIdSegmento(24);
		
		Usuario empleado21 = new Usuario();
		empleado21.setUsername("empleado21");
		empleado21.setPassword( bcpe.encode("empleado") );
		empleado21.setEnable(true);
		empleado21.setSegmento(Segmento.EMPLEADO);
		empleado21.setIdSegmento(21);
		
		Usuario empleado22 = new Usuario();
		empleado22.setUsername("empleado22");
		empleado22.setPassword( bcpe.encode("empleado") );
		empleado22.setEnable(true);
		empleado22.setSegmento(Segmento.EMPLEADO);
		empleado22.setIdSegmento(22);
		
		Usuario empleado23 = new Usuario();
		empleado23.setUsername("empleado23");
		empleado23.setPassword( bcpe.encode("empleado") );
		empleado23.setEnable(true);
		empleado23.setSegmento(Segmento.EMPLEADO);
		empleado23.setIdSegmento(23);
		
		// ROLE_CUSTOMER, ROLE_EMPLOYEE, ROLE_ADMIN
		cliente21.addAuthority("ROLE_CUSTOMER");
		cliente22.addAuthority("ROLE_CUSTOMER");
		cliente23.addAuthority("ROLE_CUSTOMER");
		cliente24.addAuthority("ROLE_CUSTOMER");
		
		empleado21.addAuthority("ROLE_EMPLOYEE");
		empleado22.addAuthority("ROLE_EMPLOYEE");
		empleado23.addAuthority("ROLE_EMPLOYEE");
		
		// ACCESS_
		cliente21.addAuthority("ACCESS_DESC");
		cliente22.addAuthority("ACCESS_PROMO");
	
		usuarioRepository.save(cliente21);
		usuarioRepository.save(cliente22);
		usuarioRepository.save(cliente23);
		usuarioRepository.save(cliente24);
		
		usuarioRepository.save(empleado21);
		usuarioRepository.save(empleado22);
		usuarioRepository.save(empleado23);*/
		
		///////////////////////////////////
		
		/*Usuario cliente25 = new Usuario();
		cliente25.setUsername("Juan25");
		cliente25.setPassword( bcpe.encode("cliente") );
		cliente25.setEnable(true);
		cliente25.setSegmento(Segmento.CLIENTE);
		cliente25.setIdSegmento(25);
		
		
		Usuario empleado24 = new Usuario();
		empleado24.setUsername("marcosg24");
		empleado24.setPassword( bcpe.encode("empleado") );
		empleado24.setEnable(true);
		empleado24.setSegmento(Segmento.EMPLEADO);
		empleado24.setIdSegmento(24);
		
		
		// ROLE_CUSTOMER, ROLE_EMPLOYEE, ROLE_ADMIN
		cliente25.addAuthority("ROLE_CUSTOMER");

		
		empleado24.addAuthority("ROLE_EMPLOYEE");

		
		// ACCESS_
		cliente25.addAuthority("ACCESS_DESC");
	
		usuarioRepository.save(cliente25);
		
		usuarioRepository.save(empleado24);*/

	}

}
