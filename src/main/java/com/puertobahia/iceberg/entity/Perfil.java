/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Full Stack JavaScrip
 */
@Entity
@Table(name = "perfiles")
public class Perfil implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "perfiles_acciones",
            joinColumns = {
                @JoinColumn(name = "perfiles_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "acciones_id")})
    private List<Accion> acciones;

    @OneToMany(mappedBy = "perfil")
    private List<Usuario> usuarios;


}