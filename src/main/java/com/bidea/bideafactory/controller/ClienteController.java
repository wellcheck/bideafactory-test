package com.bidea.bideafactory.controller;


import com.bidea.bideafactory.entities.Cliente;
import com.bidea.bideafactory.repository.ClienteRepository;
import com.bidea.bideafactory.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(value = "/listar")
    public List<Cliente> findAll(){
        var result = clienteService.findAll();
        return result;
    }

    @PostMapping(value = "/cadastrar")
    public List<Cliente> cadastro(@RequestBody Cliente cliente){
       clienteService.save(cliente);
       return clienteRepository.findAll();

    }

    @DeleteMapping("/{id}")
    public List<Cliente> deletar(@PathVariable Long id){
    clienteService.delete(id);
    return clienteRepository.findAll();
    }
}
