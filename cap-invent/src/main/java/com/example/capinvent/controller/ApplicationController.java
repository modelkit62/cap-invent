package com.example.capinvent.controller;

import com.example.capinvent.beans.Frutas;
import com.example.capinvent.beans.Item;
import com.example.capinvent.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/hello")
@Lazy
public class ApplicationController {

    private Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ApplicationService applicationService;


    @GetMapping("/{id}")
    public ResponseEntity<String> deleteCostumer(@PathVariable String id){

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(new Object())
                .toUri();
        logger.trace(uri.toString());

        Comparator<String> comparator = ((o1, o2) -> Integer.compare(o1.length(), o2.length()));



        return ResponseEntity.created(uri).build();
    }

    @PostMapping
    public void create(@RequestBody List<Frutas> fruits){


        Frutas frutas = fruits.get(0);
        String fruta = frutas.getFruta();
        System.out.println(fruta);
    }

}
