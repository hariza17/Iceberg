/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;

import com.puertobahia.iceberg.entity.Beneficiario;
import java.util.List;

/**
 *
 * @author CX612PF
 */
public interface BeneficiarioService {
    public List<Beneficiario> getAllBeneficiario();
    public Beneficiario getById(Long id);
    public void save(Beneficiario beneficiario);
    public void update(Beneficiario beneficiario);
    public void saveOrUpdate(Beneficiario beneficiario);
    public void delete(Long id);
}
