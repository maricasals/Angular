/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servelet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlettest.service.FilmServiceMockImpl;
import servlettetest.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmsServelet", urlPatterns = {"/lister_films"})
public class ListerFilmsServelet extends HttpServlet { 

    private FilmServiceMockImpl filmService = new FilmServiceMockImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Film> f = filmService.listerTout();
        String t = "Liste des films";
        String e = "Erreur - La liste de films est vide !!";

//        // Envoie l'attribut mesFilms vers ma JSP
//        req.setAttribute("mesFilms", f);
//        
//        // Ajouter titre
//        req.setAttribute("TITRE", t);
        //Si la liste de films et vide envoyer un erreur generique
        if (f.isEmpty()) 
        {
            req.setAttribute("ERREUR", e);
            req.getRequestDispatcher("liste_films_vide_erreur.jsp").forward(req, resp);

        } 
        else 
        {
            req.setAttribute("mesFilms", f);
            req.setAttribute("TITRE", t);
            req.getRequestDispatcher("lister_film.jsp").forward(req, resp);
        }

//        //Renvoie ma main vers notre JSP
//        req.getRequestDispatcher("lister_film.jsp").forward(req, resp);
    }

}
