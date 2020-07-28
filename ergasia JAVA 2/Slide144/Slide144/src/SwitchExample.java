import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[]args){
        System.out.println("What character status would you like to see?");     //Project where you can see information about a character


        System.out.println("1.Name");                                             //Showing available statuses
        System.out.println("2.Health");
        System.out.println("3.Damage");
        System.out.println("4.Level");

        Scanner scan = new Scanner(System.in);                                 //Chose which field you want base on number
        System.out.println("Insert the number of the filed you want");
        int choice = scan.nextInt();

        while(choice>6 && choice<0){                                          //While loop to input data check
            choice = scan.nextInt();
        }
        While(choice!=6){
            switch (choice) {                                                     //Switch operator to get us to the correct case
                case 1:
                    System.out.println("Oryx");                                  //Prints name
                    break;
                case 2:
                    Random rand = new Random();                                  //Give u s a random number of Health
                    int H = rand.nextInt(100);
                    System.out.println("Health : " + H);
                    break;
                case 3:
                    System.out.println("Your damage is:" + 25.7 + "%");              //Damage output of the character
                    break;
                case 4:
                    System.out.println("Your level is: MAXIMUM!");               //Show character level
            }
        }
    }
}
