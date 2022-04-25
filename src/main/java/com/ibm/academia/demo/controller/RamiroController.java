package com.ibm.academia.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RamiroController {
	@GetMapping("/saludo")
	public ResponseEntity<String> saludoRamiro(){
		return ResponseEntity.ok("Hola a todos!");
	}

}
