/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sv.ues.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import sv.ues.utils.HibernateUtil;

/**
 * 
 * @author Carlos A
 */
public class BaseDao {
    
    protected static HibernateUtil hibernateUtil = new HibernateUtil();
    protected static SessionFactory sessionFactory;
    protected static Session sesion;
    protected static  Transaction tx;

    public BaseDao() {
        sesion = null;
        tx = null;
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    
    
    /**
     * Inicia la session para obtener la conexion
     * @throws HibernateException Captura un error en caso de ocurrir
     */
    protected void iniciar() throws HibernateException {
        
        try {
            if (sesion == null) {
                sesion = sessionFactory.openSession();
            }else{
                sesion = sessionFactory.getCurrentSession();
            }
            
            if ( tx == null || tx.getStatus() != TransactionStatus.ACTIVE ) {
                tx = sesion.beginTransaction();
            }
            System.out.println("\nIniciando session\n");
        } catch (HibernateException t) {
            System.err.println("Error al obtener sesion. ");
            t.printStackTrace();
        }
    }
    
    /**
     * Cierra sesion y hace commit a los cambios
     */
    protected void completado(){
        sesion.getTransaction().commit();
        cerrar();
    }
    
    /**
     * Solamente cierra la session
     */
    protected void cerrar(){
        sesion.close();
    }
    
    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrio un error en la capa DAO", he);
    }
}
