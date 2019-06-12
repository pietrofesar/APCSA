public class Exercises{
    public static void main(String[] args){
        exc17();
        
    }
    
    // $ need to go over units in detail
    public static void exc1(){
        double s0 = 0, v0 = 5, a = 4, t = 120;
        double s = s0 + v0*t + .5*a*Math.pow(t, 2);
        System.out.println(s);
    }
        
    // *
    public static void exc2(){
        for(int i = 1; i <=10; i++){
            System.out.print((int)Math.pow(i, 2) + " ");
        }
    }
    
    // $$$$$
    /*
    public static void exc3(){
        
        public static 
        
        for(int i = 0; i < 12; i++){
            
        }
    }
    */
    
    // $
    public static void exc4(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // $$
    public static void exc5(){
        for(int i = 1; i <= 5; i++){
            for(int stars = i; stars > 0; stars--){
                System.out.print("*");
            }
            for(int spaces = -i + 5; spaces >= 0; spaces--){
                System.out.print(" ");
            }
                System.out.println();
        }
    }
    
    // $$
    public static void exc6(){
        for(int i = 1; i <= 7; i++){
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
             System.out.println();
        }
    }
    
    // $$$
    public static void exc7(){
        for(int i = 1; i <= 5; i++){
            for(int j = -i + 5; j > 0; j--){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
    
    // $$$
    public static void exc8(){
        for(int i = 1; i <= 5; i++){
            for(int j = -i + 5; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    // $$$$
    public static void exc9(){
        for(int i = 0; i < 40; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= 40; i+=4){
            System.out.print("_-^-");
        }
        System.out.println();
        for(int i = 0; i <= 1; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(j % 10);
                System.out.print(j % 10);
            }
        }
        System.out.println();
        for(int i = 0; i < 40; i++){
            System.out.print("-");
        }
    }
    
    // $$$
    public static void exc10(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i = 0; i < 6; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(j % 10);
            }   
        }
    }
    
    //$$$
    public static void exc11(){
        for(int i = 0; i < 10; i++){
            System.out.print("    |");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(j % 5);
            }
        }
        System.out.println();
        for(int i = 0; i < 7; i++){
            System.out.print("       |");
        }
        System.out.println();
        for(int i = 0; i < 7; i++){
            for(int j = 1; j <= 8; j++){
                System.out.print(j % 8);
            }
        }
        
    }
    
    // $$$
    public static void exc12(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 3; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
    // $$$
    public static void exc13(){
        for(int i = 0; i < 5; i++){
            for(int j = 9; j >= 0; j--){
                for(int k = 0; k < 5; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
    // $$$
    public static void exc14(){
        for(int i = 0; i < 4; i++){
            for(int j = 9; j >= 0; j--){
                for(int k = j; k > 0; k--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
    //$$$$
    public static void exc15(){
        for(int i = 1; i <= 5; i ++){
            for(int j = -i + 6; j > 0; j--){
                System.out.print("-");
            }
            int n = 2 * i - 1;
            for(int j = 2 * i - 1; j > 0; j--){
                System.out.print(n);
            }
            for(int j = -i + 6; j > 0; j--){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
    //$$$$$
    public static void exc16(){
        for(int i = 1; i <= 6; i++){
            int slash = 2 * i - 2;
            for(int j = slash; j > 0; j--){
                System.out.print("\\");
            }
            for(int j = -4* i + 26; j > 0; j--){
                System.out.print("!");
            }
            for(int j = slash; j > 0; j--){
                System.out.print("/");
            }
            System.out.println();
        }
    }
    
    //$$$$$ doesn't work
    public static void exc17(){
        int HEIGHT = 4;
        for(int i = 1; i <= HEIGHT; i++){
            int slash = 2 * HEIGHT - 2;
            for(int j = slash; j > 0; j--){
                System.out.print("\\");
            }
            for(int j = 4 * HEIGHT - 2; j > 0; j--){
                System.out.print("!");
            }
            for(int j = slash; j > 0; j--){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}