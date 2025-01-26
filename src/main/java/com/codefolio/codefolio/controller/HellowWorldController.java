package com.codefolio.codefolio.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello Controller", description = "API for Hello World")
public class HellowWorldController {
    @GetMapping("/hello")
    @Operation(summary = "Say Hello", description = "Returns a simple Hello message")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
