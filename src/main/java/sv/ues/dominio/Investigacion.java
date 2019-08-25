package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Investigacion generated by hbm2java
 */
public class Investigacion  implements java.io.Serializable {


     private int codInvest;
     private Investigacion investigacion;
     private Laboratorio laboratorio;
     private String nomInvest;
     private Boolean estadoInvest;
     private Set investigadors = new HashSet(0);
     private Set investigacions = new HashSet(0);
     private Set perfilInvs = new HashSet(0);

    public Investigacion() {
    }

	
    public Investigacion(int codInvest, Laboratorio laboratorio, String nomInvest) {
        this.codInvest = codInvest;
        this.laboratorio = laboratorio;
        this.nomInvest = nomInvest;
    }
    public Investigacion(int codInvest, Investigacion investigacion, Laboratorio laboratorio, String nomInvest, Boolean estadoInvest, Set investigadors, Set investigacions, Set perfilInvs) {
       this.codInvest = codInvest;
       this.investigacion = investigacion;
       this.laboratorio = laboratorio;
       this.nomInvest = nomInvest;
       this.estadoInvest = estadoInvest;
       this.investigadors = investigadors;
       this.investigacions = investigacions;
       this.perfilInvs = perfilInvs;
    }
   
    public int getCodInvest() {
        return this.codInvest;
    }
    
    public void setCodInvest(int codInvest) {
        this.codInvest = codInvest;
    }
    public Investigacion getInvestigacion() {
        return this.investigacion;
    }
    
    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }
    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }
    
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    public String getNomInvest() {
        return this.nomInvest;
    }
    
    public void setNomInvest(String nomInvest) {
        this.nomInvest = nomInvest;
    }
    public Boolean getEstadoInvest() {
        return this.estadoInvest;
    }
    
    public void setEstadoInvest(Boolean estadoInvest) {
        this.estadoInvest = estadoInvest;
    }
    public Set getInvestigadors() {
        return this.investigadors;
    }
    
    public void setInvestigadors(Set investigadors) {
        this.investigadors = investigadors;
    }
    public Set getInvestigacions() {
        return this.investigacions;
    }
    
    public void setInvestigacions(Set investigacions) {
        this.investigacions = investigacions;
    }
    public Set getPerfilInvs() {
        return this.perfilInvs;
    }
    
    public void setPerfilInvs(Set perfilInvs) {
        this.perfilInvs = perfilInvs;
    }




}


