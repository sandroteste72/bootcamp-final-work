package com.sandroarpi.bdsfinalwork.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandroarpi.bdsfinalwork.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		Instant birthDate = Instant.parse("1972-11-20T16:30:00Z");
		list.add(new Client(1L, "Sandro Arpi", "111.111.111-11", 7500.00, birthDate , 2));
		return ResponseEntity.ok().body(list);
	}

}
