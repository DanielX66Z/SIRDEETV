package sv.ues.mbsesion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import sv.ues.dao.BitacoraLaboratorioChincheDao;
//import sv.ues.dao.DepartamentoDao;
//import sv.ues.dao.MunicipioDao;
import sv.ues.dominio.BitacoraLaboratorioChinche;
import sv.ues.dominio.Departamento;
import sv.ues.dominio.Municipio;
import javax.faces.model.SelectItem;
import sv.ues.dao.DepartamentoDao;
import sv.ues.dao.MunicipioDao;



/**
 *
 * @author Miguel
 */
@ManagedBean(name="MbBitLabChinche")
@ViewScoped
public class MbBitLabChinche  implements Serializable{
    
    private BitacoraLaboratorioChinche blcregistro;
    private List<Departamento> lsdepartamentos = new ArrayList();
    private List<Municipio> lsmunicipios = new ArrayList();
    private String codigodepartamento = "";
    private String codigomunicipio = "";
    private String tipo = "";
    private List<SelectItem> items_departamento;
    private List<SelectItem> items_municipio;
    //DepartamentoDao departamentodao;
    //MunicipioDao municipiodao = new MunicipioDao();


    public MbBitLabChinche() throws Exception
    {
        blcregistro = new BitacoraLaboratorioChinche();
        //departamentodao= new DepartamentoDao();
        //lsdepartamentos = departamentodao.obtener_departamentos();
    }
    
    public void registrar() throws Exception
    {
        //System.out.println("CODIGO DEPARTAMENTO: " + codigodepartamento);
        BitacoraLaboratorioChincheDao blcdao = new BitacoraLaboratorioChincheDao();
        blcregistro.setDepartamento(codigodepartamento);
        blcregistro.setMunicipio(codigomunicipio);
        
        blcregistro.setDomiciliar(false);
        blcregistro.setPeridomiciliar(false);
        blcregistro.setSilvestre(false);
        
        if(tipo.equals("Domiciliar"))
        {
            blcregistro.setDomiciliar(true);
        }
        if(tipo.equals("Periomiciliar"))
        {
            blcregistro.setPeridomiciliar(true);
        }
        if(tipo.equals("Silvestre"))
        {
            blcregistro.setSilvestre(true);
        }
        
        
        blcdao.registrar(blcregistro);
        blcregistro = new BitacoraLaboratorioChinche();
        PrimeFaces.current().ajax().update("creacion");
        //PrimeFaces.current().ajax().update("registros");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion","Registro guardado con exito")); 
    }
    
    

    public BitacoraLaboratorioChinche getBlcregistro() {
        return blcregistro;
    }

    public void setBlcregistro(BitacoraLaboratorioChinche blcregistro) {
        this.blcregistro = blcregistro;
    }
    
    public List<Departamento> getLsdepartamentos() {
        return lsdepartamentos;
    }

    public void setLsdepartamentos(List<Departamento> lsdepartamentos) {
        this.lsdepartamentos = lsdepartamentos;
    }

    public String getCodigodepartamento() {
        return codigodepartamento;
    }

    public void setCodigodepartamento(String codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }

    public String getCodigomunicipio() {
        return codigomunicipio;
    }

    public void setCodigomunicipio(String codigomunicipio) {
        this.codigomunicipio = codigomunicipio;
    }

    public List<Municipio> getLsmunicipios() {
        return lsmunicipios;
    }

    public void setLsmunicipios(List<Municipio> lsmunicipios) {
        this.lsmunicipios = lsmunicipios;
    }

    public List<SelectItem> getItems_departamento() throws Exception {
        //this.items_departamento_domicilio_aspirante = new ArrayList<>();
        this.items_departamento = new ArrayList();
        DepartamentoDao departamentos = new DepartamentoDao();
        List<Departamento> lista_departamentos = departamentos.obtener_todos_los_departamentos();
        this.items_departamento.clear();
        for(Departamento dpto:lista_departamentos)
        {
           SelectItem item = new SelectItem(dpto.getCodDepto(),dpto.getNomDepto());
           this.items_departamento.add(item);
        }
        return items_departamento;
    }

    public void setItems_departamento(List<SelectItem> items_departamento_domicilio_aspirante) {
        this.items_departamento = items_departamento_domicilio_aspirante;
    }

    public List<SelectItem> getItems_municipio() {
        //this.items_municipio = new ArrayList<>();
        this.items_municipio = new ArrayList();
      /*  MunicipioDao municipios = new MunicipioDao();
        List<Municipio> lista_municipios_por_dpto = municipios.obtener_municipios_por_id_del_departamento(depar);
        this.items_municipio.clear();
        for(Municipio muni:lista_municipios_por_dpto)
        {
            SelectItem item = new SelectItem(muni.getCodMunicipio(),muni.getNomMunicipio());
            this.items_municipio.add(item);
        }*/
        return items_municipio;
    }

    public void setItems_municipio(List<SelectItem> items_municipio) {
        this.items_municipio = items_municipio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
