package com.josias.reservation.resources;

import com.josias.reservation.model.Client;
import com.josias.reservation.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class to represent Client Web Service
 */
@RestController
@RequestMapping("/api/client")
public class ClientResources {
    private final ClientService clientService;

    public ClientResources(ClientService clientService) {
        this.clientService = clientService;
    }

    public ResponseEntity<Client> createClient() {

    }
}
