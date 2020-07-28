import java.util.Random;            //Importing java random

class Formula{                     //Creating class Formula
    void Triangle() {
        Random rand = new Random();

        int x = rand.nextInt(16);        //Giving both sides a raondom integer to create a random triangle based on Pythogoras theorem
        int y = rand.nextInt(25);
        int z = x ^ 2 + y ^ 2;
        System.out.println("Here are the sides a triangle based ont the Pythogoras theorem:");   //Printing the sides
        System.out.println("Katheti 1 :"+ x );
        System.out.println("Katheti 2 : "+y);
        System.out.println("Ypotinousa  :"+z);
    }
}


public class ExtendExistingClassExample {
    public static void main(String[]args){
         Formula obj = new Formula(){          //Creating an object of FOrmula class
            void Triangle(){                   //Creating an anonumous class that extends the previous the previous and changing the method Triangle
                Random rand = new Random();
                int x = rand.nextInt(125);    //Making sure all the sides are the same
                int y = x;
                int z =x;
                int j = x;
                System.out.println("Here is a square with an area of:  "+(x^2));   //Printing the Area of the Triangle

            }
        };

    obj.Triangle();                                                           //Calling the Triangle method using the obj
    }
}

