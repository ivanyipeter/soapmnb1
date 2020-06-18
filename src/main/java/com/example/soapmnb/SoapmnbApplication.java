package com.example.soapmnb;

import com.example.soapmnb.client.MnbClient;
import hu.mnb.webservices.GetCurrenciesResponseBody;
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
    CommandLineRunner lookup(MnbClient mnbClient) {
        return args -> {
            GetCurrenciesResponseBody response = mnbClient.getCurrencies();
            System.out.println(response.getGetCurrenciesResult());
        };
    }
}
