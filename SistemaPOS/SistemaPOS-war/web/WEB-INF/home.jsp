<%-- 
    Document   : home
    Created on : 12-11-2013, 12:31:06 PM
    Author     : Matias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="resouces/bootstrap/js/bootstrap.js"></script>
        <script src="resouces/bootstrap/js/bootstrap.min.js"></script>
        <script src="resouces/bootstrap/js/bootstrap-dropdown.js"></script>
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap-responsive.css">
        <link rel="stylesheet" type="text/css" href="resouces/bootstrap/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" type="text/css" href="resouces/css/global.css">
    </head>
    <body>
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">

                    <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>

                    <!-- Be sure to leave the brand out there if you want it shown -->
                    <a class="brand" href="#">Sistema POS</a>
                    <ul class="nav" role="navigation">
                        <li class="dropdown">
                            <a id="drop1" href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">Mantenedor <b class="caret"></b></a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Agregar</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Editar</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Eliminar</a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav">
                        <li class="">
                            <a href="#">Home</a>
                        </li>
                        <li><a href="#">Link</a></li>
                        <li><a href="#">Link</a></li>
                    </ul>

                    <!-- Everything you want hidden at 940px or less, place within here -->
                    <div class="nav-collapse collapse">
                        <!-- .nav, .navbar-search, .navbar-form, etc -->
                    </div>

                </div>
            </div>
        </div>
    </body>
</html>
