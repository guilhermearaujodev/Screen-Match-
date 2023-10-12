public class Film {
    String name;
    int yearRelease;
    boolean includedInThePlan;
    double evaluation;
    int totalReviews;
    int durationInMinutes;

    //criando um método
    void displaysTechnicalSheet(){
        System.out.println("Film's name: " + name);
        System.out.println("Release year: " + yearRelease);
    }
}
