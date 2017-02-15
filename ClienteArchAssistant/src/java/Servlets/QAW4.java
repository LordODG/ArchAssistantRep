/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.ArchAssistantBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import servicios.ArcAssistantService_Service;
import servicios.Atributocalidad;
import servicios.Proyecto;
import servicios.Rationaleqaw;

/**
 *
 * @author Prometheus
 */
@WebServlet(name = "QAW4", urlPatterns = {"/QAW4"})
public class QAW4 extends HttpServlet {

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
        String guardar = request.getParameter("btnQaw4Guardar");
        String continuar = request.getParameter("btnQaw4Continuar");
        String regresar = request.getParameter("btnQaw4anterior");
        String guardarAtributos = request.getParameter("btnqaw4GuardarSelec");
        String nuevoAtributo = request.getParameter("BtnQaw4GuardarNuevoAtributo");
        ArchAssistantBean archB = new ArchAssistantBean();
        List<Atributocalidad> seleccionados;
        
        if(guardarAtributos != null)
        {
            List<Atributocalidad> atributos = archB.ListarAtr();
            seleccionados = new LinkedList<Atributocalidad>();
            for (Atributocalidad atr : atributos)
            {
                if(request.getParameter("chk"+atr.getAcNombre())!=null)
                {
                    seleccionados.add(atr);
                }
            }
            HttpSession sesion = request.getSession();
            sesion.setAttribute("atributosSeleccionados", seleccionados);
            response.sendRedirect("qaw4.jsp");
        }
        
        if (nuevoAtributo != null)
        {
            Atributocalidad atri = new Atributocalidad();
            atri.setAcDescripcion(request.getParameter("TxtAtribDescripNueAtrib"));
            atri.setAcNombre(request.getParameter("TxtAtribNombreNueAtri"));
            crearAtributo(atri);
            response.sendRedirect("qaw4.jsp");
        }
        
        if (guardar != null)
        {
            Proyecto proy = (Proyecto)request.getSession().getAttribute("proyectoActual");
            Rationaleqaw ratq = archB.RationaleQAW(proy.getProID(), "qaw4");
            if (ratq == null)
            {
                ratq = new Rationaleqaw();
            }
            ratq.setRatQawDescripcion(request.getParameter("ratqaw4"));
            ratq.setTblProyectoProID(proy);
            ratq.setRatQawPaso("qaw4");
            guardarRationaleQaw(ratq);
            proy.setProAvance("qaw4");
            modificarProyecto(proy);
            response.sendRedirect("qaw4.jsp");
        }
        if (continuar != null)
        {
            if (request.getParameter("ratqaw4")!= "")
            {
                response.sendRedirect("qaw5.jsp");
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
            response.sendRedirect("qaw3.jsp");
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

    private void crearAtributo(servicios.Atributocalidad parameter) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ArcAssistantService port = service.getArcAssistantServicePort();
        port.crearAtributo(parameter);
    }

}
