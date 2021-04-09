package md.tekwill.homework0904;

public class PatternA {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.print("1 ");
            for (int k = i; k < 4; k++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
