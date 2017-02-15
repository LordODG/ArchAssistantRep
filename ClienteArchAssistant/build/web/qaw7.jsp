<%-- 
    Document   : qaw7
    Created on : 25/01/2017, 08:34:12 AM
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
         <script>
             function votar(id)
             {
                 
             }
         </script>
    </head>
    <body>
        <form name="qaw-7" action="QAW7">
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
                    <td><h1>Paso 7</h1></td>
                    <td><h3>Paso 8</h3></td>
                  </tr>
                </tbody>
            </table>
            <h2>Priorización de los escenarios:</h2>
            <p align="justify">
                Una vez estén los escenarios definitivos a usar en el sistema, los stakeholders realizarán una votación para organizarlos por su nivel de importancia; se asigna una cantidad de votos a cada participante igual a un tercio de la cantidad de escenarios que haya y se redondea al número par superior o igual, de este modo se podrá hacer dos rondas de votaciones de modo que cada participante indique en la ronda inicial con la mitad de sus votos los escenarios más importantes y luego nuevamente en la segunda ronda, una persona puede votar en ambas rondas por los mismos escenarios.
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
                  <th scope="col">Votos</th>
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
                      out.println("<td>");
                      if (esce.getEscPrioridad() != null)
                        {
                            out.println(esce.getEscPrioridad());
                        }
                        else
                        {
                            out.println(0);
                        }
                      out.println("</td>");
                      /*out.println("<td>");
                      out.println("<input type=\"button\" value=\"votar\" onclick=\"votar("+esce.getEscID()+")\"/>");//cada que se oprime el botón, aumenta el valor de la columna "votos"
                      out.println("</td>");*/
                      out.println("</tr>");
                    }
                %>
              </tbody>
            </table>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td>Código del Escenario: </td>
                    <td><input type="text" name="txtQaw7CodigoSeleccionar"/></td>
                </tr>
                <tr>
                    <input type="submit" value="actualizarPrioridades" name="btnQaw7Prioridad"/>
                </tr>
              </tbody>
            </table>

            
            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratqaw7"><%
                    ArchAssistantBean p = new ArchAssistantBean();
                    Rationaleqaw ratq = p.RationaleQAW(proyectoActual.getProID(), "qaw7");
                    if (ratq != null)
                    {
                        out.print(ratq.getRatQawDescripcion());
                    }
                %></textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnQaw7Guardar"/></td>
                    </tr>
                    <tr>
                    <td><input type="submit" value="Regresar" name="btnQaw7anterior"/></td>
                  <td><input type="submit" value="Continuar" name="btnQaw7Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
