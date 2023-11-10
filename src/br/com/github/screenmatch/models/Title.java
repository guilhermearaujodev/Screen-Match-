package br.com.github.screenmatch.models;

public class Title implements Comparable<Title>{
    private String name;
    private int yearRelease;
    private boolean includedInThePlan;
    private double sumOfEvaluation;
    private int totalReviews;
    private int durationInMinutes;

    public Title(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    //método para printar o nome e o ano de lançamento do filme
    public void displaysTechnicalSheet(){
        System.out.println("name: " + name);
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
