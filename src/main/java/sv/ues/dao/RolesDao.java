/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import sv.ues.dominio.Rol;
import sv.ues.utils.HibernateUtil;

/**
 *
 * @author PC
 */
public class RolesDao {

    private HibernateUtil hibernateUtil = new HibernateUtil();
    private SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = null;
        tx=null;
        try {
            //verificaremos si la conexion no esta a
            sesion = sessionFactory.openSession();
            tx = sesion.beginTransaction();
        }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }

    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa DAO", he);
    }

    public void registrar(Rol rol) throws Exception {
      
        try {
            iniciaOperacion();
            sesion.save(rol);
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

    public List<Rol> obtener_roles() throws Exception {
        try{
        iniciaOperacion();
        CriteriaQuery criteria = sesion.getCriteriaBuilder().createQuery(Rol.class);//Roles  .class);
        criteria.from(Rol.class);
//CriteriaQuery<Rol> cq=criteria.createQuery(Rol.class);
        List<Rol> roles = sesion.createQuery(criteria).getResultList();
        return roles;
        }catch(HibernateException e){
            throw e;
        }finally{
        sesion.close();
        
        }
    }
    public boolean validar_rol(String nombre) throws Exception 
    {
        try
        {
            iniciaOperacion();
            /*CriteriaBuilder builder = sesion.getCriteriaBuilder();
            CriteriaQuery<Rol> query = builder.createQuery(Rol.class);
            Root<Rol> root = query.from(Rol.class);
            query.select(root).where(builder.equal(root.get("nombre"), nombre));
            Query<Rol> q=sesion.createQuery(query);
            Rol rol= q.getSingleResult();*/

            CriteriaBuilder critBuilder = sesion.getCriteriaBuilder();
            CriteriaQuery<Rol> critQ = critBuilder.createQuery(Rol.class);
            Root<Rol> root = critQ.from(Rol.class);
            Expression<String> path = root.get("nombre");
            Expression<String> upper =critBuilder.upper(path);
            Predicate ctfPredicate = critBuilder.like(upper,nombre.trim().toUpperCase());
            critQ.where(critBuilder.and(ctfPredicate));
            List<Rol> roles = sesion.createQuery(critQ.select(root)).getResultList();
            
            if(roles.size() > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception x)
        {
            System.out.println(x.toString());
            System.out.println("NO EXISTE");
            return false;
        }
    }
    
    public boolean validar_rol_modificar(String nombre,long id) throws Exception 
    {
        try
        {
            iniciaOperacion();
            /*CriteriaBuilder builder = sesion.getCriteriaBuilder();
            CriteriaQuery<Rol> query = builder.createQuery(Rol.class);
            Root<Rol> root = query.from(Rol.class);
            //query.select(root).where(builder.equal(root.get("nombre"), nombre));
            query.select(root).where(builder.equal(root.get("nombre"), nombre.trim().toLowerCase()),builder.notEqual(root.get("id"), id));

            Query<Rol> q=sesion.createQuery(query);
            List<Rol> lsroles = q.list();*/
            
            CriteriaBuilder critBuilder = sesion.getCriteriaBuilder();
            CriteriaQuery<Rol> critQ = critBuilder.createQuery(Rol.class);
            Root<Rol> root = critQ.from(Rol.class);
            
            Expression<String> path = root.get("nombre");
            Expression<String> upper =critBuilder.upper(path);
            Predicate ctfPredicate = critBuilder.like(upper,nombre.trim().toUpperCase());
            
            Expression<Long> path2 = root.get("id");
            Predicate ctfPredicate2 = critBuilder.notEqual(path2,id);
            
            critQ.where(critBuilder.and(ctfPredicate),critBuilder.and(ctfPredicate2));
            
            List<Rol> roles = sesion.createQuery(critQ.select(root)).getResultList();

            if(roles.size() > 0)
            {
                System.out.println("EXISTE");
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception x)
        {
            System.out.println(x.toString());
            System.out.println("NO EXISTE");
            return false;
        }
    }

    public void actualizar_rol(Rol rol) throws Exception {
        
        try {
            iniciaOperacion();
            sesion.update(rol);
            sesion.flush();
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminar_rol(Rol rol) {
      
        try {
            iniciaOperacion();
            sesion.delete(rol);
            //sesion.flush();
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
           sesion.close();
        }
    
    }

}