package com.bidea.bideafactory.controller;

import com.bidea.bideafactory.dto.ReservaDTO;
import com.bidea.bideafactory.entities.Cliente;
import com.bidea.bideafactory.repository.ClienteRepository;
import com.bidea.bideafactory.service.ReservaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping(value = "/listar")
    public List<Cliente> findAll(){
        var result = reservaService.findAll();
        return result;
    }

    @PutMapping("/{id}")
    public Cliente reservar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente cliente2 = clienteRepository.findById(id).get();
        BeanUtils.copyProperties(cliente, cliente2, "id");
        return clienteRepository.save(cliente2);

    }
}
