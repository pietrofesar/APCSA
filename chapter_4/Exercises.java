import java.util.*;


public class Exercises{
    public static void main(String[] args){
        // System.out.println(fractionSum(5));
        // System.out.println(repl("hello", 3));
        // System.out.println(season(11, 16));
        // System.out.println(daysInMonth(31));
        // System.out.println(pow(2, 3));
        // printRange(5, 5);
        // smallestLargest();
        // evenSumMax();
        // printGPA();
        // longestName(4);
        // System.out.println(printTriangleType(2, 18, 2));
        // System.out.println(pow1(2, -3));
        // System.out.println(getGrade(95));
        // printPalindrome();
        // System.out.println(wordCount("  this string  has   wide   spaces"));
        // System.out.println(quadrant(0, -4.5));
        System.out.println(numUnique(3, 3, 3));
    }
    
    // 1. $
    public static double fractionSum(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1/(double)i;
        }
        return sum;
    }
    
    // 2. $
    public static String repl(String s, int n){
        if(n > 0){
            String temp = "";
            for(int i = 0; i < n; i++){
                temp += s;
            }
            return temp;
        }
        return "";
    }
    
    // 3. $$
    public static String season(int m, int d){
        if(m == 12){
            if(d == 16){
                return "winter";
            }
            else{
                return "fall";
            }
        }
        else if(m == 3){
            if(d == 16){
                return "spring";
            }
            else{
                return "winter";
            }
        }
        else if(m == 6){
            if(d == 16){
                return "summer";
            }
            else{
                return "spring";
            }
        }
        else if(m == 9){
            if(d == 16){
                return "fall";
            }
            else{
                return "summer";
            }
        }
        else if(m == 1 || m == 2){
            return "winter";
        }
         else if(m == 4 || m == 5){
            return "spring";
        }
         else if(m == 7 || m == 8){
            return "summer";
        }
        else{
            return "fall";
        }
    }
    
    // 4. $
    public static int daysInMonth(int m){
        if(m == 2){
            return 28;
        }
        else if(m == 4 || m == 6 || m == 9 || m ==11){
            return 30;
        }
        else{
            return 31;
        }
    }
    
    // 5. $
    public static int pow(int b, int e){
        int pow = 1;
        for(int i = 0; i < e; i++){
            pow *= b;
        }
        return pow;
    }
    
    // 6. $$
    public static void printRange(int n, int m){
        if(n == m){
            System.out.println(n);
        }
        else if (n > m){
            for(int i = n; i >= m; i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
             for(int i = n; i <= m; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    // 7. $$$$
    
    //8. $$
    public static void smallestLargest(){
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = console.nextInt();
        
        int s = 0, l = 0, t = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("\nNumber " + i + ": ");
            t = console.nextInt();
            if(t < s){
                s = t;
            }
            if(t > l){
                l = t;
            }
        }
        System.out.println("\nSmallest = " + s);
        System.out.println("Largest = " +  l);
    }
    
    // 9. $$
    public static void evenSumMax(){
        Scanner console = new Scanner(System.in);
        System.out.print("How many integers? ");
        int n = console.nextInt();
        
        int sum = 0, max = 0, t = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("\nNext integer? ");
            t = console.nextInt();
            if(t % 2 == 0){
                sum += t;
                if(t > max){
                    max = t;
                }
            }
        }
        System.out.println("\nEven sum = " + sum + ", Evem max = " + max);
    }
    
    // 10. $$$ not finished
    public static void printGPA(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String record = console.nextLine();
       
    }
    
    // 11. $$
    public static void longestName(int n){
        Scanner console = new Scanner(System.in);
        String longest = "";
        for(int i = 1; i <= n; i++){
            System.out.print("name #" + i  +"?");
            String temp = console.nextLine();
            if(temp.length() > longest.length()){
                longest = temp;
            }
        }
        String temp = longest.substring(0, 1).toUpperCase();
        temp += longest.substring(1, longest.length()).toLowerCase();
        System.out.println("\n" + temp);
    }
    
    // 12. $$ introducing exceptions
    public static String printTriangleType(int a, int b, int c){
        if(a + b < c || a + c < b || b + c < a){
            throw new IllegalArgumentException("Invalid sides entered for a triangle.");
        }
        if(a != b && b != c && a != c){
            return "scalene";
        }
        else if(a == b && b == c && a == c){
            return "equilateral";
        }
        else{
            return "isoceles";
        }
    }
    
    // 13. $$ not finished seems too easy
    public static double average(int a, int b){
        return 1;
    }
    
    // 14. $$ remember to abs(e) if using loop
    public static double pow1(int b, int e){
        if(e == 0){
            return 1;
        }
        else if(e < 0){
            System.out.println("e < 0");
            double p = 1.0/b;
            for(int i = 0; i < Math.abs(e) - 1; i++){
                p *= 1.0/b;
            }
            return p;
        }
        else{
            int p = b;
            for(int i = 0; i < e - 1; i++){
                p *= b;    
            }
            return p;
        }
    }
    
    // 15. $$$ use String.format for all returns
    public static String getGrade(int score){
        if(score < 0 || score > 100){
            throw new IllegalArgumentException("number entered is not valid");
        }
        else if(score < 60){
            return String.format("%.1f\n", 0.0);
        }
        else if(score < 63){
            return String.format("%.1f\n",0.7);
        }
        double grade = 0.8;
        for(int test = 63; test < 95; test++){
            if(score == test){
                return String.format("%.1f\n", grade);
            }
            else{
                grade += 0.1;
            }
        }
        return String.format("%.1f\n", 4.0);
    }
    
    // 16. $$
    public static void printPalindrome(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter one or more words: ");
        String entry = console.nextLine();
        
        String temp = "";
        for(int i = entry.length() - 1; i >= 0; i--){
            temp += entry.charAt(i);
        }
        
        if(entry.equals(temp)){
            System.out.printf("\nYou entered a palindrome;\n%s\nis the same as\n%s\n", entry, temp);
        }
        else{
            System.out.printf("\nYou did not enter a palindrome;\n%s\nis different than\n%s\n", entry, temp);
        }
    }
    
    // .18 $$$$ not finished
    /*
    public static int wordCount(String entry){
        entry = entry.trim();
        if(entry.equals(" ") || entry.equals("")){
            return 0;
        }
        
    }
    */
    
    // 19. $
    public static int quadrant(double x, double y){
        if(x > 0 && y > 0){
            return 1;
        }
        else if(x < 0 && y > 0){
            return 2;
        }
        else if(x < 0 && y < 0){
            return 3;
        }
        else if(x > 0 && y < 0){
            return 4;
        }
        else{
            return 0;
        }
    }
    
    // 20. $$
    public static int numUnique(int a, int b, int c){
        if(a == b && a == c){
            return 1;
        }
        else if(a == b || b ==c || a == c){
            return 2;
        }
        else{
            return 3;
        }
    }
    
    // 21. $$$ not started
    
}