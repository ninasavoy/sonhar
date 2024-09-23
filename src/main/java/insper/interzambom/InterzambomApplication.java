package insper.interzambom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InterzambomApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterzambomApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
