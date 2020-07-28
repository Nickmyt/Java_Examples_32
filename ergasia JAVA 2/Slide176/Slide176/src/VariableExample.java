class Bakery{
    String name;
    int workers;
    String adress;
}
interface Process{
    void baking(int time);
}

class BakeryStats extends Bakery implements Process{
    void Printbakerysname(){
        System.out.println("The bakery's name is :"+name);
    }
    void printnumberofemploys(){
        System.out.println("The number of workers is : "+workers);
    }
    void printadress(){
        System.out.println("The address is : "+ adress);
    }
    public void baking(int time){
         System.out.println("Baking time is about :"+time);
    }
}

public class VariableExample {
    public static void main(String[]args){

        Bakery bakery = new BakeryStats();
        bakery.adress="Astros 24";
        bakery.name="Artoplegma";
        bakery.workers=5;

        BakeryStats bakeryStats = new BakeryStats();             //We acc
        bakeryStats.adress="Astros 24";
        bakeryStats.name="Artoplegma";
        bakeryStats.workers=5;
        bakeryStats.printadress();
        bakeryStats.Printbakerysname();
        bakeryStats.printnumberofemploys();
        bakeryStats.baking(20);

        Process process1 = new BakeryStats();         //We can refer to object variable using typecating specificaly Downcasting
        process1.baking(143552353);
        ((BakeryStats) process1).name="Karampati";

       Object obj1 = new BakeryStats();           //We can refernce an object variable through  object class using downcasting
       ((BakeryStats) obj1).adress="13 kolokotroni";
       ((BakeryStats) obj1).printadress();
    }
}
