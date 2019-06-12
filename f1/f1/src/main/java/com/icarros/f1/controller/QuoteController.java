package com.icarros.f1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.icarros.f1.model.Quote;
import com.icarros.f1.repository.QuoteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("v1/api/quote")
@Api(value = "Quote", description = "Todos os dados retornados pelo json", tags = { "Quote" })
public class QuoteController {

	@Autowired
	QuoteRepository repository;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Buscar todos os itens")
	@ResponseStatus(HttpStatus.OK)
	public List<Quote> show() {
		return repository.findAll();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Salvar")
	public ResponseEntity<Quote> save(@RequestBody Quote quote) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(quote));
	}
}