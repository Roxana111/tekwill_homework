package md.tekwill.homework0306.scoreTesting;

public class Test {
    public static void main(String[] args) {
        double[] scores = {78.5, 100.0, 78.0, 43.0};
        double[] scores2 = {12.0, -90.8, 567.0, 765, 10.0};
        TestScores ex = null;
        try {
            ex = new TestScores(scores2);
        } catch (InvalidTestScore exception) {
            System.out.println(exception.getMessage());
        }


        try {
            ex = new TestScores(scores);
        } catch (InvalidTestScore exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("The average is: " + ex.getAverage());
    }
}
