/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.service;

import java.util.ArrayList;
import java.util.List;
import servlettetest.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieServiceMockImpl {

    public List<Serie> listerTout() {
        List<Serie> listSerie = new ArrayList();

        Serie serie = new Serie(1L, "Friends");
        Serie serie2 = new Serie(2L, "Game of Thrones");
        Serie serie3 = new Serie(3L, "Prision breack");
        
        listSerie.add(serie);
        listSerie.add(serie2);
        listSerie.add(serie3);
        
        return listSerie;
    }

    public Serie findParId(Long id, List<Serie> listSerie) {
        Serie serie = new Serie();
        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getId() == id)
            {
                serie=listSerie.get(i);
            }
        }
        return serie;
    }
}
