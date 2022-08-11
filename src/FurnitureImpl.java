import java.util.Scanner;

public class FurnitureImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem furnitureItem = new FurnitureItem();
        System.out.println("Enter the furniture Code : ");
        furnitureItem.furnitureCode = sc.nextInt();

        System.out.println("Enter the furniture type :");
        sc.nextLine();
        furnitureItem.furnitureType = sc.nextLine();
        System.out.println("Enter grade of furniture :");
        furnitureItem.gradeOfFurniture = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter color of furniture :");
        furnitureItem.color = sc.nextLine();
        System.out.println("Enter where is the usage of furniture (indoor/outdoor)");
        furnitureItem.furnitureUsage = sc.nextLine();
        System.out.println("Enter the price of the furniture :");
        furnitureItem.price = sc.nextDouble();

        System.out.println("Code of the furniture is :" + furnitureItem.furnitureCode);
        System.out.println("Type of the furniture is :" + furnitureItem.furnitureType);
        System.out.println("Grade of the furniture is :" + furnitureItem.gradeOfFurniture);
        System.out.println("Color of the furniture is :" + furnitureItem.color);
        System.out.println("Furniture is to use :" + furnitureItem.furnitureUsage);

        if(furnitureItem.furnitureUsage.equalsIgnoreCase("indoor")){
            System.out.println("Price of the furniture is :" + furnitureItem.price);
        }

        if(furnitureItem.furnitureUsage.equalsIgnoreCase("outdoor")){
            System.out.println("Price of the furniture is :" + furnitureItem.discount(5));
        }





    }
}
