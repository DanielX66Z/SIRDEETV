/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import sv.ues.dao.InvestigacionDao;

/**
 *
 * @author PC
 */
@ManagedBean
public class ConverterInvestigacion implements Converter{

    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try{
            InvestigacionDao investDao=new InvestigacionDao();
            return null;
        }catch(Throwable ex){
            return null;
        }
    }

    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
