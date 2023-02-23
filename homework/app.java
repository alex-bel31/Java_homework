package Java_homework.homework;
import java.util.Scanner;

public class app{

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int value = getNumberByUser("Введите T(n): ");
        System.out.printf("T(%d) = %d", value, calculation(value));
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static int calculation(int value){
        int result = value*(value + 1)/2;
        return result;
    } 
}


