package md.tekwill.homework0304;

public class SumOfRationalNumbers {
    public static void main(String[] args) {
        float number1, number2;
        float sum = 0f;
        for (number1 = 1f, number2 = 3f; number1 <= 97f; number1 += 2f, number2 += 2f) {
            sum += number1 / number2;
        }
        System.out.print("sum of 1/3+3/5+5/7+...+95/97+97/99 is: " + sum);
    }
}
