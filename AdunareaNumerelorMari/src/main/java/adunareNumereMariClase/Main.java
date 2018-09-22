package adunareNumereMariClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        String num1 = sc.nextLine();
        System.out.println("Introudceti al doilea numar: ");
        String num2 = sc.nextLine();
        BigNumbersConsole console =new  BigNumbersConsole(num1, num2);
        console.sumOfBigNumbers();
    }
}
