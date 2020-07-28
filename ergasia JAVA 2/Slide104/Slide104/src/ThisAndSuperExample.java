import java.util.Scanner;

class Pringles{                                                //Parent class
    String chips;
    int price;
   }
    class Lays extends Pringles{                               //Child class through extension
        String chips;
        int price;
        void assingpotatoes(String a,String b,int aa,int bb){
            this.chips= a;                                     //We are referening to the Strings chips variable in class Lays
            super.chips= b;                                    //We are refering to the Strings chips variable in parent class Pringles
            this.price = aa;                                   //We are refering to the int price instance in class Lays
            super.price = bb;                                  //We are refrencing the itn price from parent class
        }
        void printpotatoes(){
            System.out.println(this.chips);                    //Prints the string chips of the this class Lays
            System.out.println(this.price);                    //Prints the int price of this class Lays
            System.out.println(super.chips);                   //Prints the string chips of the parent class Pringles
            System.out.println(super.price);                   //Prints the int price of parent class Pringles
        }


}




public class ThisAndSuperExample {
    public static void main(String[]args){
        Lays lays = new Lays();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your favourite chips:");
        System.out.println("Chip 1:");
        String a = scan.nextLine();
        System.out.println("Chip 2:");
        String b = scan.nextLine();
        lays.assingpotatoes(a,b,1,2);                           //Calls the assingpotatoes() method and
        lays.printpotatoes();                               //Calls the printpotatoes() method and prints the Strings we gave earlier
    }
}
