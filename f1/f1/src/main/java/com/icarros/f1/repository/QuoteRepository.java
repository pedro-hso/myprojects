package com.icarros.f1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.icarros.f1.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {
}
