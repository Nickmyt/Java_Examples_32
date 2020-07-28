

class Skroutz{                                         //Class Skroutz that has the initial method and return statement
   int PriceofPS4(){
        System.out.println("look at the at the other stores");
        return 0;
    }

}
class Public extends Skroutz{                         //Class Public overrides the method from Skroutz
    int PriceofPS4(){                                 //It changes the System.out and the number of the return
        System.out.println("Here is the price");
        return 400;
    }
}
class Germanos extends Skroutz{                      //Class germanos does the same as class public
    int PriceofPS4(){
        System.out.println("Here is the price");
        return 350;
    }
}
class Eshop extends Skroutz{                      //Does the same as Public and Germanos
    int PriceofPS4(){
        System.out.println("Here is the price");
        return 420;
    }
}
class EshopDiscount extends Eshop{                //Class EshopDiscount extends Eshop and overrides the alredy overriden method from Eshop
    int PriceofPS4(){
        System.out.println("Here is the NEW price");
        return 345;
    }
}
public class OverridingExample {
    public static void main(String[]args){

                 Public store1 = new Public();                  //We create objects of the different classes and print their methods results
                 System.out.println("Public store  :   "+store1.PriceofPS4());

                 Germanos store2 = new Germanos();
                System.out.println( "Germanos store :  "+store2.PriceofPS4());

                Eshop store3 = new Eshop();
                System.out.println("Eshop store    :  "+store3.PriceofPS4());

                EshopDiscount store4 = new EshopDiscount();
                 System.out.println("Discount from Eshop   :  "+store4.PriceofPS4());
    }
}
