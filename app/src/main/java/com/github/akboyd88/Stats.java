package com.github.akboyd88;

import java.util.ArrayList;
import java.util.List;

public class Stats {
    private List<Long> executionTimes = new ArrayList<>();

    public void addTime(long executionTime) {
        this.executionTimes.add(executionTime);
    }

    public long getMean() {
        long sum = 0;
        for(long delta : executionTimes){
            sum+=delta;
        }
        return sum/executionTimes.size();
    }
}