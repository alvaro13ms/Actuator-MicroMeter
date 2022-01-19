package com.example.actuatorserver;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RestControllerEndpoint(id="customEndpoint")
@SpringBootApplication
public class CustomEndpoint {
	
	@GetMapping("/random")
	@RequestMapping("/random")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}

}

/*
 * 
 * },
 * 
 * "customendpoint":{
	"href":"http://localhost:8080/actuator/customEndpoint",
	"templated":false
}*/
