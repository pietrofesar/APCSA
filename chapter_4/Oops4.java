public class Oops4{
    public static void main(String[] args){
        int a = 7, b = 42;
        int smaller = Math.min(a, b);
        
        if(smaller == a){
            System.out.println("a is the smallest!");
        }
        else{
            System.out.println("b is the smallest");
        }
    }
}