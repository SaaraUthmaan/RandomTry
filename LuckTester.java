import java.util.Random;
import java.util.Scanner;

public class LuckTester {
    public static void main(String[] args) {
        Scanner userReply = new Scanner(System.in);
        System.out.println("Pick a number");
        int userNumber = userReply.nextInt();
        
        Random luck = new Random();
            int number = luck.nextInt(Integer.MAX_VALUE) + 1;
            System.out.println(number + " ");
           
           int difference = userNumber - number; 
            
        if(number == userNumber){
            System.out.println("You are an AMAZING Guesser!");
        }else{
            System.out.println("You were off by "+ Math.abs(difference) +" . Try harder next time.");
        }    
    }
    
}
