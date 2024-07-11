package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PersonaCrud")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String dni;

    @Column
    private int edad;

    // Constructor sin argumentos
    public Persona() {
    }

    // Constructor con argumentos
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
}
