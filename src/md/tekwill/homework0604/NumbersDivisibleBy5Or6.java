package md.tekwill.homework0604;

public class NumbersDivisibleBy5Or6 {
    public static void main(String[] args) {
        int numberPerLines = 10;
        int count = 0;
        int i = 100;
        while (i <= 1000) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % numberPerLines == 0)
                    System.out.println(i);

                else
                    System.out.print(i + " ");
            }
            i++;
        }

    }

    }

