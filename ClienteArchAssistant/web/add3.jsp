<%-- 
    Document   : add3
    Created on : 25/01/2017, 12:30:18 PM
    Author     : Prometheus
--%>

<%@page import="servicios.Rationaleadd"%>
<%@page import="Beans.ArchAssistantBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArchAssistant - ADD</title>
        <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
    </head>
    <body>
        <form name="add-3" action="ADD3">
            <h1 align="center">ArchAssistant</h1>
            <h2 align="center">ADD</h2>
            <h2 align="center"><jsp:useBean id="proyectoActual" scope="session" class="servicios.Proyecto" />
            <jsp:getProperty name="proyectoActual" property="proNombre" /></h2>
            <table width="100%" border="0" align="center">
                <tbody>
                    <tr>
                      <td><a href="ADD1.html"><h3>Paso 1</h3></a></td>
                      <td><a href="ADD2.html"><h3>Paso 2</h3></a></td>
                      <td><h1>Paso 3</h1></td>
                      <td><h3>Paso 4</h3></td>
                      <td><h3>Paso 5</h3></td>
                      <td><h3>Paso 6</h3></td>
                      <td><h3>Paso 7</h3></td>
                      <td><h3>Paso 8</h3></td>
                    </tr>
                  </tbody>
                </table>
                <h2>Identificar candidatos a conductores (drivers) arquitecturales:</h2>
                <p align="justify">
                    Escoger  los  controladores  arquitecturales  desde  un  conjunto concreto  de  escenarios  de  calidad  y  requisitos  funcionales.  Este 
                            paso determina qué es importante para su descomposición. 
                    </p>

                    <h2>Conductores:</h2>
                <table width="100%" border="3">
                  <tbody>
                    <tr>
                      <th scope="col">Código</th>
                      <th scope="col">Estímulo</th>
                      <th scope="col">Fuente</th>
                      <th scope="col">Ambiente</th>
                      <th scope="col">Artefacto</th>
                      <th scope="col">Respuesta</th>
                      <th scope="col">Medida</th>
                      <th scope="col">Seleccionar</th>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td><input type="checkbox"/></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td><input type="checkbox"/></td>
                     </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td><input type="checkbox"/></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td><input type="checkbox"/></td>
                    </tr>
                  </tbody>
               </table><!-- combobox
                  <select>
                      <option value="Alto">Alto</option>
                      <option value="Medio">Medio</option>
                      <option value="Bajo">Bajo</option>
                 </select>-->
            <h2>Rationale:</h2>
            <textarea rows="5" cols="120" name="ratadd3">
                <%
                    ArchAssistantBean p = new ArchAssistantBean();
                    Rationaleadd rata = p.RationaleADD(proyectoActual.getProID(),"add3");
                    if (rata != null)
                    {
                        out.print(rata.getRatAddDescripcion());
                    }
                %>
            </textarea>
            <table width="100" border="0">
              <tbody>
                <tr>
                    <td><input type="submit" value="Guardar" name="btnAdd3Guardar"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Regresar" name="btnAdd3anterior"/></td>
                    <td><input type="submit" value="Continuar" name="btnAdd3Continuar"/></td>
                </tr>
              </tbody>
            </table>
        </form>
    </body>
</html>
