package com.deployteste.testededeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TesteController {

    @GetMapping("/teste")
    public String hellWorld(@RequestParam(defaultValue = "World") String nome){
        return String.format("olá %s", nome);
    }

}
