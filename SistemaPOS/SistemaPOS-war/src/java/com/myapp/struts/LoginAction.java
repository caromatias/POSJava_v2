/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import com.sistemapos.conexion.Conexion;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author marcelo
 */
public class LoginAction extends Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FALLO = "failure";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        //extrayendo datos del usuario
        LoginForm formBean = (LoginForm)form;
        String name = formBean.getName();
        String email = formBean.getEmail();
        
        Conexion con = new Conexion();
        con.Conectar();
        
        //generar validación
        if ((name == null) ||
                (email==null) ||
                name.equals("") ||
                email.indexOf("@")==-1){
            formBean.setError();
            return mapping.findForward(FALLO);
        }
        return mapping.findForward(SUCCESS);
    }
}
