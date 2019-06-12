package com.icarros.f1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.icarros.f1.model.Quote;
import com.icarros.f1.model.Results;
import com.icarros.f1.repository.QuoteRepository;
import com.icarros.f1.repository.ResultsRepository;

@SpringBootApplication
@PropertySource(value = { "application.properties" })
public class F1Application {

	public static void main(String[] args) {
		SpringApplication.run(F1Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Autowired
	Environment env;

	@Autowired
	QuoteRepository quoteRepository;

	@Autowired
	ResultsRepository resultsRepository;

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String response = restTemplate.getForObject(env.getProperty("api.url"), String.class);
			Gson gson = new GsonBuilder().create();
			Quote quote = gson.fromJson(response, Quote.class);

//			quoteRepository.save(quote);
//			System.out.println(quoteRepository.findAll());

			ArrayList<Results> results = quote.getMRData().getRaceTable().getRaces().get(0).getResults();
//			resultsRepository.saveAll(results);
			System.out.println(resultsRepository.findByNumber("77"));
			System.out.println(resultsRepository.findAll());
		};
	}
}
