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
import servlettest.controller.FilmController;
import servlettest.controller.SerieController;

/**
 *
 * @author admin
 */
@WebServlet(name = "FrontControllerServlet", urlPatterns = {"/front_controller"})
public class FrontControllerServlet extends HttpServlet {

    private FilmController filmController = new FilmController();
    private SerieController serieController = new SerieController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("_CSS.jsp").include(req, resp);
        req.getRequestDispatcher("_TITRE.jsp").include(req, resp);
        req.getRequestDispatcher("_MENU.jsp").include(req, resp);

        String page = req.getParameter("page");

        if (page == null) {
            filmController.filmNull(req, resp);
            return;
        }
        if (page == null) {
            serieController.serieNull(req, resp);
            return;
        }

        
        if (page.equals("lister_film")) {
            filmController.listerFilms(req, resp);
        }

        if (page.equals("lister_serie")) {
            serieController.listerSeries(req, resp);
        }

        
        
        if (page.equals("details_film")) {
            filmController.detailsFilm(req, resp);
        }

        if (page.equals("details_serie")) {
            serieController.detailsSerie(req, resp);
        }

        
        
        req.getRequestDispatcher("_PIED.jsp").include(req, resp);

    }

}
