package com.devsuperior.exercises.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.exercises.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birth_Date;
	private Integer children;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant birth_Date, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birth_Date = birth_Date;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birth_Date = entity.getBirth_Date();
		this.children = entity.getChildren();
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

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirth_Date() {
		return birth_Date;
	}

	public void setBirth_Date(Instant birth_Date) {
		this.birth_Date = birth_Date;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
}
