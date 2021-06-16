package md.tekwill.homework0306.scoreTesting;

public class TestScores {
    private double[] score;
    double total = 0;

    public TestScores(double array[]) throws InvalidTestScore {
        for (int i = 0; i < array.length; i++) {
            score = new double[array.length];
            if (array[i] < 0 || array[i] > 100) {
                //throw new IllegalArgumentException("Invalid score found!");
                throw new InvalidTestScore("The scores can't be greater than 100 or smaller than 0! ");
            } else {
                score[i] = array[i];
                total += array[i];
            }
        }
    }

    public double getAverage() {
        return total / score.length;
    }

}
