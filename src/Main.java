public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Avengers";
        myFilm.yearRelease = 2012;
        myFilm.durationInMinutes = 143;

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(5);
        myFilm.evaluate(7);
        myFilm.evaluate(4);
        System.out.println(myFilm.sumOfEvaluation);
        System.out.println(myFilm.totalReviews);
        System.out.println(myFilm.avarageEvaluation());
    }
}
