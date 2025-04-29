package com.newspark.rest.service;

import com.newspark.rest.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        log.debug(MessageFormat.format("My request log {0}", id));
        return Beer.builder()
                .id(id)
                .style("IPA")
                .upc("1233421")
                .name("Skol")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(988)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();
    }
}
