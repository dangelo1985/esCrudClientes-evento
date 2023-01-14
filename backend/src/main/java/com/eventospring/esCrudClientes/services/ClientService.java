package com.eventospring.esCrudClientes.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventospring.esCrudClientes.dto.ClientDTO;
import com.eventospring.esCrudClientes.entities.Client;
import com.eventospring.esCrudClientes.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		List<ClientDTO> listDto = list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		/*
		 * List<ClientDTO> listDTO = new ArrayList<>();
		 * 
		 * for(Client cli : list) { listDTO.add(new ClientDTO(cli)); }
		 */
		return listDto;
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findBYId(Long id){
		
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.get();
		
		return new ClientDTO(entity);
		
	}

	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO update(long id, ClientDTO dto) {
		Client entity = repository.getOne(id);
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
}
