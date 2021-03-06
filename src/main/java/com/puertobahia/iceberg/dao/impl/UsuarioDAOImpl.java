/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.UsuarioDAO;
import com.puertobahia.iceberg.entity.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Full Stack JavaScrip
 */
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Usuario> getAllUsuario() {
        Criteria crit = getSession().createCriteria(Usuario.class);
        crit.setFetchMode("zona", FetchMode.JOIN);
        return crit.list();
    }

    @Override
    public Usuario getById(Long id) {
        return (Usuario) getSession()
                .createCriteria(Usuario.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Usuario usuario) {
        getSession().saveOrUpdate(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        getSession().delete(usuario);
    }

    @Override
    public void save(Usuario usuario) {
        getSession().update(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        getSession().update(usuario);

    }

}
