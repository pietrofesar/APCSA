import java.util.Scanner;

public class SumNumbers{
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the low number: ");
        int low = console.nextInt();
        
        System.out.println("Enter the high number: ");
        int high = console.nextInt();
        
        int sum = 0;
        
        for(int i = low; i <= high; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}