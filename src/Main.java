import br.com.github.screenmatch.calculator.TimeCalculator;
import br.com.github.screenmatch.models.Film;
import br.com.github.screenmatch.models.Series;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("The Avengers");
        myFilm.setYearRelease(2012);
        myFilm.setDurationInMinutes(143);
        System.out.println("Duration film: " + myFilm.getDurationInMinutes());

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.avarageEvaluation());

        Series onePiece = new Series();
        onePiece.setName("One Piece");
        onePiece.setYearRelease(2023);
        onePiece.displaysTechnicalSheet();
        onePiece.setSeasons(1);
        onePiece.setEpisodesPerSeason(7);
        onePiece.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon the One Piece: " + onePiece.getDurationInMinutes());

        Film nextFilm = new Film();
        nextFilm.setName("Batman");
        nextFilm.setYearRelease(2022);
        nextFilm.setDurationInMinutes(177);
        System.out.println("Duration film: " + nextFilm.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(nextFilm);
        calculator.include(onePiece);
        System.out.println(calculator.getFullTime());
    }
}
