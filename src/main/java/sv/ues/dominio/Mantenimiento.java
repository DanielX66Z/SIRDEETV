package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1



/**
 * Mantenimiento generated by hbm2java
 */
public class Mantenimiento  implements java.io.Serializable {


     private int idManto;
     private Lote lote;
     private String fechaManto;
     private boolean completadoManto;

    public Mantenimiento() {
    }

    public Mantenimiento(int idManto, Lote lote, String fechaManto, boolean completadoManto) {
       this.idManto = idManto;
       this.lote = lote;
       this.fechaManto = fechaManto;
       this.completadoManto = completadoManto;
    }
   
    public int getIdManto() {
        return this.idManto;
    }
    
    public void setIdManto(int idManto) {
        this.idManto = idManto;
    }
    public Lote getLote() {
        return this.lote;
    }
    
    public void setLote(Lote lote) {
        this.lote = lote;
    }
    public String getFechaManto() {
        return this.fechaManto;
    }
    
    public void setFechaManto(String fechaManto) {
        this.fechaManto = fechaManto;
    }
    public boolean isCompletadoManto() {
        return this.completadoManto;
    }
    
    public void setCompletadoManto(boolean completadoManto) {
        this.completadoManto = completadoManto;
    }




}

