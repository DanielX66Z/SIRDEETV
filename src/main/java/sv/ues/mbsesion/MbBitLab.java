/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.mbsesion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import sv.ues.dao.BitacoraLaboratorioDao;
import sv.ues.dao.VectorDao;
import sv.ues.dominio.BitacoraLab;
import sv.ues.dominio.Vector;

/**
 *
 * @author Carlos A
 */
@ManagedBean
@ViewScoped
public class MbBitLab  implements Serializable{

    
    //private List<BitacoraLab> lista = new ArrayList();
    //private BitacoraLaboratorioDao labDao;
    //private List<BitacoraLab> lista = new ArrayList();
    //private VectorDao vector;
    
    /**
     * Creates a new instance of MbBitLab
     */
    public MbBitLab() {
    }
    
    public List<BitacoraLab> lista_lab_bit()
    {
        List<BitacoraLab> lista = new ArrayList();
        BitacoraLaboratorioDao labDao = new BitacoraLaboratorioDao();
        try
        {
            lista = labDao.obtenerListado();
            //System.out.println("\nLista.actividad: "+lista.get(0).getActividad());
        }
        catch(Exception e)
        {
            System.out.println("\nBitacora excepcion... "+e);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,e.toString(),e.toString()));
            lista = null;
        }
        return lista;
    }
    
    public List<Vector> lista_vector()
    {
        List<Vector> listaVector = new ArrayList();
        VectorDao vector = new VectorDao();
        try
        {
            listaVector = vector.obtenerListado();
            //System.out.println("\nLista.actividad: "+lista.get(0).getActividad());
        }
        catch(Exception e)
        {
            System.out.println("\nBitacora excepcion... "+e);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,e.toString(),e.toString()));
            listaVector = null;
        }
        return listaVector;
    }

}
