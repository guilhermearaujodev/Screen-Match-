import br.com.github.screenmatch.calculator.RecommendationFilter;
import br.com.github.screenmatch.calculator.TimeCalculator;
import br.com.github.screenmatch.models.Episode;
import br.com.github.screenmatch.models.Film;
import br.com.github.screenmatch.models.Series;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("The avengers", 2012);
        //myFilm.setName("The Avengers");
        //myFilm.setYearRelease(2012);
        myFilm.setDurationInMinutes(143);
        System.out.println("Duration film: " + myFilm.getDurationInMinutes());

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.avarageEvaluation());

        Series onePiece = new Series("One Piece", 2023);
        //onePiece.setName("One Piece");
        //onePiece.setYearRelease(2023);
        onePiece.displaysTechnicalSheet();
        onePiece.setSeasons(1);
        onePiece.setEpisodesPerSeason(7);
        onePiece.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon the One Piece: " + onePiece.getDurationInMinutes());

        Film nextFilm = new Film("Batman", 2022);
        //nextFilm.setName("Batman");
        //nextFilm.setYearRelease(2022);
        nextFilm.setDurationInMinutes(177);
        System.out.println("Duration film: " + nextFilm.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(nextFilm);
        calculator.include(onePiece);
        System.out.println(calculator.getFullTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(onePiece);
        episode.setTotalViews(300);
        filter.filter(episode);

        var threeFilme = new Film("Joker", 2019);
        //threeFilme.setName("Joker");
       threeFilme.setDurationInMinutes(122);
       //threeFilme.setYearRelease(2019);
       threeFilme.evaluate(10);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(threeFilme);
        filmList.add(myFilm);
        filmList.add(nextFilm);
        System.out.println("List size " + filmList.size());
        //Escolhendo um filme da lista para imprimir
        System.out.println("first film " + filmList.get(0).getName());
        System.out.println(filmList);
        System.out.println("toString film " + filmList.get(0).toString());


    }
}
