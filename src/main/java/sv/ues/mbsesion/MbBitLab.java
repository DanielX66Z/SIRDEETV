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
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import sv.ues.dao.BitacoraLaboratorioDao;
import sv.ues.dominio.BitacoraLab;
import sv.ues.dominio.Vector;
import sv.ues.dominio.VwShowBitLab;

/**
 *
 * @author Carlos A
 */
@ManagedBean
@RequestScoped
public class MbBitLab implements Serializable{
    @ManagedProperty(value = "#{bitaLab}")
    private BitacoraLab bitaLab;
    @ManagedProperty(value = "#{detalle}")
    private List<VwShowBitLab> detalle;
    
    /**
     * Creates a new instance of MbBitLab
     */
    public MbBitLab() {
    }
    /**
     * Método que devuelve un listado completo de todos los laboratorios existentes
     * @return 
     */
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
            System.out.println("\nMbBitLab excepcion... "+e);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,e.toString(),e.toString()));
        }
        return lista;
    }
    
    /**
     * Método que devuelve un listado completo de todos los laboratorios pertenecientes a un vector
     * @param vector
     * @return 
     */
    public List<BitacoraLab> lista_lab_bit_vec(int vector)
    {
        List<BitacoraLab> lista = new ArrayList();
        BitacoraLaboratorioDao labDao = new BitacoraLaboratorioDao();
        try
        {
            lista = labDao.obtenerListado(vector);
            //System.out.println("\nLista.actividad: "+lista.get(0).getActividad());
        }
        catch(Exception e)
        {
            System.out.println("\nMbBitLab excepcion... "+e);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,e.toString(),e.toString()));
        }
        return lista;
    }
    
    
    
    /**
     * Método dependiente que obtiene el listado de vectores actuales
     * @return Devuelve una lista de vectores existentes
     */
    public List<Vector> lista_vector()
    {
        return new MbVector().lista_vector();
    }
    
    /**
     * Este método muestra un registro de la bitácora de laboratorio
     * @param id contiene el id del registro a mostrar
     * @return 
     */
    public String show(int id){
        BitacoraLaboratorioDao labDao = new BitacoraLaboratorioDao();
        this.bitaLab = labDao.mostrar(id);
        this.detalle = labDao.mostrarDetalle(id);
        System.out.println("\n Variable detalle: "+this.detalle);
        return "showBitacoraLaboratorio";
    }

    /**
     * @return the bitaLab
     */
    public BitacoraLab getBitaLab() {
        return bitaLab;
    }

    /**
     * @param bitaLab the bitaLab to set
     */
    public void setBitaLab(BitacoraLab bitaLab) {
        this.bitaLab = bitaLab;
    }

    /**
     * @return the detalle
     */
    public List<VwShowBitLab> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(List<VwShowBitLab> detalle) {
        this.detalle = detalle;
    }

    
}
