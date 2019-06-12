public class ProgrammingProjects{
    public static void main(String[] args){
        christmasTree(4, 4);
    }
    // 1. $$$$$ patterns/series and for loops++++
    public static void christmasTree(int segments, int h){
        // s segments, h height, m middle
        int middle = (h*segments)/2;
        for(int s = 0; s < segments; s++){
            // print spaces
            for(int l = 1; l <= h; l++){
                for(int spaces = middle - l - s; spaces > 0; spaces--){
                System.out.print(" ");
                }
                // print stars
                for(int stars = 1; stars <= 2 * (s + l) - 1; stars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < middle - 1; j++){
            System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < middle - 4; i++){
            System.out.print(" ");
        }
        System.out.println("*******");
    }
    
}