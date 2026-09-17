package com.deployteste.testededeploy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerSpringTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void deveRetornarNome()throws Exception{
        mockMvc.perform(
                get("/teste").param("nome", "William")
        )
                .andExpect(status().isOk())
                .andExpect(content().string("Hello William"));
    }

    @Test
    void deveRetornarWorld()throws Exception{
        mockMvc.perform(
                get("/teste")
        )
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

}
