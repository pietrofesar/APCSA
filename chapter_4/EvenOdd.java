import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = console.nextInt();
        
        if(num % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}