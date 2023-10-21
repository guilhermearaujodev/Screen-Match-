package br.com.github.screenmatch.calculator;

import br.com.github.screenmatch.models.Title;

public class TimeCalculator {
    private int fullTime = 0;

    public int getFullTime() {
        return fullTime;
    }

//    public void include (Film f) {
//        this.fullTime += f.getDurationInMinutes();
//    }
//
//    public void include (Series s) {
//        this.fullTime += s.getDurationInMinutes();
//    }
//}

public void include(Title title){
        this.fullTime += title.getDurationInMinutes();
    }
}