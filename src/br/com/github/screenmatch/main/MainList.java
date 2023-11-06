package br.com.github.screenmatch.main;

import br.com.github.screenmatch.models.Film;
import br.com.github.screenmatch.models.Series;
import br.com.github.screenmatch.models.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Film myFilm = new Film("The avengers", 2012);
        Film nextFilm = new Film("Batman", 2022);
        var threeFilme = new Film("Joker", 2019);
        Series onePiece = new Series("One Piece", 2023);

        ArrayList<Title> list = new ArrayList<>();
        list.add(threeFilme);
        list.add(myFilm);
        list.add(nextFilm);
        list.add(onePiece);
        for (Title item: list) {
            System.out.println(item.getName());
            System.out.println();
        }
    }
}
