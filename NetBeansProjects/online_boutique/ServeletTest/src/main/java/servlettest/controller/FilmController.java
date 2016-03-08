/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlettest.service.FilmServiceMockImpl;
import servlettetest.entity.Film;

/**
 *
 * @author admin
 */
public class FilmController {
    
    private FilmServiceMockImpl filmService = new FilmServiceMockImpl();
    FilmServiceMockImpl fService = new FilmServiceMockImpl();
    
    public void filmNull(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String e = "Erreur - La liste de films est vide !!";

        System.out.println("Blablabalaa");
        req.setAttribute("ERREUR", e);
        req.getRequestDispatcher("liste_films_vide_erreur.jsp").forward(req, resp);

    }

    public void listerFilms(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> f = filmService.listerTout();
        String t = "Liste des films";

        req.setAttribute("mesFilms", f);
        req.setAttribute("TITRE", t);
        req.getRequestDispatcher("lister_film.jsp").include(req, resp);

    }

    public void detailsFilm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> l = new ArrayList();

        for (Film film : l) {
            Film f2 = fService.findParId(Long.parseLong(req.getParameter("id")), l);
            req.setAttribute("FILM", f2);
            req.getRequestDispatcher("details_film.jsp").forward(req, resp);
        }
    }
    
}
