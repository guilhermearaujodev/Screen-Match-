package br.com.github.screenmatch.models;

import br.com.github.screenmatch.calculator.Classification;

public class Film extends Title implements Classification {
  private String director;

    public Film(String name) {
        this.setName(name);
    }

    public Film() {
    }

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

    @Override
    public String toString() {
        return "Film: " + this.getName() + " (" + this.getYearRelease() + ")";
    }
}

