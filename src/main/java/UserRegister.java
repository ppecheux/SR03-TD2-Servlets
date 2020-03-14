/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pier
 */
@WebServlet(urlPatterns = {"/UserRegister"})
public class UserRegister extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>\n"
                    + "<head> <title>TODO supply a title</title> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width,\n"
                    + "initial-scale=1.0\">\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<form action=\"/mavenproject1/UserManager\" method=\"post\">\n"
                    + "<label> First name </label> <input type=\"text\" id=\"frname\" name=\"User first name\"/><br>\n"
                    + "<label> Familly name </label> <input type=\"text\" id=\"faname\" name=\"User familly name\"/><br>\n"
                    + "<label> Email </label> <input type=\"email\" id=\"email\" name=\"User email\"/> <br>\n"
                    + "<label> Password </label> <input type=\"password\" id=\"psw\" name=\"User password\"/><br>\n"
                    + "<label> male </label> <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" checked/><br>\n"
                    + "<label> female </label> <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\"/> <br>\n"
                    + "<input type=\"submit\" value=\"Submit\">\n"
                    + "</form>\n"
                    + "</body>\n"
                    + "</html>");
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
