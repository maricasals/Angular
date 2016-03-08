/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servelet;

import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "DetailFilm", urlPatterns = {"/detail_film"})
public class DetailFilmServelet extends HttpServlet {

    FilmServiceMockImpl fService = new FilmServiceMockImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Film> l = new ArrayList();

        for (Film f :  l) {
            Film f2 = fService.findParId(Long.parseLong(req.getParameter("id")), l);
            req.setAttribute("FILM", f2);
            req.getRequestDispatcher("details_film.jsp").forward(req, resp);
        }

    }

}
