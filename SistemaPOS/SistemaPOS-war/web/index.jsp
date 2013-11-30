<%-- 
    Document   : index
    Created on : 12-11-2013, 11:02:03 AM
    Author     : Matias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap-responsive.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" type="text/css" href="resouces/css/global.css">
    </head>
    <body>
        <div id="contentLogin">
            <html:form action="/logueo" styleClass="form-horizontal">
                <bean:write name="LoginForm" property="error" filter="false"/>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">Email</label>
                    <div class="controls">
                        <html:text property="email"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputPassword">Password</label>
                    <div class="controls">
                        <html:text property="name"/>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <label class="checkbox">
                            <input type="checkbox"> Recordarme
                        </label>
                        <html:submit value="Login" styleClass="btn btn-primary"/>
                    </div>
                </div>
            </html:form>
        </div>
    </body>
</html:html>
