

interface Comet{                        //Creating the Comet interface
    void extinction();

}



interface Dinosaur{                     //Creating Dinosaur class
    void suprise();
}




public class AnonymousInterfaceExample {
    public static void main(String[]args){

            new Comet(){                           //Implementing interface Comet through anonymous class instance
                public void extinction(){
                    System.out.println("Oh no the comet is heading to earth!!!");
                }
            }.extinction();                        //executing the instance


           new Dinosaur(){         //Creating an instance of anonnymous class  by implementing Interface Dinosaur
              public void suprise() {
                  System.out.println("Wait what did you say?");
              }
          }.suprise();
                                    //Executing the method of the instatnce
    }


}
