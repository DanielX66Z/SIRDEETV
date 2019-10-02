/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import sv.ues.dominio.Investigacion;

import sv.ues.utils.HibernateUtil;

/**
 *
 * @author PC
 */
public class InvestigacionDao {
    private HibernateUtil hibernateUtil = new HibernateUtil();
    private SessionFactory sessionFactory = hibernateUtil. getSessionFactory();
    private Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException 
    {
	sesion = sessionFactory.openSession() ;
	tx = sesion.beginTransaction() ;
    }
    
    private void manejaExcepcion(HibernateException he) throws HibernateException 
    {
	tx.rollback();
	throw new HibernateException( "Ocurrió un error en la capa DAO" , he);
    }
    
    public List<Investigacion> getInvestiagacionByActivo()
    {
        
        iniciaOperacion();
        CriteriaBuilder builder = sesion.getCriteriaBuilder();
        CriteriaQuery<Investigacion> query = builder.createQuery(Investigacion.class);
        Root<Investigacion> root = query.from(Investigacion.class);
        query.select(root).where(builder.equal(root.get("estadoInvest"), true));
        Query<Investigacion> q = sesion.createQuery(query);
        List<Investigacion> investigacion = q.getResultList();
        sesion.close();
        return investigacion;
    }
    
    public void getInvestigaciones(int key){
        iniciaOperacion();
        CriteriaBuilder builder = sesion.getCriteriaBuilder();
       
        sesion.find(Investigacion.class,key);
    }
    
    
}
