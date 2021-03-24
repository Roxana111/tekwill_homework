package md.tekwill.homework2503;
import java.util.Scanner;
public class AnimalSounds {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        System.out.print("Input animal: ");
        String animal=in.nextLine();
        if(animal.toLowerCase().equals("wolf")) {
            System.out.print("Howl");
        }
        else if(animal.toLowerCase().equals("sheep")) {
            System.out.println("Baaa");
        }
        else if(animal.toLowerCase().equals("cat")) {
            System.out.println("Meow");
        }
        else if(animal.toLowerCase().equals("dog")) {
            System.out.println("Woof");
        }
        else
            System.out.println("Other sounds");
    }

}
