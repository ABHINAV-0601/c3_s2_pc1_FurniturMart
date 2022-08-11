import java.util.Scanner;

public class FurnitureImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem furnitureItem = new FurnitureItem();
        System.out.println("Enter the furniture Code : ");
        furnitureItem.furnitureCode = sc.nextInt();
        System.out.println("Enter the furniture type :");
        System.out.println();
        furnitureItem.furnitureType = sc.nextLine();
        System.out.println("Enter grade of furniture :");
        furnitureItem.gradeOfFurniture = sc.nextInt();
        System.out.println();
        System.out.println("Enter color of furniture :");
        furnitureItem.color = sc.nextLine();
        System.out.println("Enter where is the usage of furniture (indoor/outdoor)");
        furnitureItem.furnitureUsage = sc.nextLine();

    }
}
