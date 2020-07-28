

class Papei {                                                    //Class Papei contains foitites and kathigites
    int foitites;
    int kathigites;

    void setFoitites(int x) {                                  //Sets the number of foitites
        this.foitites = x;
    }

    void setKathigites(int y) {                                //Sets the number of kathigites
        this.kathigites = y;
    }

    void peopleThatStudy() {                                  //Prints the number of foitites
        System.out.println(foitites);
    }

    void peopleThatGrade() {                                  //Prints the number of kathigites
        System.out.println(kathigites);
    }
}
class Results extends Papei{                                //Class Results that extends Papei
    void showresults(){
        System.out.println("Out of  "+foitites+" foitites , only 1045 passed all the classes"); //We use  super to
    }
    void kourasi() {
        System.out.println("All of the  " + super.kathigites + " kathigites are tired");
    }
    void examino(){
        System.out.println("The mood is not very good....");
    }
}

    public class InheritenceExample {
        public static void main(String[] args) {
           Results set = new Results();

            set.setFoitites(2000);
            set.setKathigites(45);
            set.peopleThatStudy();
            set.peopleThatGrade();

            set.showresults();
            set.kourasi();
            set.examino();
        }
    }
