package org.gerdoc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "USUARIO")
public class Usuario
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String nombre;

    @Column(name = "PASSWORD")
    private Integer password;

    @Column(name = "ROL_ID")
    private Double rol_id;

    @Column(name = "ALUMNO_ID")
    private Double alumno_id;

    @Column(name = "PROFESOR_ID")
    private Double profesor_id;
}