package com.newspark.rest.service;

import com.newspark.rest.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);

}
