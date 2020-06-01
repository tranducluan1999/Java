package classanimal;

import java.util.Scanner;
                // String name, String spiece, float age, String food
public class TestAnimal {
    public static void main(String[] args)
    {
        Animal animal  = new Animal();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Name of animal: ");
        String ten = sc.nextLine();

        System.out.println(" Spiece of animal: ");
        String loai = sc.nextLine();

        System.out.println(" Age of animal: ");
        float tuoi = sc.nextFloat();
        sc.nextLine();

        System.out.println(" Food of animal: ");
        String doan = sc.nextLine();


        animal = new Animal(ten, loai, tuoi, doan);
        System.out.println(animal);


    }
}
