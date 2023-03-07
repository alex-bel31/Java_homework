package homework;

public class Program {
    public static void main(String[] args) {
        Product food = new Food("Food", 100, 100, "22.02.1977");
        System.out.println(food.toString());
        Product eggs = new Eggs("Eggs", 97, 10, "10 дней", 10);
        System.out.println(eggs.toString());
        Product diapers = new Diapers("Diapers", 200, 12, "12.02.2022", 0,
        false, 5, 25, 30, "type");
        System.out.println(diapers.toString());
        Product ex2 = new KidsProduct(null, 0, 0, null, 0, false);
        System.out.println(ex2.toString());
        Product mask = new Masks("Mask", 700, 3, "10 дней", 3);
        System.out.println(mask.toString());
    }
}
