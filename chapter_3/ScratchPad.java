import java.util.Scanner;  


public class ScratchPad{
    public static void main(String[] args){
        /*
        System.out.println(Math.abs(-1.6)); // 1.6
        System.out.println(Math.abs(2 + -4)); // 2.0
        System.out.println(Math.pow(6, 2)); // 36.0
        System.out.println(Math.pow(5 / 2, 6)); // 64.0
        System.out.println(Math.ceil(9.1)); // 10.0
        System.out.println(Math.ceil(115.8)); // 116.0
        System.out.println(Math.max(7, 4)); // 7
        System.out.println(Math.min(8, 3 + 2)); // 5
        System.out.println(Math.min(-2, -5)); // -5
        System.out.println(Math.sqrt(64)); // 8.0
        System.out.println(Math.sqrt(76 + 45)); // 11.0
        */
        Scanner console = new Scanner(System.in);
        System.out.print("How much money do you have? ");
        double money = console.nextDouble();
        
        System.out.println(money);
    }
}