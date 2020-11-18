/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diegonarvaez
 */
@WebServlet(name = "prueba_serv", urlPatterns = {"/prueba_serv"})
public class prueba_serv extends HttpServlet {

    private String texto;

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

        String valor = request.getParameter("radio1");

        System.out.println(valor);

        texto = request.getParameter("textArea");

        System.out.println("Valor textArea null " + texto);

        String resultado = "";

        if (valor.equalsIgnoreCase("telefono")) {

            Telefono tel = new Telefono();

            resultado = tel.validateTelephone(texto);

        } else if (valor.equalsIgnoreCase("trans")) {
            Transposición_Inversa trans = new Transposición_Inversa();
            resultado = trans.criptografia(texto);
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prueba_serv</title>");
            out.println("</head>");
            out.println("<body>");
            
              out.println("<center><img src='imagenes/diego.jpeg' width='200px'> <p>Alumno: Narváez Barete Diego</p></center>");

            out.println("<center><table border='1' width='400px'>");
            out.println("<tr><td><p>Detalles</p></td></tr>");
            out.println("<tr><td><marquee>" + resultado + "</marquee></td></tr>");

            out.println("<tr><td><p>Para realizar una nueva operacion <br> da click en el siguiente hipervinculo</p></td></tr>");

            out.println("<tr><td><center><a href='index.jsp'> Nuevo </a></center></td></tr> </table></center>");

            out.println("</body>");
            out.println("</html>");
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

}
