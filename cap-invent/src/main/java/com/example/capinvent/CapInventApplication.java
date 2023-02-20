package com.example.capinvent;

import com.example.capinvent.controller_advice.StringErrorResponse;
import com.example.capinvent.controller_advice.StringNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CapInventApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapInventApplication.class, args);
	}
}
