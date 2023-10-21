package br.com.github.screenmatch.models;

import br.com.github.screenmatch.calculator.Classification;

public class Film extends Title implements Classification {
  private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) avarageEvaluation() / 2;
    }
}
