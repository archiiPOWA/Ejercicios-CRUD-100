package com.crudclientes.proyecto1Clientes.service;

import com.crudclientes.proyecto1Clientes.entity.Persona;
import com.crudclientes.proyecto1Clientes.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
    public Persona guardar( Persona persona){
        return personaRepository.save(persona);
    }
    public Persona obtenerPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }
    public void eliminarPorId(Long id){
        personaRepository.deleteById(id);
    }
}
