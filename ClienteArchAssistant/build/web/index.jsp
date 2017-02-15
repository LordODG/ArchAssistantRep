<%-- 
    Document   : index
    Created on : 29/12/2016, 09:03:43 AM
    Author     : Prometheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArchAssistant inicio</title>
        <!--<link rel="stylesheet" href="assets/css/" />-->
        <script language="JavaScript">
            function usuarioNoValido()
            {
                window.alert("usuario no válido, verifique usuario y contraseña");
            }
         </script>   
         <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
    </head>
    <body class="loading">
        <div id="wrapper">
            <div id="bg"></div>
            <div id="overlay"></div>            
        </div>
        
        <div class="wrap">
            <div class="header">
                <div class="logo"><a href="index.html"><img src="assets/css/images/logo.gif" alt="" title="" border="0" /></a></div>

            </div>

            <div id="menu">
                <ul>                                                                       
                    <li class="selected"><a href="#">Inicio</a></li>
                    <li><a href="#">Acerca de</a></li>
                    <li><a href="#">Servicios</a></li>
                    <li><a href="#">Proyectos</a></li>
                    <li><a href="#">QAW </a></li>
                    <li><a href="#">ADD </a></li>
                    <li><a href="#">Contáctanos</a></li>                                                          
                </ul>
            </div> 

            <div class="tab_bg">
                <div class="tab_left">
                    <img src="assets/css/images/big_icon.png" alt="" title="" border="0" class="big_icon" />       
                </div>

                <div class="middle_text">
                    <div id="main">
                        <h1>Iniciar Sesión</h1>
                        <form action="AutenticarUsuario" method="POST">
                            <table border="0" class="inicioSesion">
                                <tbody>
                                    <tr>
                                        <td><h2>Usuario:</h2></td>
                                        <td><input type="text" name="txtUsuario" value="" /></td>
                                    </tr>
                                    <tr>
                                        <td><h2>Contraseña:</h2></td>
                                        <td><input type="password" name="txtpass" value="" /></td>
                                    </tr>
                                    <tr>                                        
                                        <td><input type="submit" value="Ingresar" name="btnIngresarUsuario" /></td>
                                        <td><input type="submit" value="Registrar Usuario" name="btnRegistrar" /></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>

                <div class="tabs">
                    <!--
                    <div class="tab">
                        <img src="images/icon1.png" alt="" title="" border="0" class="tab_icon" />
                        <p class="tab_text">
                            <a href="#">Lorem ipsum dolor sit amet</a><br />
                            Consectetur adipisicing
                        </p>
                    </div>

                    <div class="tab">
                        <img src="images/icon2.png" alt="" title="" border="0" class="tab_icon" />
                        <p class="tab_text">
                            <a href="#">Lorem ipsum dolor sit amet</a><br />
                            Consectetur adipisicing
                        </p>
                    </div> 


                    <div class="tab">
                        <img src="images/icon3.png" alt="" title="" border="0" class="tab_icon" />
                        <p class="tab_text">
                            <a href="#">Lorem ipsum dolor sit amet</a><br />
                            Consectetur adipisicing
                        </p>
                    </div>  -->
                </div>
                <div class="clear"></div>
            </div>
            <div class="center_content">
                <div class="left_content">
                    <!--
                    <div class="title">Main Services</div>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
                    </p>
                    <div class="read_more_tab"><a href="#">read more</a></div>


                    <div class="title">Updates</div>
                    <div class="list_tab">
                        <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
                        <p class="list">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore .
                        </p>              
                    </div>


                    <div class="list_tab">
                        <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
                        <p class="list">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore .
                        </p>               
                    </div>            


                    <div class="list_tab">
                        <img src="assets/css/images/arrow.gif" alt="" title="" class="arrow" />
                        <p class="list">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore . 
                        </p>               
                    </div>                 





                -->
                </div>

                <div class="right_content">
                    <!--
                    <div class="title">Testimonials</div>

                    <div class="testimonials">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor sit amet.</p>
                    </div>
                    <div class="test_author">- John Doe -</div>

                    <div class="testimonials">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dolor incididunt.</p>
                    </div>
                    <div class="test_author">- John Doe  -</div>      


                    <div class="title">Get in touch</div>

                    <div class="info_box">
                        <img src="assets/css/images/phone_icon.gif" alt="" class="phone_icon" />

                        <p class="info">
                            <span class="red">PHONE:</span> 0567 4999 5676<br />
                            <span class="red">Email:</span> <a href="#">info@company.com</a><br />
                            <span class="red">Adress:</span> Abraham Str. 078 Alabama<br />
                        </p>

                    </div>
                    -->
                </div>

                <div class="clear"></div>   
            </div>
            <jsp:include page="/Templates/templateFooter.jspf"></jsp:include>
        </div>
    </body>
</html>
