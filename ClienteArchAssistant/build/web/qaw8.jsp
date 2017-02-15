<%-- 
    Document   : qaw8
    Created on : 25/01/2017, 08:34:51 AM
    Author     : Prometheus
--%>

<%@page import="servicios.Escenario"%>
<%@page import="java.util.List"%>
<%@page import="servicios.Rationaleqaw"%>
<%@page import="Beans.ArchAssistantBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArchAssistant - QAW</title>
        <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
    </head>
    <body>
        <form name="qaw-8" action="QAW8">
            <h1 align="center">ArchAssistant</h1>
            <h2 align="center">QAW</h2>
            <h2 align="center"><jsp:useBean id="proyectoActual" scope="session" class="servicios.Proyecto" />
            <jsp:getProperty name="proyectoActual" property="proNombre" /></h2>
            <table width="100%" border="0" align="center">
                <tbody>
                  <tr>
                    <td><a href="QAW1.html"><h3>Paso 1</h3></a></td>
                    <td><a href="QAW2.html"><h3>Paso 2</h3></a></td>
                    <td><a href="QAW3.html"><h3>Paso 3</h3></a></td>
                    <td><a href="QAW4.html"><h3>Paso 4</h3></a></td>
                    <td><a href="QAW5.html"><h3>Paso 5</h3></a></td>
                    <td><a href="QAW6.html"><h3>Paso 6</h3></a></td>
                    <td><a href="QAW7.html"><h3>Paso 7</h3></a></td>
                    <td><h1>Paso 8</h1></td>
                  </tr>
                </tbody>
            </table>

            <h2>Refinamiento de los escenarios:</h2>
            <p align="justify">
                con el tiempo restante asignado al taller, se procederá a refinar los primeros 4 o 5 escenarios que serán los más importantes del sistema; para este proceso se debe especificar:
            </p>

            <h2>Escenarios priorizados:</h2>

            <h3>Lista de escenarios:</h3>
            <table width="100%" border="3">
              <tbody>
                <tr>
                  <th scope="col">Código</th>
                  <th scope="col">Nombre</th>
                  <th scope="col">Estímulo</th>
                  <th scope="col">Fuente</th>
                  <th scope="col">Ambiente</th>
                  <th scope="col">Artefacto</th>
                  <th scope="col">Respuesta</th>
                  <th scope="col">Medida</th>
                  <th scope="col">Prioridad</th>
                </tr>
                <%
                    ArchAssistantBean archB = new ArchAssistantBean();
                    List<Escenario> listaEsc = archB.ListEscenarios(proyectoActual);
                    for (Escenario esce : listaEsc)
                    {
                      out.println("<tr>");
                      out.println("<td>");
                      out.println(esce.getEscID());
                      out.println("</td>");
                      out.println("<td>");
                      out.println(esce.getEscNombre());
                      out.println("</td>");
                      out.println("<td>");
                      out.println(esce.getEscEstimulo());
                      out.println("</td>");
                      out.println("<td>&nbsp;</td><td>");
                      out.println(esce.getEscAmbiente());
                      out.println("</td>");
                      out.println("<td>&nbsp;</td><td>");
                      out.println(esce.getEscRespuesta());
                      out.println("</td>");
                      out.println("<td>&nbsp;</td><td>");
                      if (esce.getEscPrioridad() != null)
                        {
                            out.println(esce.getEscPrioridad());
                        }
                        else
                        {
                            out.println(0);
                        }
                      out.println("</td>");
                      out.println("</tr>");
                    }
                %>
              </tbody>
            </table>
              <table width="100" border="0">
              <tbody>
                <tr>
                    <td>Código del Escenario: </td>
                    <td><input type="text" name="txtQaw8CodigoSeleccionar"/></td>
                </tr>
                <tr>
                    <input type="submit" value="Refinar" name="btnQaw8Refinar"/>
                </tr>
              </tbody>
            </table>
            
            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratqaw8"><%
                ArchAssistantBean p = new ArchAssistantBean();
                Rationaleqaw ratq = p.RationaleQAW(proyectoActual.getProID(), "qaw8");
                if (ratq != null)
                {
                    out.print(ratq.getRatQawDescripcion());
                }
            %></textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnQaw8Guardar"/></td>
                    </tr>
                    <tr>
                    <td><input type="submit" value="Regresar" name="btnQaw8anterior"/></td>
                  <td><input type="submit" value="Continuar" name="btnQaw8Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
