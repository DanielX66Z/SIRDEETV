/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.ues.dominio.PerfilInv;

import sv.ues.utils.HibernateUtil;

/**
 *
 * @author PC
 */
public class PerfilInvestigacionDao {
     private HibernateUtil hibernateUtil = new HibernateUtil();
    private SessionFactory sessionFactory = hibernateUtil. getSessionFactory();
    private Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException 
    {
	sesion = sessionFactory.openSession() ;
	tx = sesion.beginTransaction() ;
    }
    
    //excepcion
    private void manejaExcepcion(HibernateException he) throws HibernateException 
    {
	tx.rollback();
	throw new HibernateException( "Ocurrió un error en la capa DAO" , he);
    }
    
     //insertar una nueva investacion
    public void registrar(PerfilInv perfilInv) throws Exception {
      
        try {
            iniciaOperacion();
            sesion.save(perfilInv);
            sesion.flush();
            tx.commit();

        } catch (HibernateException he) {
            tx.rollback();
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
    //obtener todas las investigaciones
    public List<PerfilInv> obtenerPerfilesInv() throws Exception {
        try{
        iniciaOperacion();
        CriteriaQuery criteria = sesion.getCriteriaBuilder().createQuery(PerfilInv.class);
        criteria.from(PerfilInv.class);
        List<PerfilInv> perfilInves = sesion.createQuery(criteria).getResultList();
        return perfilInves;
        }catch(HibernateException e){
            throw e;
        }finally{
        sesion.close();
        
        }
    }
    
    
  
    
    
    //modificar una investifacion
    
     public void actualizarPerfilInv(PerfilInv perfilInv) throws Exception {
        
        try {
            iniciaOperacion();
            sesion.update(perfilInv);
            sesion.flush();
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
    
        
    
    //desactivar una investigacion
    
    
    
    
    
}
