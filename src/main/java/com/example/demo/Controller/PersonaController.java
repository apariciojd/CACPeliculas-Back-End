package com.example.demo.Controller;

import com.example.demo.Model.Persona;
import com.example.demo.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/")
    public String muestrePersona(){
        return "Este es el inicio de la lista de persona";
    }

    @GetMapping("/mostrar")
    public List<Persona> getPersona(){
        return personaRepository.findAll();
    }

    @PostMapping("/guardar")
    public String savePersona(@RequestBody Persona persona){
        personaRepository.save(persona);
        return "Persona guardada";
    }

    @PutMapping("/modificar/{id}")
    public String modificarPersona(@PathVariable long id, @RequestBody Persona persona){
        Persona modificarPersona = personaRepository.findById(id).get();
        modificarPersona.setNombre(persona.getNombre());
        modificarPersona.setApellido(persona.getApellido());
        modificarPersona.setDni(persona.getDni());
        modificarPersona.setEdad(persona.getEdad());
        personaRepository.save(modificarPersona);
        return "Persona modificada";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable long id){
        Persona eliminarPersona = personaRepository.findById(id).get();
        personaRepository.delete(eliminarPersona);
        return "Persona eliminada";
    }

}
