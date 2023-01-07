package com.eventospring.esCrudClientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventospring.esCrudClientes.entities.Client;
import com.eventospring.esCrudClientes.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		
		return repository.findAll();
	}

}
