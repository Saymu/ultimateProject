package com.choukrani.ultimateProject.pe.core.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.choukrani.ultimateProject.pe.core.service.donnees.Entity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RequestMapping("/chemin")
public interface EntityController {
	
	@Operation(summary = "Lire une entite", description = "Lit une entite depuis son code.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "204", description = "No content"),
            @ApiResponse(responseCode = "200", description = "Ok")
    })
    @GetMapping(path = "{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    Entity getEntity(@Parameter(description = "Code  entity.") @PathVariable("code") String code,
                                          @Parameter(description = "Date de la recherche au format YYYYMMDD.") @RequestParam(value = "date", required = false) final String date);

    @Operation(summary = "Lister les entites", description = "Liste les entites.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "204", description = "No content"),
            @ApiResponse(responseCode = "200", description = "Ok")
    })
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<Entity> getEntities();

    @Operation(summary = "Ajouter une entite", description = "Ajoute une entite.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "409", description = "Conflict"),
            @ApiResponse(responseCode = "200", description = "Ok")
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Entity addEntity(@RequestBody Entity entity);

    @Operation(summary = "Modifier une entite", description = "Modifie une entite.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "409", description = "Conflict"),
            @ApiResponse(responseCode = "200", description = "Ok")})
    @PutMapping(path = "{code}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Entity modifyEntity(@Parameter(description = "code de l'entite.") @PathVariable("code") String code, @RequestBody Entity entity);

    @Operation(summary = "Supprimer une entite", description = "Supprime une entite.")
    @ApiResponses(value = {@ApiResponse(responseCode = "400", description = "Bad request"), @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "200", description = "Ok")})
    @DeleteMapping(path = "{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    void deleteEntity(@Parameter( description = "code de l'entite.") @PathVariable("code") String code);

}
