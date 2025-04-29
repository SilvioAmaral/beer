package com.newspark.rest.service;

import com.newspark.rest.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    Map<UUID, Beer> beers;

    public BeerServiceImpl() {
        this.beers = new HashMap<>();

        Beer b1 = Beer.builder()
                .id(UUID.randomUUID())
                .style("IPA")
                .upc("645234523")
                .name("Skol")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(988)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();

        Beer b2 = Beer.builder()
                .id(UUID.randomUUID())
                .style("APA")
                .upc("543543")
                .name("Kaiser")
                .price(new BigDecimal("11.99"))
                .quantityOnHand(222)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();

        Beer b3 = Beer.builder()
                .id(UUID.randomUUID())
                .style("Pilsner")
                .upc("34234423")
                .name("Original")
                .price(new BigDecimal("13.99"))
                .quantityOnHand(1234)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();

        this.beers.put(b1.getId(), b1);
        this.beers.put(b2.getId(), b2);
        this.beers.put(b3.getId(), b3);
    }

    @Override
    public Beer getBeerById(UUID id) {
        log.debug(MessageFormat.format("My request log {0}", id));
        return this.beers.get(id);
    }

    @Override
    public List<Beer> listBeers() {

        return new ArrayList<>(this.beers.values());
    }
}
