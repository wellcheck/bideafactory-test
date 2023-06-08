package com.bidea.bideafactory.service;

import com.bidea.bideafactory.dto.CLienteDTO;
import com.bidea.bideafactory.entities.Cliente;
import com.bidea.bideafactory.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        List<Cliente> result = clienteRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(result).getBody();
    }

    public List<Cliente> save(Cliente cliente) {
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll()).getBody();
    }



    public List<Cliente> delete(Long id) {
    clienteRepository.deleteById(id);
    return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll()).getBody();
    }



}
