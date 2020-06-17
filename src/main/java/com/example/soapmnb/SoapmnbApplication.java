package com.example.soapmnb;

import com.example.soapmnb.connector.SoapConnector;
import hu.mnb.webservices.GetCurrentExchangeRatesResponseBody;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SoapmnbApplication {


    public static void main(String[] args) {
        SpringApplication.run(SoapmnbApplication.class, args);
        
    }

    @Bean
    CommandLineRunner lookup(SoapConnector soapConnector) {
        return args -> {

        };

    }
}
