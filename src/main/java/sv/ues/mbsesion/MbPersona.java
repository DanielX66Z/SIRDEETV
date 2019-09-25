package sv.ues.mbsesion;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import org.primefaces.PrimeFaces;
import sv.ues.dao.DepartamentoDao;
import sv.ues.dao.MunicipioDao;
import sv.ues.dao.PersonaDao;
import sv.ues.dao.RolesDao;
import sv.ues.dominio.Departamento;
import sv.ues.dominio.Municipio;
import sv.ues.dominio.Persona;
import sv.ues.dominio.Rol;

/**
 *
 * @author Miguel Martinez
 */


@ManagedBean(name="MbPersona")
@ViewScoped
public class MbPersona  implements Serializable
{
    
    private Persona persona;
    
    private List<SelectItem> items_municipio;
    private List<SelectItem> items_departamento;
    
    private Municipio municipio;
    private Departamento departamento;
    private String codigodepartamento = "";
    private String codigomunicipio = "";
    

    public MbPersona()
    {
        persona = new Persona();
        municipio = new Municipio();
        departamento = new Departamento();
    }
    
    public void registrar() throws Exception
    {
        PersonaDao personaDao = new PersonaDao(); 
        persona.setMunicipio(municipio);
        personaDao.registrar(persona);

        persona = new Persona();
        municipio = new Municipio();
        departamento = new Departamento();
        codigodepartamento = "";
        codigomunicipio = "";

        PrimeFaces.current().ajax().update("F01");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion","Persona registrada con exito")); 
    }

    public void validarPersonaDui() throws Exception
    {
        PersonaDao personaDao = new PersonaDao();
        
        if(personaDao.obtener_persona_dui(persona.getDui())!=null)
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Advertencia","DUI: " + persona.getDui() + " duplicado")); 
            persona.setDui("");
            PrimeFaces.current().ajax().update("F01:persona_dui");
        }
    }
    
    public void validarPersonaEmail() throws Exception
    {
        PersonaDao personaDao = new PersonaDao();
        if(personaDao.obtener_persona_email(persona.getCorreoPersona())!=null)
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Advertencia","Email: " + persona.getCorreoPersona() + " duplicado")); 
            persona.setCorreoPersona("");
            PrimeFaces.current().ajax().update("F01:persona_email");
        }
    }
    
    public void validarPersonaNit() throws Exception
    {
        PersonaDao personaDao = new PersonaDao();
        
        if(personaDao.obtener_persona_nit(persona.getNit())!=null)
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Advertencia","NIT: " + persona.getNit() + " duplicado")); 
            persona.setNit("");
            PrimeFaces.current().ajax().update("F01:persona_nit");
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<SelectItem> getItems_municipio() throws Exception {
        
        this.items_municipio = new ArrayList();
        MunicipioDao municipios = new MunicipioDao();
        Departamento departamento_seleccionado = new Departamento();
        departamento_seleccionado.setCodDepto(codigodepartamento);
        List<Municipio> lista_municipios_por_dpto = municipios.obtener_municipios_por_id_del_departamento(departamento_seleccionado);
        this.items_municipio.clear();
        for(Municipio muni:lista_municipios_por_dpto)
        {
            SelectItem item = new SelectItem(muni.getCodMunicipio(),muni.getNomMunicipio());
            this.items_municipio.add(item);
        }
        return items_municipio;
    }

    public void setItems_municipio(List<SelectItem> items_municipio) {
        this.items_municipio = items_municipio;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<SelectItem> getItems_departamento() throws Exception {
        //this.codigomunicipio = "";
        this.items_departamento = new ArrayList();
        DepartamentoDao departamentos = new DepartamentoDao();
        List<Departamento> lista_departamentos = departamentos.obtener_todos_los_departamentos();
        this.items_departamento.clear();
        for(Departamento dep:lista_departamentos)
        {
            SelectItem item = new SelectItem(dep.getCodDepto(),dep.getNomDepto());
            this.items_departamento.add(item);
        }
        return items_departamento;
    }

    public void setItems_departamento(List<SelectItem> items_departamento) {
        this.items_departamento = items_departamento;
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

    public void resetCodigoMunicipio() {
        codigomunicipio = "";
    }
    
    public void asignarMunicipio() throws Exception 
    {
        municipio.setCodMunicipio(codigomunicipio);
        MunicipioDao municipioDao = new MunicipioDao();
        municipio = municipioDao.obtener_municipio(codigomunicipio);
    }

}
