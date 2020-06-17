package com.example.soapmnb;

import com.example.soapmnb.connector.SoapConnector;
import com.example.soapmnb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SoapmnbApplication {


    public static void main(String[] args) {
        SpringApplication.run(SoapmnbApplication.class, args);

//        GetCurrencyUnitsRequestBody request = new GetCurrencyUnitsRequestBody();
//        request.getCurrencyNames();
//
//
//        System.out.println(soapConnector.getDefaultUri());
//
//        GetCurrencyUnitsResponseBody response = (GetCurrencyUnitsResponseBody) soapConnector.callWebService("http://www.mnb.hu/arfolyamok.asmx?singleWsdl", request);
//        System.out.println(response);


    }

    @Bean
    CommandLineRunner lookup(SoapConnector soapConnector) {
        return args -> {
            GetCurrentExchangeRatesResponseBody responseBody = soapConnector.getCurrentExchangeRatesResponseBody();
            System.out.println(responseBody);

        };

    }
}
