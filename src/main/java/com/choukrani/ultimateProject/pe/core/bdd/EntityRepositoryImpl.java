package com.choukrani.ultimateProject.pe.core.bdd;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.choukrani.ultimateProject.pe.core.bdd.donnees.EntityOP;

@Component
public class EntityRepositoryImpl implements EntityRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Optional<EntityOP> findByCode(String Code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EntityOP op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityOP save(EntityOP op) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityOP> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
