package io.zipcoder;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        /**

         Create a program that asks the user how many pets they have.
         Once you know how many pets they have, ask them what kind of pet each one is,
         along with each pet's name.
         For now your program should just hold onto the user input and
         print out the list at the end; we'll modify this in part 3.*/
        int totalPets;
        String petType;
        String petName;
        ArrayList<PetClass> petInfo = new ArrayList<PetClass>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! How many pets do you have?");
        totalPets = scan.nextInt();
        scan.nextLine();

        //ask them what kind of pet each one is, along with each pet's name.
        for (int i = 0; i < totalPets; i++) {
            System.out.println("What kind of pet is this?(Dog,Cat or Reptile)");
            //waits for input to be entered before continuing on to the nextline
            petType = scan.nextLine();
            System.out.println("What is the name of this pet?");
            petName = scan.nextLine();
            //compares incoming string to case and stores appropriate object for info entered by user
            switch (petType.toLowerCase()) {
                case "dog":
                    petInfo.add(new Dog(petName));
                    break;
                case "cat":
                    petInfo.add(new Cat(petName));
                    break;
                case "reptile":
                    petInfo.add(new Reptile(petName));
                    break;
                default:
                    System.out.printf("%s is an invalid pet type.", petType);
            }

        }

        //iterate over an arrayList using an enhanced for loop. use getter to return name and call method
        for (PetClass obj : petInfo) {
            System.out.printf("My pet %s says %s%n", obj.getName(), obj.speak());
        }
        //will call comparable
        Collections.sort(petInfo);
        int count = 0;
        for (PetClass obj : petInfo) {
            count++;
            System.out.printf("Pet %d is %s%n", count, obj.getName());
        }
        //will call comparator
        Collections.sort(petInfo, new PetCompare());
        for (PetClass obj : petInfo) {
            System.out.printf("I am a %s%n.", obj.getClass());
        }
    }

}

