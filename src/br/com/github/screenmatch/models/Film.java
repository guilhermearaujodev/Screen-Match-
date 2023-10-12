package br.com.github.screenmatch.models;

public class Film {
    private String name;
    private int yearRelease;
    private boolean includedInThePlan;
    private double sumOfEvaluation;
    private int totalReviews;
    private int durationInMinutes;

    public int getTotalReviews(){
        return totalReviews;
    }

    //método para printar o nome e o ano de lançamento do filme
    public void displaysTechnicalSheet(){
        System.out.println("br.com.github.screenmatch.models.Film's name: " + name);
        System.out.println("Release year: " + yearRelease);
    }
//soma das notas e total de avaliações
    public void evaluate(double note){
        sumOfEvaluation += note;
        totalReviews++;
    }
//média das avaliações
    public double avarageEvaluation(){
        return sumOfEvaluation / totalReviews;
    }
}
