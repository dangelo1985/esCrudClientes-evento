package com.eventospring.esCrudClientes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventospring.esCrudClientes.entities.Client;


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Pedro de Luca", "453.223.334-34" ));
		list.add(new Client(2L, "Jose da Silva", "222.333.444-55" ));
		
		return ResponseEntity.ok().body(list);
	}

}
