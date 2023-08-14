package com.joycej3.backend_chips;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendChipsApplication {
    static final Logger log = LoggerFactory.getLogger(BackendChipsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BackendChipsApplication.class, args);
        log.info("Starting spring");
    }
}
