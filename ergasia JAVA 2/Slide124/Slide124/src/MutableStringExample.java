public class MutableStringExample {
    public static void main(String[]args){
         StringBuilder str = new StringBuilder("Steak");   //We create a String using StringBuilder class
         System.out.println(str);

         str.append(" burger");                           // The original string is changed
         System.out.println(str);                         //Prints steak burger

        str.replace(0,12,"Pizza");        //We completely replace the previous String
        System.out.println(str);

        str.delete(2,5);                                 //We delete a portion of the String
        System.out.println(str);

        str.insert(2,"e is cool");           //We insert a string to specific index of the previous String
        System.out.println(str);

        str.reverse();                                  //We reverse the String
        System.out.println(str);
        str.reverse();

        System.out.println(str.charAt(5));              //We can find the character in the specific position

        System.out.println(str.length());               // We print the length of the String
    }
}
