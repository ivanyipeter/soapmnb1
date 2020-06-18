package com.example.soapmnb.client;

import hu.mnb.webservices.GetCurrenciesRequestBody;
import hu.mnb.webservices.GetCurrenciesResponseBody;
import hu.mnb.webservices.GetCurrencyUnitsResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class MnbClient extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }

    public GetCurrenciesResponseBody getCurrencies() {
        GetCurrenciesRequestBody request = new GetCurrenciesRequestBody();
        GetCurrenciesResponseBody response = (GetCurrenciesResponseBody) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }


}
