/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "ImportServlet", urlPatterns = {"/ImportServlet"})
public class ImportServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("_CSS.jsp").include(req, resp);
        req.getRequestDispatcher("_TITRE.jsp").include(req, resp);
        req.getRequestDispatcher("_MENU.jsp").include(req, resp);
        req.getRequestDispatcher("_PIED.jsp").include(req, resp);
    }
 
}
