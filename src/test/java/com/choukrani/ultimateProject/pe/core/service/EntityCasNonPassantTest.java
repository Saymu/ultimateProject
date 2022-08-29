package com.choukrani.ultimateProject.pe.core.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.choukrani.ultimateProject.pe.core.service.donnees.Entity;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureWebTestClient(timeout = "1800000")
@AutoConfigureTestDatabase
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EntityCasNonPassantTest {
	
	private final ClientTest clientTest;

    public EntityCasNonPassantTest(@Autowired ClientTest clientTest) {
        this.clientTest = clientTest;
    }

    @Test
    @Order(value = 1)
    public void lireAvecCodeInexistant() {
        // On appelle le service pour lire une activité depuis son code
        clientTest.get("INEXISTANT")
                .expectStatus().isNotFound()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class);
    }

    @Test
    @Order(value = 2)
    public void modifierAvecUnCodeInexistant() {
        // On modifie une activité
        final Entity entity = clientTest.get("INEXISTANT", "Nouvelle activité - libellé modifié");
        clientTest.modify(entity)
                .expectStatus().isNotFound()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class);
    }

    @Test
    @Order(value = 3)
    public void supprimerAvecUnCodeInexistant() {
        // On modifie une activité
        clientTest.delete("INEXISTANT")
                .expectStatus().isNotFound()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
        ;
    }

    @Test
    @Order(value = 4)
    public void creerSansCode() {
        final var activiteEnquetee = clientTest.get(null, "Libellé d'activité sans code");
        clientTest.add(activiteEnquetee)
                .expectStatus().isBadRequest()
                .expectHeader().contentType(MediaType.APPLICATION_JSON);
    }

    @Test
    @Order(value = 5)
    public void creerAvecUnCodeDejaExistant() {
        final Entity entity = clientTest.get("OFFRE", "Libellé d'une activité dont le code existe déjà");
        clientTest.add(entity)
                .expectStatus().isBadRequest()
                .expectHeader().contentType(MediaType.APPLICATION_JSON);
    }

}
