public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = 0;
        color = null;
        furnitureUsage = null;
        price = 0.0;
    }

    public double discount(int discountPercentage){
            return price - (price * discountPercentage/100);

    }
}
