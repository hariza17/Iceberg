/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.EmpleadoDAO;
import com.puertobahia.iceberg.entity.Empleado;
import com.puertobahia.iceberg.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Full Stack JavaScrip
 */
@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    EmpleadoDAO empleadoDAO;

    @Override
    public List<Empleado> getAllEmpleado() {
        return empleadoDAO.getAllEmpleado();
    }

    @Override
    public Empleado getById(Long id) {
        return empleadoDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Empleado empleado) {
        empleadoDAO.saveOrUpdate(empleado);
    }

    @Override
    public void delete(Long id) {
        empleadoDAO.delete(id);
    }

    @Override
    public void save(Empleado empleado) {
        empleadoDAO.save(empleado);
    }

    @Override
    public void update(Empleado empleado) {
        empleadoDAO.update(empleado);
    }
}
