<%-- 
    Document   : modificarEscenario
    Created on : 2/02/2017, 04:39:18 PM
    Author     : Prometheus
--%>

<%@page import="servicios.Escenario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Escenario</title>
        <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
    </head>
    <body>
        <form name="modEsc" action="ActualizarEscenario">
            <table width="100" border="0">
             <tbody>
              <tr>
                <td>Nombre:</td>
                <td><input type="text" name="txtQawRespuesta"
                    <%
                        int ref = (int) session.getAttribute("refinar");
                        Escenario esc = (Escenario)session.getAttribute("escenarioActual");
                        out.println("value = \""+esc.getEscNombre()+"\"");
                    %>
                    />
                </td>
              </tr>
              <tr>
                <td>Estímulo:</td>
                <td><input type="text" name="txtQawEstimulo"
                    <%
                        out.println("value = \""+esc.getEscEstimulo()+"\"");
                    %>
                    />
                </td>
              </tr>
                  <th scope="col">Fuente</th>
                  <th scope="col">Ambiente</th>
                  <th scope="col">Artefacto</th>
                  <th scope="col">Respuesta</th>
                  <th scope="col">Medida</th>
                  <th scope="col">Prioridad</th>
                  <%
                      if (ref == 1)
                      {
                        out.println("<tr>");
                        out.println("<td>Fuente:</td>");
                        out.println("<td><input type=\"text\" name=\"txtQawAmbiente\"");
                        out.println("value = \""+esc.getEscAmbiente()+"\"/>");
                        out.println("</td>");
                        out.println("</tr>");
                      }
                  %>
              <tr>
                <td>Ambiente:</td>
                <td><input type="text" name="txtQawAmbiente"
                    <%
                        out.println("value = \""+esc.getEscAmbiente()+"\"");
                    %>
                    />
                </td>
              </tr>
              <tr>
                <td>Respuesta:</td>
                <td><input type="text" name="txtQawRespuesta"
                    <%
                        out.println("value = \""+esc.getEscRespuesta()+"\"");
                    %>
                </td>
              </tr>
              <tr>
                  <td><input type="submit" value="guardar" name="btnQawGuardarEscenario"/></td>
                  <td><input type="reset" value="Cancelar"/></td>
              </tr>
            </tbody>
          </table>
        </form>
    </body>
</html>
