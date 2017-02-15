<%-- 
    Document   : qaw5
    Created on : 25/01/2017, 08:33:48 AM
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
        <form name="qaw-5" action="QAW5">
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
                    <td><h1>Paso 5</h1></td>
                    <td><h3>Paso 6</h3></td>
                    <td><h3>Paso 7</h3></td>
                    <td><h3>Paso 8</h3></td>
                  </tr>
                </tbody>
              </table>
              <h2>Lluvia de ideas de escenarios:</h2>
              <p align="justify">
                  una vez hecha la presentación de los atributos directores o drivers del sistema, el o los facilitadores guiarán a los stakeholders en una lluvia de ideas en modo round-robin en la que cada uno generará un escenario dependiendo de sus funciones e intereses en el sistema, cada escenario debe constar de un estímulo, un ambiente y una respuesta, se espera que cada stakeholder genere al menos dos escenarios; hay que tener en cuenta que este paso es el corazón del proceso QAW por lo tanto hay que ser muy cuidadosos.
              </p>

                  <h2>Escenarios:</h2>

              <table width="100" border="0">
            <tbody>
              <tr>
                <td>Nombre:</td>
                <td><input type="text" name="txtqaw5Nombre"/></td>
              </tr>
              <tr>
                <td>Estímulo:</td>
                <td><input type="text" name="txtqaw5Estimulo"/></td>
              </tr>
              <tr>
                <td>Ambiente:</td>
                <td><input type="text" name="txtqaw5Ambiente"/></td>
              </tr>
              <tr>
                <td>Respuesta:</td>
                <td><input type="text" name="txtqaw5Respuesta"/></td>
              </tr>
              <tr>
                <td><input type="submit" value="Agregar" name="btnqaw5GuardarEscenario"/></td>
                <td><input type="reset" value="Cancelar"/></td>
              </tr>
            </tbody>
          </table>

          <h3>Lista de escenarios:</h3>
          <table width="100%" border="3">
            <tbody>
              <tr>
                <th scope="col">Código</th>
                <th scope="col">Estímulo</th>
                <th scope="col">Ambiente</th>
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
                    out.println(esce.getEscNombre());
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

            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratqaw5"><%
                    ArchAssistantBean p = new ArchAssistantBean();
                    Rationaleqaw ratq = p.RationaleQAW(proyectoActual.getProID(), "qaw5");
                    if (ratq != null)
                    {
                        out.print(ratq.getRatQawDescripcion());
                    }
                %></textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnQaw5Guardar"/></td>
                    </tr>
                    <tr>
                    <td><input type="submit" value="Regresar" name="btnQaw5anterior"/></td>
                  <td><input type="submit" value="Continuar" name="btnQaw5Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
