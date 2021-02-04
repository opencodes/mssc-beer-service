package com.rkjha.msscbeerservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + UUID.randomUUID())
                .accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeerById() {
    }
}