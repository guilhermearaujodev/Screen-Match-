public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Avengers";
        myFilm.yearRelease = 2012;
        myFilm.durationInMinutes = 143;

        myFilm.displaysTechnicalSheet();
    }
}
