import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Owner owner =new Owner("Peter",01444444,"mike@gmail.com");
        House house1 = new House("london, main street 42","its a beautiful flat",23,4444);
        House house2 = new House("london, main street 1","its amaizing",220,444124);
        House house3 = new House("miami, main street 2","its amaizing",220,444124);
        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which one want to delete?");
        int element = scanner.nextInt();
        element -=1;
        System.out.println(element);
        houses.get(element).setAddress("");


        System.out.println(houses);
    }
}
