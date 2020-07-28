

//public class NotWorking{}                  //There can be only one public class
//public interface NOt WorkingToo{}          //Same here


interface A1{}                 //We can create as many interfaces as we want, as long they are not public

interface B2{}

interface G3{}




class A implements A1{          //We can create as many classes as we want , as long they are not public
    void show(){
        System.out.println("Class a");
    }
}

class B implements B2{
    void show2(){
        System.out.println("Class b");
    }
}

class G implements G3{
    void show3(){
        System.out.println("Class g");
    }
}

public class TakeANoteExample {    //There can be only one Top public class in a java source file ,witch the source file is named after
    public static  void main(String[]args){
           A a = new A();
           B b = new B();
           G g = new G();
           a.show();
           b.show2();
           g.show3();
    }
}
