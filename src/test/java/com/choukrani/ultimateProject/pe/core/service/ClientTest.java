package com.choukrani.ultimateProject.pe.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.choukrani.ultimateProject.pe.core.service.donnees.Entity;

import org.springframework.http.MediaType;

@Component
public class ClientTest {
	
	private final WebTestClient webTestClient;

	public ClientTest(@Autowired WebTestClient webTestClient) {
		this.webTestClient = webTestClient;
	}

    public WebTestClient.ResponseSpec get(String code) {
        var uri = webTestClient.get()
                .uri("/chemin/" + code)
                .accept(MediaType.APPLICATION_JSON);
        return uri.exchange();
    }
    
    public WebTestClient.ResponseSpec getAll() {
        var uri = webTestClient.get()
                .uri("/chemin")
                .accept(MediaType.APPLICATION_JSON);
        return uri.exchange();
    }

    public WebTestClient.ResponseSpec add(Entity entity) {
        var uri = webTestClient.post()
                .uri("/chemin")
                .bodyValue(entity)
                .header("Content-type", MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON);
        return uri.exchange();
    }

    public WebTestClient.ResponseSpec modify(Entity entity) {
        var uri = webTestClient.put()
                .uri("/chemin/" + entity.getCode())
                .bodyValue(entity)
                .header("Content-type", MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON);
        return uri.exchange();
    }

    public WebTestClient.ResponseSpec delete(String code) {
        var uriDelete = webTestClient.delete()
                .uri("/chemin/" + code)
                .header("Content-type", MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON);
        return uriDelete.exchange();
    }

    public Entity get(String code, String libelle) {
        final var entity = new Entity();
        entity.setCode(code);
        entity.setLibelle(libelle);
        return entity;
    }

}
