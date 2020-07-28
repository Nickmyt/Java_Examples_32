 class Fridge{
    static int water=4;
    int soda=6;
    static void drink(){
       // System.out.println("I drank about"+soda+"sodas")      *We cannot access a non-static variable through a static method
        System.out.println("I drank about  "+water+"  bottles of water");  //We cam access static variables
    }
    void buy(){
        System.out.println("I bought "+soda+"bottles of soda");  //A non-static method can access static variables
    }

}

public class ExampleProspelasi {
    public static void main(String[]args){
        Fridge fridge = null;
        fridge.drink();                                        //The object may be null but it


    }
}
