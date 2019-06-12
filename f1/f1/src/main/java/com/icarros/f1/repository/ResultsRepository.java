package com.icarros.f1.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.icarros.f1.model.Results;

public interface ResultsRepository extends MongoRepository<Results, String> {

	public List<Results> findByNumber(String number);
}
