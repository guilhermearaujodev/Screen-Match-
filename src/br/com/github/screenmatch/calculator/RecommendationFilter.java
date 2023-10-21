package br.com.github.screenmatch.calculator;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classification classification){
        if (classification.getClassification() >= 4) {
            System.out.println("is among the favorites of the moment");
        } else if (classification.getClassification() >= 2){
            System.out.println("Highly rated");
        }else {
            System.out.println("Watch later");
        }
    }
}
