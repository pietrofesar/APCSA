public class ScratchPad2{
    
    public static void sc2(){
        // 2.1.2
        int a = 1 + 2 * 3 + 7 * 2 % 5;
        System.out.println(a); // 11
    }
    
    public static void sc3(){
        // 2.1.3
        System.out.println(2 + 3 * 4 - 6); // a = 8
        System.out.println(14 / 7 * 2 + 30 / 5 + 1); // b = 11
        System.out.println((12 + 3) / 4 * 2); // c = 6
        System.out.println((238 % 10 + 3) % 7); // d = 4
        System.out.println((18 - 7) * (43 % 10)); // e = 33
        System.out.println(2 + 19 % 5 - (11 * (5 / 2))); // f = -16
        System.out.println(813 % 100 / 3 + 2.4); // g = 6.4
        System.out.println(26 % 10 % 4 *3); // h = 6
        System.out.println(22 + 4 * 2); // i = 30
        System.out.println(23 % 8 % 3); // j = 1
        System.out.println(12 - 2 - 3); // k = 7
        System.out.println(6/2 + 7/3); // l = 5
        System.out.println(6 * 7 % 4); // m = 2
        System.out.println(3 * 4 + 2 * 3); // n = 18
        System.out.println(177 % 100 % 10 / 2); // o = 3
        System.out.println(89 % (5 + 5) % 5); // p = 4
        System.out.println(392 / 10 % 10 / 2); // q = 4
        System.out.println(8 * 2 - 7 / 4); // r = 15
        System.out.println(37 % 20 % 3 * 4); // s = 8
        System.out.println(17 % 10 / 4); // t = 1
    }
    
    public static void sc4(){
        // 2.1.4
    System.out.println(4.0 / 2 * 9 / 2); // a = 9.0
    System.out.println(.5 * 2 + 8 / 5.0 + 10 / 3); // b =  5.4-
    System.out.println(12 / 7 * 4.4 * 2 / 4); // c = 2.2
    System.out.println(4 * 3 / 8 + 2.5 * 2); // d = 6.0
    System.out.println((5 * 7.0 / 2 - 2.5) / 5 * 2); // e = 6.0
    System.out.println(41 % 7 * 3 / 5 + 5/ 2 * .5); // f = 4.0
    System.out.println(10.0 / 2 / 4); // g = 1.25
    System.out.println(8 / 5 + 13 / 2 / 3.0); // h = 3.0
    System.out.println((2.5 + 3.5) / 2); // i = 3.0
    System.out.println(9 / 4 * 2.0 - 5 / 4); // j = 3.0
    System.out.println(9 / 2.0 + 7 / 3 - 3.0 / 2); // k = 5.0
    System.out.println(813 % 100 / 3 + 2.4); // l = 6.4
    System.out.println(27 / 2 / 2.0 * (4.3 + 1.7) - 8 / 3); // m = 37
    System.out.println(53 / 5 / (0.6 + 1.4) / 2 + 13 / 2); // n = 8.5
    System.out.println(2 * 3 / 4 * 2 / 4.0 + 4.5 - 1); // o = 4.0
    System.out.println(89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2); // p = 4.8
    }
    
    public static void sc5(){
        System.out.println(2 + 2 + 3 + 4); // a = 11
        System.out.println("2 + 2" + 3 + 4); // b = 4.8
        System.out.println(2 + "2 + 3" + 4); // c = 4.8
        System.out.println(3 + 4 + "2 + 2"); // d = 4.8
        System.out.println("2 + 2" + (3 + 4)); // e = 4.8
        System.out.println("(2 + 2)" + (3 + 4)); // f = 4.8
        System.out.println("hello 34" + 2 * 4); // g = 4.8
        System.out.println(2 + "(int) 2.0" + 2 * 2 + 2); // h = 4.8
        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11/3); // p = 4.8
        System.out.println(8 + 6 * -2 + 4 + "0" + (2 + 5)); // p = 4.8
        System.out.println(1 + 1 + "8 - 2" + (8 - 2) + 1 + 1); // p = 4.8
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3); // p = 4.8
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9)); // p = 4.8
    }
    
    public static void sc7(){
        int age;
        String sex;
        double height;
        
        age = 10;
        sex = "female";
        height = 300.4;
        
        System.out.println(age + ' ' + sex + ' ' + height);
    }
    
    public static void sc11(){
        int number = 345;
        System.out.println(345 % 100 / 10);
        System.out.println(345 % 1000 / 100);

    }
    
     public static void sc12(){
         int a = 5;
         int b = 10;
         int c = b;
         
         a = a + 1;
         b = b - 1;
         c = c + a;
        System.out.println(a + " " + b + " " + c);
    }
    
     public static void sc15(){
        int first = 8, second = 19;
        System.out.println(first + " " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println(first + " " + second);
    }
    
    public static void main(String[] args){
        sc5();
    }
}