package com.vmware.tracker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PingController.class)
@TestPropertySource(properties = { "greeting.message=Spring Boot + Tanzu!" })
class PingControllerTest {

    @Autowired
    private PingController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void ping() throws Exception {
        assertEquals("Greetings! Pinging you again from Spring Boot + Tanzu!", controller.ping());

        mockMvc
            .perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Greetings! Pinging you again from Spring Boot + Tanzu!"));
    }
}
