package com.deployteste.testededeploy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteControllerTest {
    TesteController testeController;
    @BeforeEach
    void criarControler(){
        testeController = new TesteController();
    }

    @Test
    void deveRetornarNome(){
        assertEquals("Hello William", testeController.hellWorld("William"));
    }

    @Test
    void deveRetornarWorld(){
        assertEquals("Hello ", testeController.hellWorld(""));
    }
}
