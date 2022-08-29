package com.choukrani.ultimateProject.pe.core.traitement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choukrani.ultimateProject.pe.core.bdd.EntityRepository;
import com.choukrani.ultimateProject.pe.core.bdd.donnees.EntityOP;

@Service
public class EntityTF implements IEntityTF {
	
	private static final String TYPE = "ENTITY";

    private final EntityRepository entityRepository;    

    @Autowired
    public EntityTF(EntityRepository entityRepository) {
		this.entityRepository = entityRepository;
	}

	@Override
	public EntityOP getEntity(String code) {
		
		return entityRepository.findByCode(code).orElseThrow();
	}

	@Override
	public List<EntityOP> getEntities() {
		
		return entityRepository.findAll();
	}

	@Override
	public EntityOP addEntity(String code, String libelle) {
		
		return null;
	}

	@Override
	public EntityOP modifyEntity(String refCode, String code, String libelle) {
		
		return null;
	}

	@Override
	public void deleteEntity(EntityOP op) {
		

	}

}
