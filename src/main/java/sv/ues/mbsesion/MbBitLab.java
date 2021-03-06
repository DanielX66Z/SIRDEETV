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
public class MbBitLab implements Serializable{

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
    
    /**
     * M�todo dependiente que obtiene el listado de vectores actuales
     * @return Devuelve una lista de vectores existentes
     */
    public List<Vector> lista_vector()
    {
        return new MbVector().lista_vector();
    }

}
