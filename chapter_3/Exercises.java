import java.util.*;


public class Exercises{
    public static void main(String[] args){
        // printNumber(4);
        // printPowersOf2(4);
        // printPowersOfN(-2, 8);
        // printSquare(3, 7);
        // printGrid(4, 6);
        // System.out.println(largerAbsVal(-9, 5, 2));
        // quadratic(1, -7, 12);
        // System.out.println(lastDigit(-947));
        // System.out.println(area(2.0));
        // System.out.println(distance(1, 0, 4, 4));
        // System.out.println(scientific(6.23, 5));
        // System.out.println(pay(5.5, 6));
        // System.out.println(cylinderSurfaceArea(3.0, 4.5));
        // System.out.println(sphereVolume(2.0));
        // System.out.println(triangleArea(8, 5.2, 7.1));
        // System.out.println(padString("hello", 8));
        // vertical("hey now");
        // printReverse("hello there!");
        // inputBirthday();
        // processName();
        theNameGame();
    }
    
    // 1. $
    public static void printNumber(int n){
        //System.out.println("Enter the max number to print: ");
        //Scanner console = new Scanner(System.in);
        
        for(int i = 1; i <= n; i++){
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
    
    // 2. $
    public static void printPowersOf2(int n){
        for(int i = 0; i <= n; i++){
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }
    
    // 3. $
    public static void printPowersOfN(int b, int e){
        for(int i = 0; i <= e; i++){
            System.out.print((int)Math.pow(b, i) + " ");
        }
        System.out.println();
    }
    
    // 4. $$$ must go over modular math, not starting at zero
    public static void printSquare(int min, int max){
        int range = max - min + 1;
        int start = min;
        for(int i = 0; i < range; i++){
            for(int j = start; j < start + range; j++){
                // (n - min) % range + min
                System.out.print((j - min) % range + min);
            }
            start +=1;
            System.out.println();
        }
    }
    
    // 5. $$$
    public static void printGrid(int r, int c){
        for(int i = 1; i <= r; i++){
            for(int j = i; j < i + r * c; j+=r){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // 6. $
    public static int largerAbsVal(int m, int n){
        return Math.max(Math.abs(m), Math.abs(n)); 
    }
    
    // 7. $ 
    public static int largerAbsVal(int l, int m, int n){
        return Math.max(Math.max(Math.abs(l), Math.abs(m)), Math.abs(n));
    } 
    
    // 8. $$ broken right now
    public static void quadratic(int a, int b, int c){
        double discriminant = (int)Math.pow((int)Math.pow(b, 2) + 4*a*c, .5);
        System.out.println(discriminant);
        double root1 = (-b + discriminant) / (2*a);
        double root2 = (-b - discriminant) / (2*a);
        
        System.out.println((int)root1);
        System.out.println((int)root2);
    }
    
    // 9. $
    public static int lastDigit(int n){
        return n % 10;
    }
    
    // 10. $
    public static double area(double r){
        return Math.PI * Math.pow(r, 2); 
    }
    
    // 11. $
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.pow( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), .5);
    }
    
    // 12. $
    public static double scientific(double base, double e){
        return base * Math.pow(10, e);
    }
    
    // 13. $$$ not finished
    public static double pay(double salary, int hours){
        int ot = hours % 8;
        return (hours - ot * salary) + ot * salary * 1.5;
    }
    
    // 14. $ 
    public static double cylinderSurfaceArea(double r, double h){
        return 2 * Math.PI * Math.pow(r, 2) + 2 * r * Math.PI * h;
    }
    
    // 15. $$ required casting knowledge
    public static double sphereVolume(double r){
        return ((double)4)/3 * Math.PI * Math.pow(r, 3);
    }
    
    // 16. $
    public static double triangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.pow(s*(s - a) * (s - b) * (s - c) , .5);
    }
    
    // 17. $$$ change spaces to periods for visual confirmation
    public static String padString(String s, int len){
        int spaces = len - s.length();
        String temp = s;
        for(int i = 0; i < spaces; i++){
            temp += ".";
        }
        return temp;
    }
    
    // 18. $
    public static void vertical(String s){
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    
    // 19. $$ reverse for loop
    public static void printReverse(String s){
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    
    // 20 $$
    public static void inputBirthday(){
        Scanner console = new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        String day = console.nextLine();
        
        System.out.print("\nWhat is the name of the month in which you were born? ");
        String month = console.nextLine();
        
        System.out.print("\nDuring what year were you born? ");
        String year = console.nextLine();
        
        System.out.println("You were born on " + month + " " + day + ", " + year + ".");
    }
    
    // 21 $$ string slicing
    public static void processName(){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = console.nextLine();
        
        int space = name.indexOf(" ");
        System.out.println(name.substring(space + 1, name.length()) + " " + name.substring(0, space));
    }
    
    // 22 $$$$ string methods, slicing
    public static void theNameGame(){
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = console.nextLine();
        System.out.println();
        
        nameGameHelper(name.substring(0, name.indexOf(" ")));
        nameGameHelper(name.substring(name.indexOf(" ") + 1, name.length()));
    }
    
    public static void nameGameHelper(String name){
            System.out.println(name + " " + name + ", " + "bo-B" + name.substring(1, name.length()));
            System.out.println("Banana-fana fo-F" + name.substring(1, name.length()));
            System.out.println("Fee-fi-mo-M" +  name.substring(1, name.length()));
            System.out.println(name.toUpperCase() + "\n");
        }
}
