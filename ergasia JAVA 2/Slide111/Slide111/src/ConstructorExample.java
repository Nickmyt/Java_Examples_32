
class Adam{
    Adam(){ System.out.println("Adam is created"); }                    //Constructor of Adam class
}

class Eve{                                                              //Constructor of Eve class
    Eve(){System.out.println("Eve is created");}
}

class  Kain{
    int age;
    Kain(){System.out.println("Kain is created");}
    Kain(int age){                                                    //Overloaded constructor
        this.age = age;                                               //Assigns Kain's age
        System.out.println("Kain is created with age");
    }
    void Show(){System.out.println(age);}
}
class Able{                                                           //Constructor using Access modifiers
    private Able(){                                                   //this cannot be called outside the class
        System.out.println("Able was created");
    }
   public static Able accesscons(){                                   //We create a method so we can gain access ton constructor
        Able obj = new Able();                                        //Creates an obj and returns it
        return obj;
   }
}


public class ConstructorExample {
    public static void main(String[]args){
        Adam adam = new Adam();                                   //Calling constructors
        Eve eve = new Eve();
        Kain kain = new Kain();                                   //Calling Kain constructor
        Kain kain2 = new Kain(32);                           //Calling overloaded Kain constructor
        kain2.Show();
        Able obj2 = Able.accesscons();                           //Creating an obj2 to access the accesscons() method
    }
}
