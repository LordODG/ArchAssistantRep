<%-- 
    Document   : InicioUsuario
    Created on : 29/12/2016, 09:37:25 AM
    Author     : Prometheus
--%>

<%@page import="Beans.ArchAssistantBean"%>
<%@page import="java.util.List"%>
<%@page import="servicios.Proyecto"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.PreparedStatement"%>

<!DOCTYPE html>
<html>
<jsp:include page="/Templates/templateHeader.jspf" ></jsp:include>
    <div class="tab_bg">
        <div class="tab_left">
            <img src="assets/css/images/big_icon.png" alt="" title="" border="0" class="big_icon" />       
        </div>
        <div class="middle_text">
            <div id="main">
                <h1> Bienvenido 
                <jsp:useBean id="validUsuario" scope="session" class="servicios.Usuario" />
                <jsp:getProperty name="validUsuario" property="usuNombre" />
            </h1>
            <form name="gestionarProyectos" action="GestionarProyectos" method="POST">
                <table border="1">
                    <thead>
                        <tr>
                            <th><h3>Código</h3></th>
                            <th><h3>Nombre</h3></th>
                            <th><h3>Descripción</h3></th>
                            <th><h3>Avance</h3></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Proyecto> lista;
                            ArchAssistantBean p = new ArchAssistantBean();
                            lista = p.Listar(validUsuario.getUsuUsuario());
                            for (Proyecto pro : lista) {
                                out.println("<tr><td>" + pro.getProID() + "</td>");
                                out.println("<td>" + pro.getProNombre() + "</td>");
                                out.println("<td>" + pro.getProDescripcion() + "</td>");
                                out.println("<td>" + pro.getProAvance() + "</td></tr>");
                            }
                        %>
                    </tbody>
                </table>
                <table border="0">
                    <tbody>
                        <tr>
                            <td>ID del proyecto: </td>
                            <td><input type="text" name="txtIdProyecto" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Seleccionar" name="btnSeleccionarProyecto"/></td>
                            <td><input type="submit" value="Eliminar" name="btnEliminarProyecto" /></td>
                            <td><input type="submit" value="Nuevo" name="btnCrearProyecto" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>

    <div class="tabs">
        <!--
        <div class="tab">
            <img src="images/icon1.png" alt="" title="" border="0" class="tab_icon" />
            <p class="tab_text">
                <a href="#">Lorem ipsum dolor sit amet</a><br />
                Consectetur adipisicing
            </p>
        </div>
    
        <div class="tab">
            <img src="images/icon2.png" alt="" title="" border="0" class="tab_icon" />
            <p class="tab_text">
                <a href="#">Lorem ipsum dolor sit amet</a><br />
                Consectetur adipisicing
            </p>
        </div> 
    
    
        <div class="tab">
            <img src="images/icon3.png" alt="" title="" border="0" class="tab_icon" />
            <p class="tab_text">
                <a href="#">Lorem ipsum dolor sit amet</a><br />
                Consectetur adipisicing
            </p>
        </div>  -->
    </div>
    <div class="clear"></div>
</div>
<div class="center_content">
    <div class="left_content">
        <!--
        <div class="title">Main Services</div>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
        </p>
        <div class="read_more_tab"><a href="#">read more</a></div>
    
    
        <div class="title">Updates</div>
        <div class="list_tab">
            <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
            <p class="list">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore .
            </p>              
        </div>
    
    
        <div class="list_tab">
            <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
            <p class="list">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore .
            </p>               
        </div>            
    
    
        <div class="list_tab">
            <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
            <p class="list">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore . 
            </p>               
        </div>                 
    
    
    
    
    
        -->
    </div>

    <div class="right_content">
        <!--
        <div class="title">Testimonials</div>
    
        <div class="testimonials">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor sit amet.</p>
        </div>
        <div class="test_author">- John Doe -</div>
    
        <div class="testimonials">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor incididunt.</p>
        </div>
        <div class="test_author">- John Doe  -</div>      
    
    
        <div class="title">Get in touch</div>
    
        <div class="info_box">
            <img src="assets/css/images/phone_icon.gif" alt="" class="phone_icon" />
    
            <p class="info">
                <span class="red">PHONE:</span> 0567 4999 5676<br />
                <span class="red">Email:</span> <a href="#">info@company.com</a><br />
                <span class="red">Adress:</span> Abraham Str. 078 Alabama<br />
            </p>
    
        </div>
        -->
    </div>

    <div class="clear"></div>   
</div>
<jsp:include page="/Templates/templateFooter.jspf" ></jsp:include>
</div>
</body>
</html>
