import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plant Katya = new Plant(10, 7,8);
        Plant HHHH = new Plant(6, 7,8);
        Plant FFFF = new Plant(10, 7,8);
        Plant JJJJ = new Plant();
        Plant KKKK = new Plant();
        Katya.getFlower();
        Katya.Print();
        Scanner in = new Scanner(System.in);
        int sunpower, waterpower;
        System.out.println("Enter how much water power get plant: ");
        waterpower = in.nextInt();
        System.out.println("Enter how much sun power get plant: ");
        sunpower = in.nextInt();



        System.out.println("with: ");
        Katya.Grow(waterpower, sunpower);
        Katya.Print();
        Katya.IfFlowerCanReproduce();



        //Katya.IfLeafCanDieRightNow();
    }
    }