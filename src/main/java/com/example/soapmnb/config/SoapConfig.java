package com.example.soapmnb.config;

import com.example.soapmnb.client.MnbClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("hu.mnb.webservices");
        return marshaller;
    }

    @Bean
    public MnbClient soapConnector(Jaxb2Marshaller marshaller) {
        MnbClient client = new MnbClient();
        client.setDefaultUri("http://www.mnb.hu/arfolyamok.asmx?singleWsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
