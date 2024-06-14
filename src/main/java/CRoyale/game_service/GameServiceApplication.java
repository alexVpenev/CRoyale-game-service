package CRoyale.game_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GameServiceApplication {

	@GetMapping({"/"})
	public String helloWorld() {
		return "CRoyale Game Service";
	}

	public static void main(String[] args) {
		SpringApplication.run(GameServiceApplication.class, args);
	}

}
