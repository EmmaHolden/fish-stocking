package com.fishstocker.backend;

public class Fish {
    private String name;
    private FishType typeOfFish;
    private int minTemp;
    private int maxTemp;
    private int minLitres;
    private int minPH;
    private int maxPH;
    private String[] dwellingLevel;

    public Fish(String name, FishType typeOfFish, int minTemp, int maxTemp, int minTankLitres, int minPH, int maxPH, String[] dwellingLevel) {
        this.name = name;
        this.typeOfFish = typeOfFish;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.minLitres = minTankLitres;
        this.minPH = minPH;
        this.maxPH = maxPH;
        this.dwellingLevel = dwellingLevel;
    }

    public String getName() { return name; }
    public FishType getTypeOfFish() { return typeOfFish; }
    public int getMinTemp() { return minTemp; }
    public int getMaxTemp() { return maxTemp; }
    public int getMinLitres() { return minLitres; }
    public int getMinPH() { return minPH; }
    public int getMaxPH() { return maxPH; }
    public String[] getDwellingLevel() { return dwellingLevel; }
}

