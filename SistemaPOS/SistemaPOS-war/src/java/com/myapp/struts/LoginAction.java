/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import com.sistemapos.sistemadatos.ejb.UsuarioEjbLocal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
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
    private String nombre_user;
    private String pass;
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
    @EJB
    private UsuarioEjbLocal usuario;
    private UsuarioDTO user = new UsuarioDTO();
    
    public String Login(String nombre,String pass) {
        try {
            user.setNombre_user(nombre);
            user.setPass(pass);

            int nn = usuario.agregarUsuario(user);
            System.out.println(nn);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        //extrayendo dantos del usuario
        LoginForm formBean = (LoginForm)form;
        String name = formBean.getName();
        String email = formBean.getEmail();
        
        
        Login(name, email);
        
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
