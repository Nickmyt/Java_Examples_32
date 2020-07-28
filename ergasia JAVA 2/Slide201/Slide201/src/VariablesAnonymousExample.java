import java.util.Random;
import java.util.Scanner;

class Day{
    int date = 12619;
   void heat(){}
}



public class VariablesAnonymousExample {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        Random rand = new Random();
        int celcious = rand.nextInt();
        final String hour = "10";
        new Day(){
            void heat(){
                //x = 12;                                           //We cannot change it since it is not effectively final
                System.out.println(date);                         //Variable date is a member variable of Day parent class , so we can access it
               // celcious = rand.nextInt();                       //Compile error , this changes it making it not effectively final
                if (celcious>45){                                //We can use celcious but we cannot change it
                    System.out.println("Celcious : "+celcious);
                    System.out.println("It's pretty hot today!");
                }else{
                    System.out.println("Celcious: "+celcious+"We can handle it!");
                }
               System.out.println("The hour is : "+hour );
               String hour2 = hour;
            }
        }.heat();
    }
}
