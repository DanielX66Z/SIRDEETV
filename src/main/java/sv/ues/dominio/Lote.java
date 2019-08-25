package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lote generated by hbm2java
 */
public class Lote  implements java.io.Serializable {


     private int idLote;
     private BitacoraLab bitacoraLab;
     private Lote lote;
     private Preservante preservante;
     private Date fechaCreacion;
     private Date fechaToma;
     private Boolean estatus;
     private Set mantenimientos = new HashSet(0);
     private Set lotes = new HashSet(0);
     private Set muestras = new HashSet(0);

    public Lote() {
    }

	
    public Lote(int idLote, BitacoraLab bitacoraLab, Preservante preservante) {
        this.idLote = idLote;
        this.bitacoraLab = bitacoraLab;
        this.preservante = preservante;
    }
    public Lote(int idLote, BitacoraLab bitacoraLab, Lote lote, Preservante preservante, Date fechaCreacion, Date fechaToma, Boolean estatus, Set mantenimientos, Set lotes, Set muestras) {
       this.idLote = idLote;
       this.bitacoraLab = bitacoraLab;
       this.lote = lote;
       this.preservante = preservante;
       this.fechaCreacion = fechaCreacion;
       this.fechaToma = fechaToma;
       this.estatus = estatus;
       this.mantenimientos = mantenimientos;
       this.lotes = lotes;
       this.muestras = muestras;
    }
   
    public int getIdLote() {
        return this.idLote;
    }
    
    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }
    public BitacoraLab getBitacoraLab() {
        return this.bitacoraLab;
    }
    
    public void setBitacoraLab(BitacoraLab bitacoraLab) {
        this.bitacoraLab = bitacoraLab;
    }
    public Lote getLote() {
        return this.lote;
    }
    
    public void setLote(Lote lote) {
        this.lote = lote;
    }
    public Preservante getPreservante() {
        return this.preservante;
    }
    
    public void setPreservante(Preservante preservante) {
        this.preservante = preservante;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaToma() {
        return this.fechaToma;
    }
    
    public void setFechaToma(Date fechaToma) {
        this.fechaToma = fechaToma;
    }
    public Boolean getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
    public Set getMantenimientos() {
        return this.mantenimientos;
    }
    
    public void setMantenimientos(Set mantenimientos) {
        this.mantenimientos = mantenimientos;
    }
    public Set getLotes() {
        return this.lotes;
    }
    
    public void setLotes(Set lotes) {
        this.lotes = lotes;
    }
    public Set getMuestras() {
        return this.muestras;
    }
    
    public void setMuestras(Set muestras) {
        this.muestras = muestras;
    }




}


