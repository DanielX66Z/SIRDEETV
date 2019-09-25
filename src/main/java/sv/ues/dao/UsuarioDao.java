/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sv.ues.dominio.TipoPrueba;
import sv.ues.dominio.Usuario;
import sv.ues.utils.HibernateUtil;

/**
 *
 * @author PC
 */
public class UsuarioDao {

    private HibernateUtil hibernateUtil = new HibernateUtil();
    private SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = null;
        tx = null;
        try {
            //verificaremos si la conexion no esta a
            sesion = sessionFactory.openSession();
            tx = sesion.beginTransaction();
        } catch (Throwable t) {
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }

    }

    public void ingresarUsuario(Usuario usuario) {
        try {
            iniciaOperacion();
            sesion.save(usuario);
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

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa DAO", he);
    }

    public void actualizarTipoPrueba(TipoPrueba tipoPrueba) throws Exception {

        try {
            iniciaOperacion();
            sesion.update(tipoPrueba);
            sesion.flush();
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Usuario getUsuarioById(int idUser) {
        try {
            iniciaOperacion();
            CriteriaBuilder builder = sesion.getCriteriaBuilder();
            CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);
            Root<Usuario> root = query.from(Usuario.class);

            query.select(root).where(builder.equal(root.get("idUsuario"), idUser));
            Query<Usuario> q = sesion.createQuery(query);
            Usuario usuario = q.getSingleResult();
            return usuario;
        } catch (HibernateException he) {
            return null;

        } finally {

            sesion.close();
        }
    }

}
