package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cargo generated by hbm2java
 */
public class Cargo  implements java.io.Serializable {


     private int idCargo;
     private String cargo;
     private Set usuarios = new HashSet(0);

    public Cargo() {
    }

	
    public Cargo(int idCargo) {
        this.idCargo = idCargo;
    }
    public Cargo(int idCargo, String cargo, Set usuarios) {
       this.idCargo = idCargo;
       this.cargo = cargo;
       this.usuarios = usuarios;
    }
   
    public int getIdCargo() {
        return this.idCargo;
    }
    
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


