/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import sv.ues.dominio.Vector;

/**
 *
 * @author Carlos A
 */
@ManagedBean
@RequestScoped
public class VectorDao extends BaseDao {

    /**
     * Creates a new instance of VectorDao
     */
    public VectorDao() {
    }
    
    public List<Vector> obtenerListado() {
        List<Vector> vect = null;
        Root<Vector> from;
        CriteriaQuery<Object> select;
        CriteriaQuery criteria;
        try {
            this.iniciar();
            criteria = sesion.getCriteriaBuilder().createQuery(Vector.class);
            from = criteria.from(Vector.class);
            //Obtenemos los valores
            select = criteria.select(from);
            
            //Devolviendo resultados
            vect = sesion.createQuery(criteria).getResultList();
            vect.size();
        } catch (HibernateException e) {
            System.out.println("Error en BitacoraLaboratorioDao: " + e);
            //throw e;
        } 
        
        return vect;
    }

}
