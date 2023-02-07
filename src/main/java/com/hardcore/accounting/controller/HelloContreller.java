package com.hardcore.accounting.controller;

import com.hardcore.accounting.model.service.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloContreller {

    private AtomicLong counter = new AtomicLong();

    @GetMapping(path = "v1/greeting")
    public Greeting setHello(@RequestParam("name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hollo, %s", name));
    }
}
