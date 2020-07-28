import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistExample2 {
    public static void main(String[]args) {
        ArrayList<String> array = new ArrayList<>();         //Createing the arraylist
        Scanner scan = new Scanner(System.in);               //Creating Scanner object
        System.out.println("Please insert 5 names");        //You must insert 10 names in the arraylist
        for (int i = 0; i <= 4; i++) {
            System.out.println("name"+i+":");
            String adder = scan.nextLine();
            array.add(adder);                                //We store the user input in the array list

        }

        Iterator<String> iterator = array.iterator();        //Printing the array using Iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
        Iterator<String> itr = array.iterator();             //Removing elements from the array list
        while (itr.hasNext()){
           String s=itr.next();                         //Storing the value of the current String from iterator to s
           if(s.length()<=1){                               //If the length of the string in the array is 1 or less it's deleted
               itr.remove();
          }
        }
        array.remove(0);

        System.out.println("Here is the new array:");       //Printing the new array
        for (String element:array) {
            System.out.println(element);
        }



       System.out.println("------------------------------");
        for(String i:array) {                              //Changing the elements of the array
                String s = scan.nextLine();                //User input
                array.set(array.indexOf(i), s);            //Changing the value in the index of the String

        }

        System.out.println("Here is the newest array:");
        for (String element:array) {
            System.out.println(element);
        }
    }
}
