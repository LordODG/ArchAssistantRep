<%-- 
    Document   : qaw1
    Created on : 20/01/2017, 04:16:32 PM
    Author     : Prometheus
--%>

<%@page import="Beans.ArchAssistantBean"%>
<%@page import="servicios.Rationaleqaw"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArchAssistant - QAW</title>
        <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
    </head>
    <body>
        <form name="qaw-1" action="QAW1">
            <h1 align="center">ArchAssistant</h1>
            <h2 align="center">QAW</h2>
            <h2 align="center"><jsp:useBean id="proyectoActual" scope="session" class="servicios.Proyecto" />
            <jsp:getProperty name="proyectoActual" property="proNombre" /></h2>
            <table width="100%" border="0" align="center">
              <tbody>
                <tr>
                  <td><h1>Paso 1</h1></td>
                  <td><h3>Paso 2</h3></td>
                  <td><h3>Paso 3</h3></td>
                  <td><h3>Paso 4</h3></td>
                  <td><h3>Paso 5</h3></td>
                  <td><h3>Paso 6</h3></td>
                  <td><h3>Paso 7</h3></td>
                  <td><h3>Paso 8</h3></td>
                </tr>
              </tbody>
            </table>
            <h2>Presentación de QAW e introducciones:</h2>
            <p align="justify">
                En este paso, se explica detalladamente el propósito y funcionalidad de QAW, dando a conocer cada uno de los pasos de manera clara a los involucrados, además cada uno de ellos se presentará a sí mismo indicando su rol en la organización y su relación con el sistema a desarrollar.
            </p>
            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratqaw1">
                <%
                    ArchAssistantBean p = new ArchAssistantBean();
                    Rationaleqaw ratq = p.RationaleQAW(proyectoActual.getProID(),"qaw1");
                    if (ratq != null)
                    {
                        out.print(ratq.getRatQawDescripcion());
                    }
                %>
            </textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnQaw1Guardar"/></td>
                    <td><input type="submit" value="Continuar" name="btnQaw1Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
