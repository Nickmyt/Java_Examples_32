

class Goudys{
    static int burger(int pr,int ingredients){                              //We create two methods with thee same name , but different data on the arguments
        System.out.println("THe number of ingredients:"+ingredients);
        return pr+ingredients;
    }
    static double burger(double pr,double ingredients){                    //If we had same data arguments we would get a compile error because of the ambiguity
        System.out.println("The number of ingredients:"+ingredients);
        return pr+ingredients;

    }
}
class McDonalds{                                                          //Method overloading by different number of variables
     static int products(int prod){return prod*2;}                        //This method get the num of products and multiplies by 2
     static int products(int prod,int newprod){return (prod+newprod)*2;}  //We have different num variables,here we also add new products
}






public class OverloadExample {
    public static void main(String[]args){
        System.out.println(Goudys.burger(4,5));
        System.out.println(Goudys.burger(2.14,3));
        System.out.println(McDonalds.products(46));
        System.out.println(McDonalds.products(46,6));
      
    }
}
