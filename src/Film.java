public class Film {
    String name;
    int yearRelease;
    boolean includedInThePlan;
    private double sumOfEvaluation;
    private int totalReviews;
    int durationInMinutes;

    int getTotalReviews(){
        return totalReviews;
    }

    //método para printar o nome e o ano de lançamento do filme
    void displaysTechnicalSheet(){
        System.out.println("Film's name: " + name);
        System.out.println("Release year: " + yearRelease);
    }
//soma das notas e total de avaliações
    void evaluate(double note){
        sumOfEvaluation += note;
        totalReviews++;
    }
//média das avaliações
    double avarageEvaluation(){
        return sumOfEvaluation / totalReviews;
    }
}
