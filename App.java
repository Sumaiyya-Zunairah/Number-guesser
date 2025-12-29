import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to the number geusser!");
        System.out.println("Pick a range!");
        System.out.println("What is the minimum value you want");
        int min = scanner.nextInt();
        System.out.println("What is the maximum value?");
        int max = scanner.nextInt();
        
        System.out.println("Okay I will now geuss the number!!");
        System.out.println("....");
        System.out.println("....");
        System.out.println("....");
        String no = "false";
        System.out.println("hello world");
        int count = 0;
        String output = " ";
        int [] arr = new int[max];
        int index = -1;

        while(no.equals("false")){
            index++;
            int value = generator(min, max, index, arr);
            System.out.println("is the number " + value + " Please enter yes/no");
            String answer = scanner.next();
            if (answer.equals("yes")){
                no = "true";
            
            } else {
                no = "false";
                count++;
            }
            if (count == max){
             System.out.println("I went through all the numbers...");
             System.out.println("Would you like to play again? yes/no");
             String againAnswerFirst = scanner.next();
                if(againAnswerFirst.equals("yes")){
                    for(int i = 0; i < max; i++){
                        arr[i] = 0;
                    }
                    game(scanner, max, min);
                } else {
                    no = "true";
                }
         }
         System.out.println("Thank you for playing!!");
         System.out.println("Would you like to play again? yes/no");
         String againAnswerLast = scanner.next();
         if(againAnswerLast.equals("yes")){
                    for(int i = 0; i < max; i++){
                        arr[i] = 0;
                    }
                    game(scanner, max, min);
                } else {
                   System.out.println("Have an amazing day it was fun playing with you!");
                }
         

         }
         

         if (count < max/2){
            output = "I did pretty good timewise!";

         } else {
            output = "Maybe I will get it faster next time...";
         }

         System.out.println("YAY IM SO HAPPY I DID IT IN " + count + " TRIES!!!");
         System.out.println(output);
        
        
    }
    public static int generator(int min, int max, int index, int[] arr){
        Random randy = new Random();
        int rand = randy.nextInt((max - min + 1)) + min;
        boolean now = false;
        
        while(!now){
            rand = randy.nextInt((max - min + 1)) + min;
            now = true;
            for (int i = 0; i < index; i++){
                if(arr[i] == rand){
                    now = false;
                    
            }
         
        }
      
    
    }
    arr[index] = rand;
    return rand;
     

}
    public static void game(Scanner scanner, int min, int max){
        System.out.println("Hello and welcome to the number geusser!");
        System.out.println("Pick a range!");
        System.out.println("What is the minimum value you want");
        min = scanner.nextInt();
        System.out.println("What is the maximum value?");
        max = scanner.nextInt();
        
        System.out.println("Okay I will now geuss the number!!");
        System.out.println("....");
        System.out.println("....");
        System.out.println("....");
       String no = "false";
        int count = 0;
        String output = " ";
        int [] arr = new int[max];
        int index = -1;

        while(no.equals("false")){
            index++;
            int value = generator(min, max, index, arr);
            System.out.println("is the number " + value + " Please enter yes/no");
            String answer = scanner.next();
            if (answer.equals("yes")){
                no = "true";
            
            } else {
                no = "false";
                count++;
            }
            if (count == max){
             System.out.println("I went through all the numbers...");
             System.out.println("Would you like to play again? yes/no");
             String againAnswerLast = scanner.next();
                if(answer.equals("yes")){
                    for(int i = 0; i < max; i++){
                        arr[i] = 0;
                    }
                }
         }

         }
         

         if (count < max/2){
            output = "I did pretty good timewise!";

         } else {
            output = "Maybe I will get it faster next time...";
         }

         System.out.println("YAY IM SO HAPPY I DID IT IN " + count + " TRIES!!!");
         System.out.println(output);
        
        
    }
}

