package com.example.demo223.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class teste {
    @GetMapping("/soma")
    public ResponseEntity<Double> soma(@RequestParam double num1, @RequestParam double num2) {
        double resultado = num1 + num2;
        return ResponseEntity.ok(resultado);
    }

    @PostMapping("/divisao")
    public ResponseEntity<Double> divisao(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return ResponseEntity.badRequest().body(null);
        }
        double resultado = num1 / num2;
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/potencia")
    public ResponseEntity<Double> potencia(@RequestParam double base, @RequestParam double expoente) {
        double resultado = Math.pow(base, expoente);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/subtracao")
    public ResponseEntity<Double> subtracao(@RequestParam double num1, @RequestParam double num2) {
        double resultado = num1 - num2;
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/multiplicacao")
    public ResponseEntity<Double> multiplicacao(@RequestParam double num1, @RequestParam double num2) {
        double resultado = num1 * num2;
        return ResponseEntity.ok(resultado);
    }



}
