package org.example;

public class Review {
    private static double[][] rating;

    public Review(double[][] rating) {
        this.rating = rating;
        for (int i = 0; i < rating.length; i++) {
            rating[i][1] = 0.0;
            rating[i][0] = 0.0;
        }
    }


    public void addAverageRating(int fitnessIndex, int customerRating){
        double currentTotalRating = rating[fitnessIndex][0] * rating[fitnessIndex][1];
        rating[fitnessIndex][0] = (currentTotalRating + customerRating) / (rating[fitnessIndex][1] + 1);
        rating[fitnessIndex][1]++;
    }

    public double getAverageRating(int fitnessIndex){
        return rating[fitnessIndex][0];
    }

}
