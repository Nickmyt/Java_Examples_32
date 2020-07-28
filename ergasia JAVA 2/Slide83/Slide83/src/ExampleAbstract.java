 abstract class Try{      //Creaating an abstract class
    abstract void poli();  //Abstract class can include abstract and non-abstract methods
    void poli2(){
        System.out.println("An abstract class doesn't have to have only abstract methods!");
    }
}

abstract class Try2{  //An abstract class doesn't haw to have an abstract method
    void exm1(){};
    void exm2(){};
}
class ExtensionExmp extends Try{
    void poli() {
        System.out.println("We implement the abstract class through this class");
    }
}

public class ExampleAbstract {
    public static void main(String[]args){
        Try obj1= new ExtensionExmp();  //We create an object
        obj1.poli2();                   //We can call both abstract and non-abstract method
        obj1.poli();
        }
    }

