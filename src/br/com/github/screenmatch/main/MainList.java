package br.com.github.screenmatch.main;

import br.com.github.screenmatch.models.Film;
import br.com.github.screenmatch.models.Series;
import br.com.github.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Film myFilm = new Film("The avengers", 2012);
        myFilm.evaluate(8);
        Film nextFilm = new Film("Batman", 2022);
        myFilm.evaluate(8);
        var threeFilme = new Film("Joker", 2019);
        myFilm.evaluate(9);
        Series onePiece = new Series("One Piece", 2023);

        ArrayList<Title> list = new ArrayList<>();
        list.add(threeFilme);
        list.add(myFilm);
        list.add(nextFilm);
        list.add(onePiece);
        for (Title item : list) {
            System.out.println(item.getName());
            if (item instanceof Film film && film.getClassification() > 2) {
                System.out.println("classification " + film.getClassification());
            }
        }

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Tom Holland");
        searchByArtist.add("Robert Pattinson");
        searchByArtist.add("Guilherme");
        System.out.println(searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println("after orgenation");
        System.out.println(searchByArtist);
        System.out.println("list of ordered titles");
        Collections.sort(list);
        System.out.println(list);
    }
}
