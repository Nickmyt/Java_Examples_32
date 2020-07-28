
class Notebook{
    private int pages = 50;
    int writen(int homework){             //*We have two methods Writen() and writen2() , they execute the same thing
        int newnote= pages - homework;    //*the difference is in the return method, since void cannot have a return statement
        return newnote;                   //*we use the System.out to show the newhomework variable
    }
    void writen2(int homework){
        int newnote = pages - homework;
        System.out.println(newnote);
    }
}

class Oof{
    void tired(int hours){
        if(hours<6){
            System.out.println("I am really tired");   //here we dont get a compile error because the return statement is last when reach it the flow stops and returns to main
            return;

        }else{
            hours++;
        }
    }
}

public class ReturnExample {
    public static void main(String[]args){
             int homework = 10;
             Notebook note = new Notebook();
             note.writen(homework);
             note.writen2(homework);
             Oof oof = new Oof();
             int hours = 5;
             oof.tired(hours);
             oof.tired(hours+2);
    }
}
