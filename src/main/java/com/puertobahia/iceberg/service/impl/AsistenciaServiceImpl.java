/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.AsistenciaDAO;
import com.puertobahia.iceberg.entity.Asistencia;
import com.puertobahia.iceberg.service.AsistenciaService;
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
public class AsistenciaServiceImpl implements AsistenciaService{
    
    @Autowired
    AsistenciaDAO asistenciaDAO;

    @Override
    public List<Asistencia> getAllAsistencia() {
        return asistenciaDAO.getAllAsistencia();
    }

    @Override
    public Asistencia getById(Long id) {
        return asistenciaDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Asistencia asistencia) {
        asistenciaDAO.saveOrUpdate(asistencia);
    }

    @Override
    public void delete(Long id) {
        asistenciaDAO.delete(id);
    }

    @Override
    public void save(Asistencia asistencia) {
        asistenciaDAO.save(asistencia);
    }

    @Override
    public void update(Asistencia asistencia) {
        asistenciaDAO.update(asistencia);
    }
}
