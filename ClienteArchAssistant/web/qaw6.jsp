<%-- 
    Document   : qaw6
    Created on : 25/01/2017, 08:34:02 AM
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
                <td><h1>Paso 6</h1></td>
                <td><h3>Paso 7</h3></td>
                <td><h3>Paso 8</h3></td>
              </tr>
            </tbody>
        </table>
        <form name="qaw-6" action="QAW6">
            <h2>Consolidación de escenarios:</h2>
            <p align="justify">
                Teniendo una lista de varios escenarios generados durante la lluvia de ideas, se hace una consolidación de los mismos buscando escenarios que sean muy similares o que se puedan mezclar en uno solo, para esto, se hace una votación por parte de los stakeholders siendo cuidadosos de no perder funcionalidades al hacer la fusión, para evitar que no se pierda el trabajo hecho en el paso anterior.
            </p>

            <h2>Escenarios:</h2>

            <h3>Lista de escenarios:</h3>
            <table width="100%" border="3">
              <tbody>
                <tr>
                  <th scope="col">Código</th>
                  <th scope="col">Estímulo</th>
                  <th scope="col">ambiente</th>
                  <th scope="col">Respuesta</th>
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
                    out.println(esce.getEscEstimulo());
                    out.println("</td>");
                    out.println("<td>");
                    out.println(esce.getEscAmbiente());
                    out.println("</td>");
                    out.println("<td>");
                    out.println(esce.getEscRespuesta());
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
                    <td><input type="text" name="txtQaw6CodigoSeleccionar"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Seleccionar o crear" name="btnQaw6SeleccionarEscenario"/></td>
                    <td><input type="submit" value="Eliminar" name="btnQaw6EliminarEscenario"/></td>
                </tr>
              </tbody>
            </table>
            
            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratqaw6"><%
                    ArchAssistantBean p = new ArchAssistantBean();
                    Rationaleqaw ratq = p.RationaleQAW(proyectoActual.getProID(), "qaw6");
                    if (ratq != null)
                    {
                        out.print(ratq.getRatQawDescripcion());
                    }
                %></textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnQaw6Guardar"/></td>
                    </tr>
                    <tr>
                    <td><input type="submit" value="Regresar" name="btnQaw6anterior"/></td>
                  <td><input type="submit" value="Continuar" name="btnQaw6Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
