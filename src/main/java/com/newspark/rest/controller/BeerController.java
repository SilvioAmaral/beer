package com.newspark.rest.controller;

import com.newspark.rest.model.Beer;
import com.newspark.rest.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Slf4j
@Controller
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/getBeerById")
    @ResponseBody
    public Beer getBeerById(UUID id) {
        log.debug("Get beer by Id called" );

        return beerService.getBeerById(UUID.randomUUID());
    }
}
