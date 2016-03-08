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
import servlettest.service.SerieServiceMockImpl;
import servlettetest.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieController {

    SerieServiceMockImpl serieService = new SerieServiceMockImpl();

    public void serieNull(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String e = "Erreur - La liste de films est vide !!";

        req.setAttribute("ERREUR", e);
        req.getRequestDispatcher("liste_serie_vide_erreur.jsp").forward(req, resp);

    }

    public void listerSeries(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> listSeries = serieService.listerTout();
        String t = "Liste des series";

        req.setAttribute("mesSeries", listSeries);
        req.setAttribute("TITRE", t);
        req.getRequestDispatcher("lister_serie.jsp").include(req, resp);

    }

    public void detailsSerie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> listSeries = new ArrayList();

        for (Serie s : listSeries) {
            Serie sTrouve = serieService.findParId(Long.parseLong(req.getParameter("id")), listSeries);
            req.setAttribute("SERIE", sTrouve);
            req.getRequestDispatcher("details_serie.jsp").forward(req, resp);
        }
    }
}
