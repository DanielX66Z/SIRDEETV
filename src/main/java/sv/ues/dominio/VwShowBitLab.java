/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sv.ues.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Immutable;

/**
 * 
 * @author Carlos A
 */
@Entity
@Table(name = "vw_show_bit_lab")
@Immutable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwShowBitLab.findAll", query = "SELECT v FROM VwShowBitLab v")
    , @NamedQuery(name = "VwShowBitLab.findByCodDepto", query = "SELECT v FROM VwShowBitLab v WHERE v.codDepto = :codDepto")
    , @NamedQuery(name = "VwShowBitLab.findByCodMunicipio", query = "SELECT v FROM VwShowBitLab v WHERE v.codMunicipio = :codMunicipio")
    , @NamedQuery(name = "VwShowBitLab.findByIdColCan", query = "SELECT v FROM VwShowBitLab v WHERE v.idColCan = :idColCan")
    , @NamedQuery(name = "VwShowBitLab.findByIdCacerio", query = "SELECT v FROM VwShowBitLab v WHERE v.idCacerio = :idCacerio")
    , @NamedQuery(name = "VwShowBitLab.findByIdBitCampo", query = "SELECT v FROM VwShowBitLab v WHERE v.idBitCampo = :idBitCampo")
    , @NamedQuery(name = "VwShowBitLab.findByIdInvVector", query = "SELECT v FROM VwShowBitLab v WHERE v.idInvVector = :idInvVector")
    , @NamedQuery(name = "VwShowBitLab.findByIdTipoMues", query = "SELECT v FROM VwShowBitLab v WHERE v.idTipoMues = :idTipoMues")
    , @NamedQuery(name = "VwShowBitLab.findByIdLote", query = "SELECT v FROM VwShowBitLab v WHERE v.idLote = :idLote")
    , @NamedQuery(name = "VwShowBitLab.findByCodBitLab", query = "SELECT v FROM VwShowBitLab v WHERE v.codBitLab = :codBitLab")
    , @NamedQuery(name = "VwShowBitLab.findByIdPerfil", query = "SELECT v FROM VwShowBitLab v WHERE v.idPerfil = :idPerfil")
    , @NamedQuery(name = "VwShowBitLab.findByCodVector", query = "SELECT v FROM VwShowBitLab v WHERE v.codVector = :codVector")
    , @NamedQuery(name = "VwShowBitLab.findByTituloInv", query = "SELECT v FROM VwShowBitLab v WHERE v.tituloInv = :tituloInv")
    , @NamedQuery(name = "VwShowBitLab.findByDescInvVector", query = "SELECT v FROM VwShowBitLab v WHERE v.descInvVector = :descInvVector")
    , @NamedQuery(name = "VwShowBitLab.findByCodActividad", query = "SELECT v FROM VwShowBitLab v WHERE v.codActividad = :codActividad")
    , @NamedQuery(name = "VwShowBitLab.findByBitCodBitLab", query = "SELECT v FROM VwShowBitLab v WHERE v.bitCodBitLab = :bitCodBitLab")
    , @NamedQuery(name = "VwShowBitLab.findByNomBitLab", query = "SELECT v FROM VwShowBitLab v WHERE v.nomBitLab = :nomBitLab")
    , @NamedQuery(name = "VwShowBitLab.findByLotIdLote", query = "SELECT v FROM VwShowBitLab v WHERE v.lotIdLote = :lotIdLote")
    , @NamedQuery(name = "VwShowBitLab.findByIdPreservante", query = "SELECT v FROM VwShowBitLab v WHERE v.idPreservante = :idPreservante")
    , @NamedQuery(name = "VwShowBitLab.findByFechaCreacion", query = "SELECT v FROM VwShowBitLab v WHERE v.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "VwShowBitLab.findByFechaToma", query = "SELECT v FROM VwShowBitLab v WHERE v.fechaToma = :fechaToma")
    , @NamedQuery(name = "VwShowBitLab.findByEstatus", query = "SELECT v FROM VwShowBitLab v WHERE v.estatus = :estatus")
    , @NamedQuery(name = "VwShowBitLab.findByCodigoMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.codigoMuestra = :codigoMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByNomJefeFam", query = "SELECT v FROM VwShowBitLab v WHERE v.nomJefeFam = :nomJefeFam")
    , @NamedQuery(name = "VwShowBitLab.findByEdadMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.edadMuestra = :edadMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByTelefonoMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.telefonoMuestra = :telefonoMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByFechaTrabajo", query = "SELECT v FROM VwShowBitLab v WHERE v.fechaTrabajo = :fechaTrabajo")
    , @NamedQuery(name = "VwShowBitLab.findByFechaMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.fechaMuestra = :fechaMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByNumeroMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.numeroMuestra = :numeroMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByGeneroMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.generoMuestra = :generoMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByMotivoMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.motivoMuestra = :motivoMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByNumeroIdentificados", query = "SELECT v FROM VwShowBitLab v WHERE v.numeroIdentificados = :numeroIdentificados")
    , @NamedQuery(name = "VwShowBitLab.findByTipoTrampa", query = "SELECT v FROM VwShowBitLab v WHERE v.tipoTrampa = :tipoTrampa")
    , @NamedQuery(name = "VwShowBitLab.findByTipoCaso", query = "SELECT v FROM VwShowBitLab v WHERE v.tipoCaso = :tipoCaso")
    , @NamedQuery(name = "VwShowBitLab.findByCodigoCasa", query = "SELECT v FROM VwShowBitLab v WHERE v.codigoCasa = :codigoCasa")
    , @NamedQuery(name = "VwShowBitLab.findByNomMuestra", query = "SELECT v FROM VwShowBitLab v WHERE v.nomMuestra = :nomMuestra")
    , @NamedQuery(name = "VwShowBitLab.findByBitIdBitCampo", query = "SELECT v FROM VwShowBitLab v WHERE v.bitIdBitCampo = :bitIdBitCampo")
    , @NamedQuery(name = "VwShowBitLab.findByFechaCampo", query = "SELECT v FROM VwShowBitLab v WHERE v.fechaCampo = :fechaCampo")
    , @NamedQuery(name = "VwShowBitLab.findByIdUbicacion", query = "SELECT v FROM VwShowBitLab v WHERE v.idUbicacion = :idUbicacion")
    , @NamedQuery(name = "VwShowBitLab.findByLatitud", query = "SELECT v FROM VwShowBitLab v WHERE v.latitud = :latitud")
    , @NamedQuery(name = "VwShowBitLab.findByLongitud", query = "SELECT v FROM VwShowBitLab v WHERE v.longitud = :longitud")
    , @NamedQuery(name = "VwShowBitLab.findByAltitud", query = "SELECT v FROM VwShowBitLab v WHERE v.altitud = :altitud")
    , @NamedQuery(name = "VwShowBitLab.findByPoblacion", query = "SELECT v FROM VwShowBitLab v WHERE v.poblacion = :poblacion")
    , @NamedQuery(name = "VwShowBitLab.findByNomCacerio", query = "SELECT v FROM VwShowBitLab v WHERE v.nomCacerio = :nomCacerio")
    , @NamedQuery(name = "VwShowBitLab.findByNomUbicacion", query = "SELECT v FROM VwShowBitLab v WHERE v.nomUbicacion = :nomUbicacion")
    , @NamedQuery(name = "VwShowBitLab.findByNomMunicipio", query = "SELECT v FROM VwShowBitLab v WHERE v.nomMunicipio = :nomMunicipio")
    , @NamedQuery(name = "VwShowBitLab.findByNomDepto", query = "SELECT v FROM VwShowBitLab v WHERE v.nomDepto = :nomDepto")})
public class VwShowBitLab implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_bit_lab", updatable = false, nullable = false)
    private Integer codBitLab;
    @Column(name = "cod_depto")
    private String codDepto;
    @Column(name = "cod_municipio")
    private String codMunicipio;
    @Column(name = "id_col_can")
    private Integer idColCan;
    @Column(name = "id_cacerio")
    private Integer idCacerio;
    @Column(name = "id_bit_campo")
    private Integer idBitCampo;
    @Column(name = "id_inv_vector")
    private Integer idInvVector;
    @Column(name = "id_tipo_mues")
    private Integer idTipoMues;
    @Column(name = "id_lote")
    private Integer idLote;
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @Column(name = "cod_vector")
    private Integer codVector;
    @Column(name = "titulo_inv")
    private String tituloInv;
    @Column(name = "desc_inv_vector")
    private String descInvVector;
    @Column(name = "cod_actividad")
    private Integer codActividad;
    @Column(name = "bit_cod_bit_lab")
    private Integer bitCodBitLab;
    @Column(name = "nom_bit_lab")
    private String nomBitLab;
    @Column(name = "lot_id_lote")
    private Integer lotIdLote;
    @Column(name = "id_preservante")
    private Integer idPreservante;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_toma")
    @Temporal(TemporalType.DATE)
    private Date fechaToma;
    @Column(name = "estatus")
    private Boolean estatus;
    @Column(name = "codigo_muestra")
    private String codigoMuestra;
    @Column(name = "nom_jefe_fam")
    private String nomJefeFam;
    @Column(name = "edad_muestra")
    private Integer edadMuestra;
    @Column(name = "telefono_muestra")
    private String telefonoMuestra;
    @Column(name = "fecha_trabajo")
    @Temporal(TemporalType.DATE)
    private Date fechaTrabajo;
    @Column(name = "fecha_muestra")
    @Temporal(TemporalType.DATE)
    private Date fechaMuestra;
    @Column(name = "numero_muestra")
    private Integer numeroMuestra;
    @Column(name = "genero_muestra")
    private String generoMuestra;
    @Column(name = "motivo_muestra")
    private String motivoMuestra;
    @Column(name = "numero_identificados")
    private Integer numeroIdentificados;
    @Column(name = "tipo_trampa")
    private String tipoTrampa;
    @Column(name = "tipo_caso")
    private Integer tipoCaso;
    @Column(name = "codigo_casa")
    private String codigoCasa;
    @Column(name = "nom_muestra")
    private String nomMuestra;
    @Column(name = "bit_id_bit_campo")
    private Integer bitIdBitCampo;
    @Column(name = "fecha_campo")
    @Temporal(TemporalType.DATE)
    private Date fechaCampo;
    @Column(name = "id_ubicacion")
    private Integer idUbicacion;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;
    @Column(name = "altitud")
    private String altitud;
    @Column(name = "poblacion")
    private Integer poblacion;
    @Column(name = "nom_cacerio")
    private String nomCacerio;
    @Column(name = "nom_ubicacion")
    private String nomUbicacion;
    @Column(name = "nom_municipio")
    private String nomMunicipio;
    @Column(name = "nom_depto")
    private String nomDepto;

    public VwShowBitLab() {
    }

    public String getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public Integer getIdColCan() {
        return idColCan;
    }

    public void setIdColCan(Integer idColCan) {
        this.idColCan = idColCan;
    }

    public Integer getIdCacerio() {
        return idCacerio;
    }

    public void setIdCacerio(Integer idCacerio) {
        this.idCacerio = idCacerio;
    }

    public Integer getIdBitCampo() {
        return idBitCampo;
    }

    public void setIdBitCampo(Integer idBitCampo) {
        this.idBitCampo = idBitCampo;
    }

    public Integer getIdInvVector() {
        return idInvVector;
    }

    public void setIdInvVector(Integer idInvVector) {
        this.idInvVector = idInvVector;
    }

    public Integer getIdTipoMues() {
        return idTipoMues;
    }

    public void setIdTipoMues(Integer idTipoMues) {
        this.idTipoMues = idTipoMues;
    }

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    public Integer getCodBitLab() {
        return codBitLab;
    }

    public void setCodBitLab(Integer codBitLab) {
        this.codBitLab = codBitLab;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getCodVector() {
        return codVector;
    }

    public void setCodVector(Integer codVector) {
        this.codVector = codVector;
    }

    public String getTituloInv() {
        return tituloInv;
    }

    public void setTituloInv(String tituloInv) {
        this.tituloInv = tituloInv;
    }

    public String getDescInvVector() {
        return descInvVector;
    }

    public void setDescInvVector(String descInvVector) {
        this.descInvVector = descInvVector;
    }

    public Integer getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Integer codActividad) {
        this.codActividad = codActividad;
    }

    public Integer getBitCodBitLab() {
        return bitCodBitLab;
    }

    public void setBitCodBitLab(Integer bitCodBitLab) {
        this.bitCodBitLab = bitCodBitLab;
    }

    public String getNomBitLab() {
        return nomBitLab;
    }

    public void setNomBitLab(String nomBitLab) {
        this.nomBitLab = nomBitLab;
    }

    public Integer getLotIdLote() {
        return lotIdLote;
    }

    public void setLotIdLote(Integer lotIdLote) {
        this.lotIdLote = lotIdLote;
    }

    public Integer getIdPreservante() {
        return idPreservante;
    }

    public void setIdPreservante(Integer idPreservante) {
        this.idPreservante = idPreservante;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(Date fechaToma) {
        this.fechaToma = fechaToma;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public String getCodigoMuestra() {
        return codigoMuestra;
    }

    public void setCodigoMuestra(String codigoMuestra) {
        this.codigoMuestra = codigoMuestra;
    }

    public String getNomJefeFam() {
        return nomJefeFam;
    }

    public void setNomJefeFam(String nomJefeFam) {
        this.nomJefeFam = nomJefeFam;
    }

    public Integer getEdadMuestra() {
        return edadMuestra;
    }

    public void setEdadMuestra(Integer edadMuestra) {
        this.edadMuestra = edadMuestra;
    }

    public String getTelefonoMuestra() {
        return telefonoMuestra;
    }

    public void setTelefonoMuestra(String telefonoMuestra) {
        this.telefonoMuestra = telefonoMuestra;
    }

    public Date getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setFechaTrabajo(Date fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }

    public Date getFechaMuestra() {
        return fechaMuestra;
    }

    public void setFechaMuestra(Date fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    public Integer getNumeroMuestra() {
        return numeroMuestra;
    }

    public void setNumeroMuestra(Integer numeroMuestra) {
        this.numeroMuestra = numeroMuestra;
    }

    public String getGeneroMuestra() {
        return generoMuestra;
    }

    public void setGeneroMuestra(String generoMuestra) {
        this.generoMuestra = generoMuestra;
    }

    public String getMotivoMuestra() {
        return motivoMuestra;
    }

    public void setMotivoMuestra(String motivoMuestra) {
        this.motivoMuestra = motivoMuestra;
    }

    public Integer getNumeroIdentificados() {
        return numeroIdentificados;
    }

    public void setNumeroIdentificados(Integer numeroIdentificados) {
        this.numeroIdentificados = numeroIdentificados;
    }

    public String getTipoTrampa() {
        return tipoTrampa;
    }

    public void setTipoTrampa(String tipoTrampa) {
        this.tipoTrampa = tipoTrampa;
    }

    public Integer getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(Integer tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public String getCodigoCasa() {
        return codigoCasa;
    }

    public void setCodigoCasa(String codigoCasa) {
        this.codigoCasa = codigoCasa;
    }

    public String getNomMuestra() {
        return nomMuestra;
    }

    public void setNomMuestra(String nomMuestra) {
        this.nomMuestra = nomMuestra;
    }

    public Integer getBitIdBitCampo() {
        return bitIdBitCampo;
    }

    public void setBitIdBitCampo(Integer bitIdBitCampo) {
        this.bitIdBitCampo = bitIdBitCampo;
    }

    public Date getFechaCampo() {
        return fechaCampo;
    }

    public void setFechaCampo(Date fechaCampo) {
        this.fechaCampo = fechaCampo;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public String getNomCacerio() {
        return nomCacerio;
    }

    public void setNomCacerio(String nomCacerio) {
        this.nomCacerio = nomCacerio;
    }

    public String getNomUbicacion() {
        return nomUbicacion;
    }

    public void setNomUbicacion(String nomUbicacion) {
        this.nomUbicacion = nomUbicacion;
    }

    public String getNomMunicipio() {
        return nomMunicipio;
    }

    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

}
