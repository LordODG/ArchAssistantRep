/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.io.PrintWriter;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import servicios.ArcAssistantService_Service;
import servicios.Usuario;

/**
 *
 * @author Prometheus
 */
@WebServlet(name = "AutenticarUsuario", urlPatterns = {"/AutenticarUsuario"})
public class AutenticarUsuario extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ArchAssistant/ArcAssistantService.wsdl")
    private ArcAssistantService_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String registrar, ingresar;
        registrar = request.getParameter("btnRegistrar");
        ingresar = request.getParameter("btnIngresarUsuario");
        if (ingresar != null)
        {
            Usuario usu = new Usuario();
            String usuario, password;
            usuario = request.getParameter("txtUsuario");
            password = request.getParameter("txtpass");
            usu = iniciarSesion(usuario, password);
            if (usu != null)
            {
                HttpSession sesion = request.getSession();
                sesion.setAttribute("validUsuario", usu);
                response.sendRedirect("InicioUsuario.jsp");
            }
            else
            {
                /*ScriptEngineManager script = new ScriptEngineManager();
                ScriptEngine js = script.getEngineByName("JavaScript");
                js.equals("window.alert('usuario no válido, verifique usuario y contraseña');");*/
                response.sendError(0, "usuario y contraseña equivocados");
                response.sendRedirect("index.jsp");
            }
        }
        if (registrar != null)
        {
            response.sendRedirect("RegistrarUsuario.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Usuario iniciarSesion(java.lang.String usuario, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        return port.iniciarSesion(usuario, password);
    }

}
