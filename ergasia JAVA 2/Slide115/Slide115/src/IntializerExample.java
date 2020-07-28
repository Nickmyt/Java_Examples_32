
class Example1 {
    Example1() {
        System.out.println("Constructor is called second");                    //The constructor is executed after the initializer block
    }

    {
        System.out.println("The initializer block is invoked first");          //The initializer block is executed before the constructor
    }

}



public class IntializerExample {
    public static void main(String[]args){
        Example1 example1 = new Example1();                                    //We create an object to call initializer block and constructor
    }
}
