package sv.ues.mbsesion;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import sv.ues.dao.CargoDao;
import sv.ues.dao.RolesDao;
import sv.ues.dominio.Cargo;
import sv.ues.dominio.Rol;

/**
 *
 * @author Miguel
 */

@ManagedBean(name="MbCargo")
@ViewScoped
public class MbCargo  implements Serializable
{
    
    private Cargo cargo;
    private List<Cargo> lscargo;

    public List<Cargo> getLscargo() {
        return lscargo;
    }

    public void setLscargo(List<Cargo> lscargo) {
        this.lscargo = lscargo;
    }
  
    
    

    public MbCargo()
    {
        cargo = new Cargo();
    }

    public void registrar() throws ParseException, Exception
    {  
        try{
        if(cargo.getCargo().trim().length() > 0)
        {
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
            String x=sdf.format(date);
            cargo.setFechaCreacion(sdf.parse(x));
            cargo.setActivo(true);
            CargoDao cargoDao=new CargoDao();
            cargoDao.registrar(cargo);
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion","Registro de cargo exitoso"));
        }
        else
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Informacion","Error al guardar"));
        }
        //PrimeFaces.current().ajax().update("creacion:cargo:mensaje");
       }catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Informacion","Error al guardar"));
       }
    }
       
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
    public void validarCargo(String cargo){
        try{
        CargoDao cargoDao=new CargoDao();
        Cargo cargox=cargoDao.validarExistCargo(cargo);
        if(cargox==null){
            
        }else{
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion","Cargo ya existe")); 
        }
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","en capa dao de cargo")); 
        }
    }
}
