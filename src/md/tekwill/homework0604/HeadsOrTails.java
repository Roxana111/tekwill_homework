package md.tekwill.homework0604;

import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0, tails = 0;
        int coin;
        System.out.println("Flipping a coin one million times");
        int i = 0;
        do {
            int n = random.nextInt(2);
            if (n == 0) {
                heads++;
            } else {
                tails++;
            }

            i++;

        }
        while (i < 1000000);
        System.out.println("Heads " + heads + "\nTails " + tails);
    }
}
