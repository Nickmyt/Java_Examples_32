
 class Examino{

    void Java(){
        System.out.println("Yay i passed with a good grade!!");

    }
    void Analisi(){
        System.out.println("Oops i didn't pass");
    }
}
 class Year extends Examino{                                             //Class Year extends Class Examino
    void exp(){
        System.out.println("Well , it has been a good year thus far");
    }
    void retur(Examino a){
        if(a instanceof Examino){
            Year b =(Year)a;    //Downcasting using instanceof
            System.out.println("This doen;t really serve a purpose but we just downcasted the a object");
        }
    }
}





public class ExampleInstatnceOf {
    static public void main(String[]args){
        Year year = new Year();
        System.out.println(year instanceof Examino);               //It will return true since class Year inherits Examino class and thus object year id an instance of Examino
        year=null;
        System.out.println(year instanceof  Examino);              //It will return false since null object 
        year.exp();                                                //We can call methods from
        year.Analisi();
        year.Java();
        Examino ex = new Year();
        ((Year) ex).retur(ex);                                    //We call the retur method to downcast the ex object


    }
}
