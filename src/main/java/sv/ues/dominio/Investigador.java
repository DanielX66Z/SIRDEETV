package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Investigador generated by hbm2java
 */
public class Investigador  implements java.io.Serializable {


     private int idInv;
     private String nomInv;
     private String tipoInv;
     private Set investigacions = new HashSet(0);

    public Investigador() {
    }

	
    public Investigador(int idInv, String nomInv, String tipoInv) {
        this.idInv = idInv;
        this.nomInv = nomInv;
        this.tipoInv = tipoInv;
    }
    public Investigador(int idInv, String nomInv, String tipoInv, Set investigacions) {
       this.idInv = idInv;
       this.nomInv = nomInv;
       this.tipoInv = tipoInv;
       this.investigacions = investigacions;
    }
   
    public int getIdInv() {
        return this.idInv;
    }
    
    public void setIdInv(int idInv) {
        this.idInv = idInv;
    }
    public String getNomInv() {
        return this.nomInv;
    }
    
    public void setNomInv(String nomInv) {
        this.nomInv = nomInv;
    }
    public String getTipoInv() {
        return this.tipoInv;
    }
    
    public void setTipoInv(String tipoInv) {
        this.tipoInv = tipoInv;
    }
    public Set getInvestigacions() {
        return this.investigacions;
    }
    
    public void setInvestigacions(Set investigacions) {
        this.investigacions = investigacions;
    }




}

