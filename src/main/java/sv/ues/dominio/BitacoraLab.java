package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * BitacoraLab generated by hbm2java
 */
public class BitacoraLab  implements java.io.Serializable {


     private int codBitLab;
     private Actividad actividad;
     private BitacoraLab bitacoraLab;
     private InvVector invVector;
     private String nomBitLab;
     private Set lotes = new HashSet(0);
     private Set bitacoraLabs = new HashSet(0);
     private Set analisisLabs = new HashSet(0);

    public BitacoraLab() {
    }

	
    public BitacoraLab(int codBitLab, Actividad actividad, InvVector invVector, String nomBitLab) {
        this.codBitLab = codBitLab;
        this.actividad = actividad;
        this.invVector = invVector;
        this.nomBitLab = nomBitLab;
    }
    public BitacoraLab(int codBitLab, Actividad actividad, BitacoraLab bitacoraLab, InvVector invVector, String nomBitLab, Set lotes, Set bitacoraLabs, Set analisisLabs) {
       this.codBitLab = codBitLab;
       this.actividad = actividad;
       this.bitacoraLab = bitacoraLab;
       this.invVector = invVector;
       this.nomBitLab = nomBitLab;
       this.lotes = lotes;
       this.bitacoraLabs = bitacoraLabs;
       this.analisisLabs = analisisLabs;
    }
   
    public int getCodBitLab() {
        return this.codBitLab;
    }
    
    public void setCodBitLab(int codBitLab) {
        this.codBitLab = codBitLab;
    }
    public Actividad getActividad() {
        return this.actividad;
    }
    
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public BitacoraLab getBitacoraLab() {
        return this.bitacoraLab;
    }
    
    public void setBitacoraLab(BitacoraLab bitacoraLab) {
        this.bitacoraLab = bitacoraLab;
    }
    public InvVector getInvVector() {
        return this.invVector;
    }
    
    public void setInvVector(InvVector invVector) {
        this.invVector = invVector;
    }
    public String getNomBitLab() {
        return this.nomBitLab;
    }
    
    public void setNomBitLab(String nomBitLab) {
        this.nomBitLab = nomBitLab;
    }
    public Set getLotes() {
        return this.lotes;
    }
    
    public void setLotes(Set lotes) {
        this.lotes = lotes;
    }
    public Set getBitacoraLabs() {
        return this.bitacoraLabs;
    }
    
    public void setBitacoraLabs(Set bitacoraLabs) {
        this.bitacoraLabs = bitacoraLabs;
    }
    public Set getAnalisisLabs() {
        return this.analisisLabs;
    }
    
    public void setAnalisisLabs(Set analisisLabs) {
        this.analisisLabs = analisisLabs;
    }




}


