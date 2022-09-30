package guru.springframework.jokesapplication;

import guru.springframework.jokesapplication.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(JokesApplication.class, args);

		JokesController jokesController = (JokesController) ctx.getBean("jokesController");
		System.out.println(jokesController.getRandomQuote());

	}

}
