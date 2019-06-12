public class Egg2{
    public static void top(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    
    public static void middle(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
    public static void main(String[] args){
        top();
        bottom();
        System.out.println();
        
        middle();
        
        top();
        bottom();
        
        System.out.println();
        middle();
        bottom();
        
        top();
        middle();
        bottom();
    }
}