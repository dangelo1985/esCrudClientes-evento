package com.eventospring.esCrudClientes.dto;

import java.io.Serializable;

import com.eventospring.esCrudClientes.entities.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	
	public ClientDTO() {
		
	}

	public ClientDTO(Long id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}
	
	public ClientDTO(Client entitie) {
		this.id = entitie.getId();
		this.name = entitie.getName();
		this.cpf = entitie.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
