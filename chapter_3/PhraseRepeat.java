import java.util.Scanner;


public class PhraseRepeat{
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("What is your phrase? ");
        String phrase = console.nextLine();
        
        System.out.println("How many times should I repeat it? ");
        int n = console.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println(phrase);
        }
    }
}