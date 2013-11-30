/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import com.sistemapos.sistemadatos.ejb.UsuarioEjbLocal;
import com.sistemapos.sistemadatos.dto.UsuarioDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Matias
 */
public class UsuarioBean extends org.apache.struts.action.ActionForm {

    private String nombre_user;
    private String pass;
    private static final String SUCCESS = "success";
    private static final String FALLO = "failure";
    
    
    @EJB
    private UsuarioEjbLocal usuario;
    private UsuarioDTO user = new UsuarioDTO();

    public UsuarioBean() {
    }

    public UsuarioBean(String nombre_user, String pass) {
        this.nombre_user = nombre_user;
        this.pass = pass;
    }

    public String Login() {
        try {
            user.setNombre_user(nombre_user);
            user.setPass(pass);

            List<UsuarioDTO> nn = usuario.login();
            
        } catch (Exception ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, "Error en ingrearcliente clientebeans" + ex);
        }
        return null;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return nombre_user;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.nombre_user = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return pass;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.pass = password;
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getEmail() == null || getEmail().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
