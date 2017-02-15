/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.ArchAssistantBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicios.ArcAssistantService_Service;
import servicios.Atributocalidad;
import servicios.Escenario;
import servicios.Modulo;
import servicios.Proyecto;
import servicios.Rationaleqaw;

/**
 *
 * @author Prometheus
 */
@WebServlet(name = "QAW5", urlPatterns = {"/QAW5"})
public class QAW5 extends HttpServlet {

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
        String guardar = request.getParameter("btnQaw5Guardar");
        String continuar = request.getParameter("btnQaw5Continuar");
        String regresar = request.getParameter("btnQaw5anterior");
        String guardarEsc = request.getParameter("btnqaw5GuardarEscenario");
        
        
        if (guardarEsc != null)
        {
            Escenario esc = new Escenario();
            Proyecto proy = (Proyecto)request.getSession().getAttribute("proyectoActual");
            Atributocalidad atr = buscarAtributo(1);
            Modulo mod = buscarModulo(1);
            esc.setEscPrioridad(0);
            esc.setEscAmbiente(request.getParameter("txtqaw5Ambiente"));
            esc.setEscEstimulo(request.getParameter("txtqaw5Estimulo"));
            esc.setEscRespuesta(request.getParameter("txtqaw5Respuesta"));
            esc.setEscNombre(request.getParameter("txtqaw5Nombre"));
            esc.setTblAtributoCalidadacID(atr);
            esc.setTblModuloModId(mod);
            esc.setTblProyectoProID(proy);
            crearEscenario(esc);
            response.sendRedirect("qaw5.jsp");
            
        }
        
        if (guardar != null)
        {
            ArchAssistantBean archB = new ArchAssistantBean();
            Proyecto proy = (Proyecto)request.getSession().getAttribute("proyectoActual");
            Rationaleqaw ratq = archB.RationaleQAW(proy.getProID(), "qaw5");
            if (ratq == null)
            {
                ratq = new Rationaleqaw();
            }
            ratq.setRatQawDescripcion(request.getParameter("ratqaw5"));
            ratq.setTblProyectoProID(proy);
            ratq.setRatQawPaso("qaw5");
            guardarRationaleQaw(ratq);
            proy.setProAvance("qaw5");
            modificarProyecto(proy);
            response.sendRedirect("qaw5.jsp");
        }
        if (continuar != null)
        {
            if (request.getParameter("ratqaw5")!= "")
            {
                response.sendRedirect("qaw6.jsp");
            }
            else
            {
                try (PrintWriter out = response.getWriter()) {
                    out.println("debe llenar e campo Rationale antes de contunuar");
                }
            }
        }
        if (regresar != null)
        {
            response.sendRedirect("qaw4.jsp");
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

    private void guardarRationaleQaw(servicios.Rationaleqaw parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        port.guardarRationaleQaw(parameter);
    }

    private void modificarProyecto(servicios.Proyecto parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        port.modificarProyecto(parameter);
    }

    private void crearEscenario(servicios.Escenario parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        port.crearEscenario(parameter);
    }

    private Atributocalidad buscarAtributo(int parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        return port.buscarAtributo(parameter);
    }

    private Modulo buscarModulo(int parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        return port.buscarModulo(parameter);
    }

}
