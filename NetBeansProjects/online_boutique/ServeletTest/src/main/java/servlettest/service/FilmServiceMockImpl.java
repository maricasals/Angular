/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.service;

import java.util.ArrayList;
import java.util.List;
import servlettetest.entity.Film;

/**
 *
 * @author admin
 */
public class FilmServiceMockImpl {

    public List<Film> listerTout() {
        List<Film> l = new ArrayList();

        Film f1 = new Film();
        Film f2 = new Film();

        f1.setTitre("Titre1");
        f1.setId(3L);
        f2.setTitre("Titre12");
        f1.setId(4L);

        l.add(f1);
        l.add(f2);

        l.add(new Film(1L, "Kung fu panda"));
        l.add(new Film(2L, "Up"));
        return l;
    }

    public Film findParId(Long id, List<Film> listFilm) {
        Film f1 = new Film();
        Boolean trouve = Boolean.FALSE;
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getId() == id)
            {
                f1=listFilm.get(i);
            }
        }
        return f1;
    }
}
