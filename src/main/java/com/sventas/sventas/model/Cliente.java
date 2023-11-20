package com.sventas.sventas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer idCliente;
    @Column(name="nombres", nullable = false,length = 70)
    @Getter
    @Setter
    private String nombres;

    @Column(name="apellidos", nullable = false,length = 70)
    @Getter
    @Setter
    private String apellidos;

    @Column(name="direccion", nullable = true,length = 150)
    @Getter
    @Setter
    private String direccion;

    @Column(name="telefono", nullable = true,length = 10)
    @Getter
    @Setter
    private String telefono;

    @Column(name="email", nullable = true,length = 55)
    @Getter
    @Setter
    private String email;
}
