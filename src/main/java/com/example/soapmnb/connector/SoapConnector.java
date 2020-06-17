package com.example.soapmnb.connector;

import com.example.soapmnb.model.GetCurrencyUnitsRequestBody;
import com.example.soapmnb.model.GetCurrencyUnitsResponseBody;
import com.example.soapmnb.model.GetCurrentExchangeRatesRequestBody;
import com.example.soapmnb.model.GetCurrentExchangeRatesResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapConnector extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }

    public GetCurrentExchangeRatesResponseBody getCurrentExchangeRatesResponseBody() {

        GetCurrentExchangeRatesRequestBody requestBody = new GetCurrentExchangeRatesRequestBody();

        GetCurrentExchangeRatesResponseBody responseBody = (GetCurrentExchangeRatesResponseBody) getWebServiceTemplate().marshalSendAndReceive("http://www.mnb.hu/arfolyamok.asmx?wsdl", requestBody);

        return responseBody;

    }
}
