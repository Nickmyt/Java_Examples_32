
class book{
    final int numOfBooks;     //We create a Final variable without intializing it
    book(){                   //If we want to initialize the Final variable we can only do it through a constructor
        numOfBooks=10;
    }
}


final class Author{       //We create a Final class , by being Final we cannot extend it
    String name = "G.R.R.Martin";
    void sayname(){
        System.out.println("The author's name is :"+name);
    }
}

class Price {
    int price = 30;
    final void retail(){System.out.println(price);} //We create a final method
}
class Store extends Price{
  // We will get a compile error if we un-comment the next comment since the method void is final and thus it cannot change
    //   void retail(){System.out.println("i changed")}

}

public class FinalExmple {
    public static  void  main(String[]args){
        Author obj1 = new Author();   //We can create an object of a final class
        obj1.sayname();
        Price obj2 = new Price();
        obj2.retail();               //The final method works almost like a regural method
    }
}
