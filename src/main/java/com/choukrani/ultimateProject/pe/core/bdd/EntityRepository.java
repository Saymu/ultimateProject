package com.choukrani.ultimateProject.pe.core.bdd;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.choukrani.ultimateProject.pe.core.bdd.donnees.EntityOP;

@Repository
public interface EntityRepository {
	
	Optional<EntityOP> findByCode(String Code);
	
	void delete(EntityOP op);
	
	EntityOP save(EntityOP op);
	
	List<EntityOP> findAll();

}
