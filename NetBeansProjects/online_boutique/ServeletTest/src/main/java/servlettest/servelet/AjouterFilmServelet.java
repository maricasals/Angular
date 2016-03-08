/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlettetest.entity.Film;
import servlettetest.entity.Genre;

/**
 *
 * @author admin
 */
@WebServlet(name = "ajouter_film_servelet", urlPatterns = {"/ajouter_film_servelet"})
public class AjouterFilmServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Creation d'un film
//        Film f = new Film();
//        
//        f.setId(1L);
//        f.setTitre("XX");
        
        //
        System.out.println(req.getParameter("titre"));
    }
    

}
