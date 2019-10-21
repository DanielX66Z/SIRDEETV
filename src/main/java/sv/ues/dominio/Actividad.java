package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Actividad generated by hbm2java
 */
public class Actividad  implements java.io.Serializable {


     private int codActividad;
     private PerfilInv perfilInv;
     private String nomActividad;
     private String descActividad;
     private Set bitacoraLabs = new HashSet(0);

    public Actividad() {
    }

	
    public Actividad(int codActividad, PerfilInv perfilInv) {
        this.codActividad = codActividad;
        this.perfilInv = perfilInv;
    }
    public Actividad(int codActividad, PerfilInv perfilInv, String nomActividad, String descActividad, Set bitacoraLabs) {
       this.codActividad = codActividad;
       this.perfilInv = perfilInv;
       this.nomActividad = nomActividad;
       this.descActividad = descActividad;
       this.bitacoraLabs = bitacoraLabs;
    }
   
    public int getCodActividad() {
        return this.codActividad;
    }
    
    public void setCodActividad(int codActividad) {
        this.codActividad = codActividad;
    }
    public PerfilInv getPerfilInv() {
        return this.perfilInv;
    }
    
    public void setPerfilInv(PerfilInv perfilInv) {
        this.perfilInv = perfilInv;
    }
    public String getNomActividad() {
        return this.nomActividad;
    }
    
    public void setNomActividad(String nomActividad) {
        this.nomActividad = nomActividad;
    }
    public String getDescActividad() {
        return this.descActividad;
    }
    
    public void setDescActividad(String descActividad) {
        this.descActividad = descActividad;
    }
    public Set getBitacoraLabs() {
        return this.bitacoraLabs;
    }
    
    public void setBitacoraLabs(Set bitacoraLabs) {
        this.bitacoraLabs = bitacoraLabs;
    }




}

