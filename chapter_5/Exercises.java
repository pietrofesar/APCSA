import java.util.*;

public class Exercises{
    public static void main(String[] args){
        
        // System.out.println(showTwos(12));
        // System.out.println(gcd(100, 20));
        // randomX();
        // randomLines();
        // makeGuesses();
        // diceSum();
        // randomWalk();
        // printFactors(0);
        // hopscotch(0);
        threeHeads();
    }    
    
    // 1. $$ need to know strings well 
    public static String showTwos(int n){
        
        String out = "n = ";
        int factor = 0;
        while(n % 2 == 0){
            n = n / 2;
            factor += 1;
        }
        for(int i = 0; i < factor; i++){
            out += "2 * ";
        }
        out += n;
       
        return out;
    }
    
    // 2. $$$ not correct
    public static int gcd(int min, int max){
        if(max == min){
            return max;
        }
        if(max == 0){
            return min;
        }
        if(min == 0){
            return max;
        }
        int temp = 0;
        if(max < min){
            temp = max;
            max = min;
            min = temp;
        } 
        while(max % min != 0){
            System.out.println(String.format("%d mod %d = %d", max, min, max%min));
            temp = min;
            min = max / min;
            max = temp;
        }
        return max / min;
    }
    // 3. $$
    
    //4. $
    public static void randomX(){
        Random r = new Random();
        int lines;
        do{
            lines = r.nextInt(16)+ 5;
            for(int i = 0; i < lines; i++){
                System.out.print("x");
            }
            System.out.println();
        }while(lines < 16);
    }
    
    // 5. $ need to go over ascii and char casting
    public static void randomLines(){
        Random r = new Random();
        int lines, chars, length;
        lines = r.nextInt(5) + 5;
        for(int i = 0; i < lines; i++){
            length = r.nextInt(80) + 1;
            for(int j = 0; j < length; j++){
                chars = r.nextInt(24) + 97;
                System.out.print((char)chars);
            }
            System.out.println();
        }
    }
    
    // 6. $$
    public static void makeGuesses(){
        Random r = new Random();
        int count = 0;
        int guess = 0;
        do{
            guess = r.nextInt(50) + 1;
            count++;
            System.out.println(String.format("guess = %d", guess));
        }
        while(guess <= 48);
        System.out.println(String.format("total guesses  = %d", count));
    }
    
    // 7. $$
    public static void diceSum(){
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        
        System.out.print("Desired dice sum: ");
        int n = console.nextInt();
        
        int sum = 0;
        while(sum != n){
            int a = r.nextInt(6) + 1;
            int b = r.nextInt(6) + 1;
            sum = a + b;
            System.out.println(String.format("%d and %d = %d", a, b, sum));
        }
        
        
    }
    
    // 8. $$
    public static void randomWalk(){
        Random r = new Random();
        int position = 0, max = 0;
        
        do{
            int step = r.nextInt(2);
            System.out.println(step);
            if(step != 0){
                position++;
                if(position > max){
                    max++;
                }
            }
            else{
                position--;
            }
            System.out.println(String.format("position = %d", position));
        }while(-3 < position && position < 3);
        System.out.println(String.format("max position = %d", max));
    }
    
    // 9. $$ not finished
    public static void printFactors(int n){
        System.out.print("1");
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                System.out.print(String.format(" and %d", i));
            }
        }
        System.out.println();
    }
    
    // 10. $$  3n + 1, fenceposts
    public static void hopscotch(int n){
        int hop = 1;
        System.out.println(String.format("  %d", hop));
        while(hop != (3 * n + 1)){
            System.out.println(String.format("%d   %d\n  %d", hop + 1, hop + 2, hop + 3));
            hop += 3;
        }
    }
    
    // 11. $$
    public static void threeHeads(){
        Random r = new Random();
        int heads = 0;
        while(heads != 3){
            if(r.nextBoolean()){
                heads++;
                System.out.print("H");
            }
            else{
                heads = 0;
                System.out.print("T");
            }
        }
        System.out.println("\nThree heads in a row!");
    }
}