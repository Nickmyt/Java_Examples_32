import java.util.Scanner;

class Drawing{
    private int pencil=3;        //this variable has scope inside class , or a Class Variable
    public String painter;       //We declare an instance variable
    void shade(int x){
        int brokenpen=1;                   //this variable has scope only inside method , it is a Local Variable
        System.out.println(this.pencil);
        this.pencil=x;                     //We change the pencil variable using the parameter 
        System.out.println(this.pencil);
        this.pencil= this.pencil - brokenpen;  //We change the this.pencil variable using the Local Variable
        System.out.println(this.pencil);
    }
}




public class ScopeExample {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();            //we input a variable so we can use it in the method shade()
        Drawing draw = new Drawing();
        draw.shade(x);
        draw.painter = "Da Vinci";            //We initiate the instance variable through an other class
    }
}
