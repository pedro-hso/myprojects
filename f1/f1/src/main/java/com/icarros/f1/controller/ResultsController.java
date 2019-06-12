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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.icarros.f1.model.Results;
import com.icarros.f1.repository.ResultsRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("v1/api/results")
@Api(value = "Results", description = "Detalhamento por resultado", tags = { "Results" })
public class ResultsController {

	@Autowired
	ResultsRepository repository;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Buscar resultados pelo número do carro/piloto (deixe em branco para buscar todos)")
	@ResponseStatus(HttpStatus.OK)
	public List<Results> listByNumber(@RequestParam(required = false) String number) {
		if (number != null && !number.isEmpty()) {
			return repository.findByNumber(number);
		} else {
			return repository.findAll();
		}
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Salvar resultados")
	public ResponseEntity<Results> save(@RequestBody Results results) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(results));
	}
}
