package classanimal;

import java.util.Scanner;

public class TestAnimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số động vật: ");
        int n = sc.nextInt();
        sc.nextLine();
        Animal animal[]= new Animal[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" Nhập thông tin cho động vật thứ: "+  (i+1));


        }

    }
    public  static Animal info()
    {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        System.out.println(" Nhập tên: ");
        String ten  = sc.nextLine();

        System.out.println(" loài: ");
        String loai  = sc.nextLine();

        System.out.println(" tuổi: ");
        float tuoi = sc.nextFloat();

        System.out.println(" thức ăn: ");
        String thucan = sc.nextLine();

        animal = new Animal(ten,loai, tuoi, thucan);

        return animal;

    }
}
