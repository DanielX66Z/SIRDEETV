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
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import sv.ues.dominio.BitacoraLab;
import sv.ues.dominio.VwShowBitLab;

/**
 *
 * @author Carlos A
 */
public class BitacoraLaboratorioDao extends BaseDao {
    
    /**
     * Creates a new instance of BitacoraLaboratorio
     */
    public BitacoraLaboratorioDao() {
    }
    /**
     * Este método contiene un listado de la bitacora de laboratorio registrada
     * @return retorna un listado con los resultados
     */
    public List<BitacoraLab> obtenerListado() {
        List<BitacoraLab> bitLabo = null;
        Criteria cr;
        //CriteriaQuery query;
        
        try {
            iniciar();
            cr = sesion.createCriteria(BitacoraLab.class, "bit");
            cr.createAlias("bit.actividad", "act"); // inner join by default
            //Obteniendo listado con los datos 
            bitLabo = cr.list();
            this.completado();
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao obtenerlistado: " + e);
            //throw e;
        } finally {
            this.cerrar();
        }
        
        return bitLabo;
    }

    /**
     * Listado de bitácora de laboratorio filtrado por el vector
     * @param idVector Representa el código del vector
     * @return Un listado con los resultados solicitados
     */
    public List<BitacoraLab> obtenerListado(int idVector) {
        List<BitacoraLab> bitLabo = null;
        Criteria cr;
        
        try {
            iniciar();
            
            cr = sesion.createCriteria(BitacoraLab.class, "bit");
            cr.createAlias("bit.actividad", "act"); // inner join by default
            cr.createAlias("bit.invVector", "inv_vect"); // inner join by default
            cr.createAlias("inv_vect.vector", "vect"); // inner join by default
            cr.add(Restrictions.eq("vect.codVector", idVector))
                    .addOrder(Order.asc("codBitLab"));
            
            //Obteniendo resultados
            bitLabo = cr.list();
            
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao obtenerlistado(id): " + e);
            System.out.println("\n"+e.getLocalizedMessage());
            //throw e;
        } finally {
            completado();
        }
        
        return bitLabo;
    }
    
    /**
     * Método que devuelve los registros de una sola bitácora
     * @param idBitLab
     * @return 
     */
    public BitacoraLab mostrar(int idBitLab) {
        BitacoraLab bitLabo = null;
        Criteria cr;
        
        try {
            iniciar();
            
            cr = sesion.createCriteria(BitacoraLab.class, "bit");
            cr.createAlias("bit.actividad", "act"); // inner join by default
            cr.createAlias("bit.invVector", "inv_vect"); // inner join by default
            cr.createAlias("inv_vect.vector", "vect"); // inner join by default
            cr.add(Restrictions.eq("bit.codBitLab", idBitLab));
            
            //Obteniendo resultado único
            bitLabo = (BitacoraLab) cr.uniqueResult();
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao mostrar: " + e);
            System.out.println("\n"+e.getLocalizedMessage());
            //throw e;
        } finally {
            completado();
        }
        
        return bitLabo;
    }
    
    /*Método que devuelve la información de una vista*/
    public List<VwShowBitLab> mostrarDetalle(int idBitLab){
        List<VwShowBitLab> vista = null;
        Criteria cr;
        
        try {
            iniciar();
            
            cr = sesion.createCriteria(VwShowBitLab.class, "vista");
            cr.add(Restrictions.eq("vista.codBitLab", idBitLab));
            
            //Obteniendo resultado único
            vista = cr.list();
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao mostrar: " + e);
            System.out.println("\n"+e.getLocalizedMessage());
            //throw e;
        } finally {
            completado();
        }
        System.out.println("\n Tamaño de vista: "+vista.size());
        return vista;
    
    }
     
    /**
     * Metodo que registra los datos
     */
    public void registrar(){
        
    }
    
    public void eliminar(){
    }
}
