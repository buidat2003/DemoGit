/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package bai2;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name="exerices2_2", urlPatterns={"/exerices2_2"})
public class exerices2_2 extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet exerices2_2</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet exerices2_2 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("index.html");
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    String country = request.getParameter("country");
    String zip = request.getParameter("zip");
    String purchased = request.getParameter("purchased");
    String shop = request.getParameter("shop");
    String internet = request.getParameter("internet");
    String feedback = request.getParameter("feedback");

    response.setContentType("text/html;charset=UTF-8");

    try (PrintWriter out = response.getWriter()) {
   
   
        out.println("<h1>Information Submitted:</h1>");
        out.println("<p>First Name: " + fname + "</p>");
        out.println("<p>Last Name: " + lname + "</p>");
        out.println("<p>Email Address: " + email + "</p>");
        out.println("<p>Address: " + address + "</p>");
        out.println("<p>City: " + city + "</p>");
        out.println("<p>Country: " + country + "</p>");
        out.println("<p>Zip: " + zip + "</p>");
        out.println("<p>Have purchased books in campus bookstore? " + purchased + "</p>");
        out.println("<p>Which bookstore do you shop in? " + shop + "</p>");
        out.println("<p>Have you ever purchased books on the internet? " + internet + "</p>");
        out.println("<p>How does shopping on the internet compared to shopping in a campus bookstore? " + feedback + "</p>");

    }
}


    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
