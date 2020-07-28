

class House{
    static int rooms=6;                       //We declare both of the variables static so the static nested class can access them
    static int people=2;
    String n = "Untouchable";                 //this string variable cannot be accessed by the static class Space
    static class Space{                       //Creating a static nested class
        void show(){ System.out.println("This house has"+rooms+"rooms."); }
        static void show2(){System.out.println("The people that live here are:"+people); }
    }

    interface Enikio{                        //We don't need to declare it static since it is static by default
        void pay();
    }
}

class Test implements House.Enikio {

   public void pay() {System.out.println("You must pay the rent!!");

    }
}


public class ExampleStatic {
    public static void main(String[]args){
        House.Space obj = new House.Space(); //We create an object of the nested class through the outer class
        obj.show();                          //Since the show method is non-static we can only access it through an object
        House.Space.show2();                 //The show2 method is static so we don't need an object to access it
    }
}
