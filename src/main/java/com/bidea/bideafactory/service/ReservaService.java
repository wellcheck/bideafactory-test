package com.bidea.bideafactory.service;

import com.bidea.bideafactory.entities.Cliente;
import com.bidea.bideafactory.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> findAll() {
        List<Cliente> result = clienteRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(result).getBody();
    }


}
