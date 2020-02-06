package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CasaShow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String enderecoCasa;
	
	private int numeroCasa;
	
	private String cidadeCasa;
	
	
	private String nomeCasa;

	public String getEnderecoCasa() {
		return enderecoCasa;
	}

	public void setEnderecoCasa(String enderecoCasa) {
		this.enderecoCasa = enderecoCasa;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCidadeCasa() {
		return cidadeCasa;
	}

	public void setCidadeCasa(String cidadeCasa) {
		this.cidadeCasa = cidadeCasa;
	}

	public String getNomeCasa() {
		return nomeCasa;
	}

	public void setNomeCasa(String nomeCasa) {
		this.nomeCasa = nomeCasa;
	}

	

	
}
