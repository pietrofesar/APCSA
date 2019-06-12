public class ComputePay{
    public static void main(String[] args){
        double PAY_RATE = 8.75;
        double TAX = .20;
        int hours = 4 + 5 + 8 + 4;
        
        // calculate pay at work based on hours worked each day
        System.out.println("My total hours worked each day:");
        System.out.println(hours);
        
        System.out.println("My hourly salary:");
        System.out.println("$8.75");
        
        System.out.println("My total pay:");
        System.out.println(hours * PAY_RATE);
        
        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(hours * PAY_RATE * TAX);
    }
}