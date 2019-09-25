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

    public MbCargo()
    {
        cargo = new Cargo();
    }

    public void registrar()
    {
        if(cargo.getCargo().trim().length() > 0)
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion","Ingresa a registrar Cargo"));
        }
        else
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Informacion","NO Ingresa a registrar Cargo"));
        }
        //PrimeFaces.current().ajax().update("creacion:cargo:mensaje");
    }
       
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
