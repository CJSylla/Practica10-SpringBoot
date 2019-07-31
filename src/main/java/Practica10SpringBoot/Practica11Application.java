package Practica10SpringBoot;


import Practica10SpringBoot.servicios.UsuarioServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Dany 13/10/2017
 */

@SpringBootApplication
public class Practica11Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Practica11Application.class, args);
		UsuarioServices usuarioServices = (UsuarioServices) applicationContext.getBean("usuarioServices");
		usuarioServices.crearAdmin();
	}
}
