import br.com.github.screenmatch.models.Film;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("The Avengers");
        myFilm.setYearRelease(2012);
        myFilm.setDurationInMinutes(143);

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total Reviews: " + myFilm.getTotalReviews());
        System.out.println(myFilm.avarageEvaluation());
    }
}
