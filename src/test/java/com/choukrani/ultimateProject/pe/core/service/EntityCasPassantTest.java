package com.choukrani.ultimateProject.pe.core.service;

import org.junit.jupiter.api.DisplayName;
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
public class EntityCasPassantTest {
	
	private final ClientTest clientTest;

    public EntityCasPassantTest(@Autowired ClientTest clientTest) {
        this.clientTest = clientTest;
    }


    @Test
    @Order(value = 1)
    public void getAll() {
        // On appelle le service pour lister les activités
        clientTest.getAll()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Entity.class)
                .hasSize(13);
    }

    @Test
    @Order(value = 2)
    public void lire() {
        // On appelle le service pour lire une activité depuis son code
        clientTest.get("RDV_DE")
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class)
                .value(act -> assertThat("Code attendu", act.getCode(), is(equalTo("RDV_DE"))))
                .value(act -> assertThat("Libellé attendu", act.getLibelle(), is(equalTo("Rendez-vous DE"))));
    }

    @Test
    @Order(value = 3)
    public void creer() {
        // On crée une activité
        final Entity entity = clientTest.get("NEW", "Nouvelle activité - libellé");
        clientTest.add(entity)
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class)
                .value(act -> assertThat("Code attendu", act.getCode(), is(equalTo("NEW"))))
                .value(act -> assertThat("Libellé attendu", act.getLibelle(), is(equalTo("Nouvelle activité - libellé"))));
    }

    @Test
    @Order(value = 4)
    public void modifier() {
        // On récupère l'activité
        final Entity entity = clientTest.get("FORMATION", "Nouveau libellé Formation");
        clientTest.modify(entity)
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class)
                .value(act -> assertThat("Code attendu", act.getCode(), is(equalTo("FORMATION"))))
                .value(act -> assertThat("Libellé attendu après modification", act.getLibelle(), is(equalTo("Nouveau libellé Formation"))));
    }

    @Test
    @Order(value = 5)
    public void supprimer() {
        clientTest.delete("PRESTATION")
                .expectStatus().isOk()
                .expectBody()
                .isEmpty();
    }

    @Test
    @Order(value = 6)
    public void lireObsolete() {
        clientTest.get("PRESTATION")
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Entity.class)
                .value(act -> assertThat("Code attendu", act.getCode(), is(equalTo("PRESTATION"))))
                // TODO : attention ne fonctionne pas si plusieurs modifications (et donc histo) le même jour !!
                .value(act -> assertThat("Libellé attendu", act.getLibelle(), is(equalTo("Prestation"))));
    }

}
