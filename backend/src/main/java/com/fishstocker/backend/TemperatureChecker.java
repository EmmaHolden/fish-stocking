package com.fishstocker.backend;
import java.util.List;

public class TemperatureChecker {
    private boolean temperatureCompatible;
    private int minTemp;
    private int maxTemp;
    private int idealTemp;

    public TemperatureChecker(List<Fish> fishCandidates) {
        int min = 0;   // practical lower bound
        int max = 50;  // practical upper bound

        for (Fish candidate : fishCandidates) {
            min = Math.max(min, candidate.getMinTemp());
            max = Math.min(max, candidate.getMaxTemp());
        }

        if (min <= max) {
            this.temperatureCompatible = true;
            this.minTemp = min;
            this.maxTemp = max;
            this.idealTemp = (min + max) / 2;
        } else {
            this.temperatureCompatible = false;
            this.idealTemp = -1;
            this.minTemp = -1;
            this.maxTemp = -1;
        }
    }

    public boolean isCompatible() {
        return temperatureCompatible;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getIdealTemp() {
        return idealTemp;
    }

}

