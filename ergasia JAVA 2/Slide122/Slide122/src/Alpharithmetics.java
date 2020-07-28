public class Alpharithmetics {
    public static void main(String[]args){
         String letter1= "Alpha";                                   //We have different Strings
         String letter2="Beta";                                     //We compare the strings using different ways
         System.out.println(letter1==letter2);                      //false
         System.out.println(letter1.equals(letter2));               //false

         String pokemon1="pikachu";                                 //Same strings
         String pokemon2="pikachu";                                //We compare them using different methods
         System.out.println(pokemon1==pokemon2);                   //true
         System.out.println(pokemon1.equals(pokemon2));            //true
                                                                   //The Strings are equal because they have the same reference


         String company= new String("apple");             //Using the new() method , we create a new object int the heap memory
         String company2= new String("apple");            //Regardless if there is a string with the same value
         System.out.println(company==company2);                   //false
         System.out.println(company.equals(company2));            //true
    }
}
