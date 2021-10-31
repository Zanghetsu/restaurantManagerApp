package com.restaurantmanager.usermanager;

import com.restaurantmanager.usermanager.appuser.AppUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<AppUser> hello(){
		return List.of(
				new AppUser( 1, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990,12,1)),
				new AppUser( 2, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990,12,1))
		);
	}

}
