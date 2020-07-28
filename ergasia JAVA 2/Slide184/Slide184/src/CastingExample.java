


class Supermarket{                                           //creating a Class Supermarkert
    String address;
    void goodrate(){
        System.out.println("this supermarket is good");
    }
    void badrate(){
        System.out.println("This supermarket is not good");
    }
    void printaddress(){
        System.out.println("supermarket address:  "+ address);
    }
}
interface Price{                                            //Creating interface Price
    void pricing();
}

class Sklavenitis extends Supermarket implements Price{    // Creating subclass Sklavenitis , implements Price
    public void pricing(){
        System.out.println("Sklavenitis has good products and pricing");
    }
}

class AB extends Supermarket implements Price{             //Creating subclass AB, implements Price
    public void pricing(){
        System.out.println("AB has good products");
    }

}






public class CastingExample {
    public static void main(String[]args){
        byte cast = 12;                            //Widening casting from byte to double
        System.out.println("It's a Byte: "+cast);
        short cast2 = cast;
        System.out.println("Now it's a short: "+cast2);
        int cast3 = cast2;
        System.out.println("Now it's a int: "+cast3);
        long cast4= cast3;
        System.out.println("Now it's a long:  "+cast4);
        float cast5 = cast3;
        System.out.println("Now it's a float:  "+cast5);
        double cast6 = cast5;
        System.out.println("Now it's a double:  "+cast6);
System.out.println("--------------------------------------------");

        double reverscast = 3.1415926535897932384626;   //Narrowing casting from double to byte
        System.out.println("It's a double: "+reverscast);
        float reverscast2 = (float) reverscast;
        System.out.println("Now it's a float: "+reverscast2);
        long reverscast3 = (long) reverscast2;
        System.out.println("Now it'a a long: "+reverscast3);
        int reverscast4 = (int) reverscast3;
        System.out.println("Now it's a int: "+reverscast4);
        short reverscast5 = (short) reverscast4;
        System.out.println("Now it's a short: "+reverscast5);
        byte reverscast6 = (byte) reverscast5;
        System.out.println("Now it's a byte: "+reverscast6);


System.out.println("---------------------------------");


        Sklavenitis sklavenitis = new Sklavenitis();               //Creating Sklavenitis object
        sklavenitis.address="kapodistriou 6";                      //Calling some methods from superclass
        sklavenitis.printaddress();


        Object obj1 = new Sklavenitis();             //Downcasting the object of Master class Object
        ((Sklavenitis) obj1).pricing();              //variable obj1 maybe an instance of Sklavenitis but the compiler thinks the method doesn't exists on Object
         ((Sklavenitis) obj1).goodrate();                                            //So we Downcast it to gain access to all methods of Sklavenitis class

        AB ab = new AB();
        Supermarket market = ab;                    //Implicit Upcasting from AB to Supermarket
        //market.pricing()                         * we can not invoke anything that is specific to AB
       market.address="Solomou 57";
        market.printaddress();                                           //We havent changed the AB instance but we have restricted some of the methods it can use
    }
}
