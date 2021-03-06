package com.josias.reservation.services;

import com.josias.reservation.model.Client;
import com.josias.reservation.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Define Client Services
 * @Author Josias
 */
@Service
@Transactional(readOnly = true)
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     * Save client method
     * @param client
     * @return
     */
    @Transactional
    public Client create(Client client) {
        return this.clientRepository.save(client);
    }

    /**
     * Update Client
     * @param client
     * @return
     */
    @Transactional
    public Client update(Client client) {
        return this.clientRepository.save(client);
    }

    /**
     * Delete Client
     * @param client
     */
    @Transactional
    public void delete(Client client) {
        this.clientRepository.delete(client);
    }

    /**
     * Retrieve client by id
     * @param idCard
     * @return
     */
    public Client findByidCard(String idCard) {
        return this.clientRepository.findByIdentification(idCard);
    }
}
