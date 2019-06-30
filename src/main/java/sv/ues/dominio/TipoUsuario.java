package sv.ues.dominio;
// Generated 06-15-2019 03:20:57 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoUsuario generated by hbm2java
 */
public class TipoUsuario  implements java.io.Serializable {


     private long id;
     private String nombre;
     private String descripcion;
     private Set usuarios = new HashSet(0);

    public TipoUsuario() {
    }

	
    public TipoUsuario(long id) {
        this.id = id;
    }
    public TipoUsuario(long id, String nombre, String descripcion, Set usuarios) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


