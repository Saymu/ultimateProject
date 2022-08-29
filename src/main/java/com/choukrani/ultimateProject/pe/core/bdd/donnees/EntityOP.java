package com.choukrani.ultimateProject.pe.core.bdd.donnees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENTITY")
public class EntityOP {
	
	@Column (name = "CODE", nullable = false)
	private String code;
	
	@Column (name = "CODE", nullable = false)
	private String libelle;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
