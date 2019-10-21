package sv.ues.dominio;
// Generated 08-22-2019 08:34:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Documento generated by hbm2java
 */
public class Documento  implements java.io.Serializable {


     private int idDoc;
     private Documento documento;
     private PerfilInv perfilInv;
     private String tituloDoc;
     private String descDoc;
     private String rutaUrl;
     private Boolean estadoDoc;
     private Set documentos = new HashSet(0);

    public Documento() {
    }

	
    public Documento(int idDoc, PerfilInv perfilInv, String tituloDoc, String rutaUrl) {
        this.idDoc = idDoc;
        this.perfilInv = perfilInv;
        this.tituloDoc = tituloDoc;
        this.rutaUrl = rutaUrl;
    }
    public Documento(int idDoc, Documento documento, PerfilInv perfilInv, String tituloDoc, String descDoc, String rutaUrl, Boolean estadoDoc, Set documentos) {
       this.idDoc = idDoc;
       this.documento = documento;
       this.perfilInv = perfilInv;
       this.tituloDoc = tituloDoc;
       this.descDoc = descDoc;
       this.rutaUrl = rutaUrl;
       this.estadoDoc = estadoDoc;
       this.documentos = documentos;
    }
   
    public int getIdDoc() {
        return this.idDoc;
    }
    
    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public PerfilInv getPerfilInv() {
        return this.perfilInv;
    }
    
    public void setPerfilInv(PerfilInv perfilInv) {
        this.perfilInv = perfilInv;
    }
    public String getTituloDoc() {
        return this.tituloDoc;
    }
    
    public void setTituloDoc(String tituloDoc) {
        this.tituloDoc = tituloDoc;
    }
    public String getDescDoc() {
        return this.descDoc;
    }
    
    public void setDescDoc(String descDoc) {
        this.descDoc = descDoc;
    }
    public String getRutaUrl() {
        return this.rutaUrl;
    }
    
    public void setRutaUrl(String rutaUrl) {
        this.rutaUrl = rutaUrl;
    }
    public Boolean getEstadoDoc() {
        return this.estadoDoc;
    }
    
    public void setEstadoDoc(Boolean estadoDoc) {
        this.estadoDoc = estadoDoc;
    }
    public Set getDocumentos() {
        return this.documentos;
    }
    
    public void setDocumentos(Set documentos) {
        this.documentos = documentos;
    }




}

