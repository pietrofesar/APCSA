public class Temperature{
    public static void main(String[] args){
        double tempf = 98.6;
        double tempc = 0.0;
        ftoc(tempf, tempc);
        System.out.println("Body temp in C is: " + tempc);
    }
    
    // converts Fahrenhet temperatures to Celsius
    public static void ftoc(double tempf, double tempc){
        tempc = (tempf - 32) * 5/9;
    }
}