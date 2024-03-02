package com.github.impostorbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestImpostorBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(ImpostorBackendApplication::main).with(TestImpostorBackendApplication.class).run(args);
    }

}
