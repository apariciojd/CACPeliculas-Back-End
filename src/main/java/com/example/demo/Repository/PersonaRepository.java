package com.example.demo.Repository;

import com.example.demo.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {

}
