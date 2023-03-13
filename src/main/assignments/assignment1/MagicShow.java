package main.assignments.assignment1;

import main.assignments.assignment1.animals.*;
import java.util.*;
public class MagicShow {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Animal[] farmAnimals = {new Dog("Rex", "a bone"),
                new Cat("Kripke", "mice"),
                new Chicken("Clarke", "leftover eggshells"),
                new Pig("Beaumont", "assorted grains"),
                new Duck("Andrew", "bread crumbs")
        };
        boolean magicShow = true;
        Animal magicBox = null;
        System.out.println("Let the magic show begin!!");
        System.out.println("Call an animal and knock on the box. The box will then magically produce that animals sound!");
        while (magicShow) {
            System.out.println("boxi boxi, my magic boxi, can you make a sound of a...");
            String requestedAnimal = sc.nextLine();
            switch (requestedAnimal) {
                case "dog":
                    magicBox = farmAnimals[0];
                    break;
                case "cat":
                    magicBox = farmAnimals[1];
                    break;
                case "chicken":
                    magicBox = farmAnimals[2];
                    break;
                case "pig":
                    magicBox = farmAnimals[3];
                    break;
                case "duck":
                    magicBox = farmAnimals[4];
                    break;
                default:
                    System.out.println("That is not an animal on the farm! Try again: ");
                    continue;
            }
            System.out.println("Knock Knock!");
            magicBox.makeSound();
            System.out.println("Do you want to call another animal? (y/n)");
            String keepGoing = sc.nextLine();
            if (keepGoing.equals("n")) {
                System.out.println("Thank you for coming to the magic show!!!");
                magicShow = false;
            } else if (!keepGoing.equals("y")) {
                System.out.println("Type y or n to answer the question next time!");
            }

        }
    }
}




