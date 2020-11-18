<%-- 
    Document   : index
    Created on : 13/11/2020, 08:06:52 PM
    Author     : diegonarvaez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Calculadora </title>
        <link href="css/marco.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <br>
        <br>
        <br>
         <img src="imagenes/diego.jpeg" width="200" align="left">
        <center> <font size=6 color="black"> <b> <i> Alumno: Diego Narvaez </i> </b> </font>  </center>  
        <br>
     
    <center> <fieldset style="border:5px solid #2874A6; width:400px;">
            <legend> <font size=5 > Opciones </font> </legend>
        <form name='formulario' action="prueba_serv" method="post" id ="form">           
            <table  width="100%">
                <tr> 
                    <td width="20%">
                        Ingresa un Texto:
                    </td> 
                </tr>
                   <tr>
                      <td  width="100%">
                           <textarea id="texto" form="form" name="textArea"></textarea>
                      </td>
                   </tr>
                
                    <tr>
                        <td width="30%">
                            Seleccione una actividad: 
                    <br>
                        <input type="radio" name="radio1" placeholder="negrita" value="telefono"> Formato Telefono
                       <input type="radio" name="radio1" placeholder="subrayado" value="trans"> Trans Simple
                        </td>
                    </tr>
                                    
                    <tr>
                        <td>
                            <input type="submit" value="aceptar" name="btnAceptar" id="button">
                        </td>
                        <td>
                            <input type="reset" value="Nuevo" name="btnLimpiar" onclick="reset()" id="button">
                        </td>
                    </tr>
                    
                </table>
               
            </form>

        </fieldset> </center>
    </body>
</html>