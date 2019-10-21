/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import java.util.Iterator;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import sv.ues.dominio.BitacoraLab;

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
     */
    public List<BitacoraLab> obtenerListado() {
        List<BitacoraLab> bitLabo = null;
        Root<BitacoraLab> from;
        CriteriaQuery<Object> select;
        CriteriaQuery criteria;
        try {
            this.iniciar();
            criteria = sesion.getCriteriaBuilder().createQuery(BitacoraLab.class);
            from = criteria.from(BitacoraLab.class);
            //Obtenemos los valores
            select = criteria.select(from);
            
            //Devolviendo resultados
            bitLabo = sesion.createQuery(criteria).getResultList();
            bitLabo.size();
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao: " + e);
            //throw e;
        } finally {
            //Por conveniencia no cierro sesion
            //cerrar();
        }
        
        return bitLabo;
    }

    public void registrar(){
        
    }
    
    public void eliminar(){
    }
}
