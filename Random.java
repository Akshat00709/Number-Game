import java.util.*;
public class Random{
    public static void guessingnumber(){
        Scanner sc=new Scanner(System.in);
        int number=1+ (int)(100*Math.random());
        int K =4;
        int i,guess;
        System.out.println("A number is choosen between 1 to 100 . Guess number within 4 trials");
        for(i=0;i<K;i++){
            System.out.println("Guess the number:");
            guess=sc.nextInt();
            if(number== guess){
                System.out.println("Congratulations you guessed the right number!!"+guess);
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != K - 1){
                System.out.println("The number is less than " + guess);
            }
        }
        if (i == K) {
            System.out.println("You have exhausted K trials.");
            System.out.println("The number was " + number);
    }
    }
    public static void main(String[] args){
        guessingnumber();
    }
}                        


        