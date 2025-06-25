package com.example.bibliotheque.soap.client;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class BiblioSoapClient {
    private final WebServiceTemplate webServiceTemplate;

    public BiblioSoapClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public boolean preterLivre(Long userId, Long livreId) {
        var request = new com.example.bibliotheque.soap.schema.PreterLivreRequest();
        request.setUserId(userId);
        request.setLivreId(livreId);

        var response = (com.example.bibliotheque.soap.schema.PreterLivreResponse)
                webServiceTemplate.marshalSendAndReceive("http://localhost:8081/ws", request);
        return response.isOk();
    }
}
