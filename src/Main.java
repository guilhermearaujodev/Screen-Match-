import br.com.github.screenmatch.models.Film;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Avengers";
        myFilm.yearRelease = 2012;
        myFilm.durationInMinutes = 143;

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.avarageEvaluation());
    }
}
