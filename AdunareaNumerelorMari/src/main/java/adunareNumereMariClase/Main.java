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
        int[] aux = console.sumOfBigNumbers();

        int i;
        if(aux[aux.length-1]==0)
            i = aux.length-2;
        else
            i = aux.length-1;
        for(; i>=0; --i)
        {
            System.out.print(aux[i]);
        }
    }
}
