package fr.eni.votreProjet.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccueilRestController {

	@GetMapping("/accueil")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello world ! ");
	}
	
}
