package com.choukrani.ultimateProject.pe.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.choukrani.ultimateProject.pe.core.service.donnees.Entity;

@RestController
public class EntityControllerImpl implements EntityController {
	
	@Autowired
	public EntityControllerImpl() {
		super();
	}

	@Override
	public Entity getEntity(String code, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity addEntity(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity modifyEntity(String code, Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(String code) {
		// TODO Auto-generated method stub

	}

}
