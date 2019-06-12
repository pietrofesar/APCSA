import java.util.Scanner;

public class Donation{
    public static void main(String[] args){
        int sum = 1000;
        int total = 0;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Is your money multiplied 1 or 2 times? ");
        int times = console.nextInt();
        
        System.out.println("And how much are you contributing? ");
        int donation = console.nextInt();
        
        total += ((donation * times) + sum);
        System.out.println(total);
    }
}