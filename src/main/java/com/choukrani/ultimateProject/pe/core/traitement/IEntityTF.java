package com.choukrani.ultimateProject.pe.core.traitement;

import java.util.List;

import com.choukrani.ultimateProject.pe.core.bdd.donnees.EntityOP;

public interface IEntityTF {
	
	EntityOP getEntity(String code);

    List<EntityOP> getEntities();

    EntityOP addEntity(String code, String libelle);

    EntityOP modifyEntity(String refCode, String code, String libelle);

    void deleteEntity(EntityOP op);

}
