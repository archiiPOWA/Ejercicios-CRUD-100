package com.crudclientes.proyecto1Clientes.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personas")
@ToString
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String  telefono;
    private String  direccion;

}
