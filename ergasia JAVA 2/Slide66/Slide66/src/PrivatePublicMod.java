

public class PrivatePublicMod{  //

    public static void main(String[]args){
        Simple simple = new Simple();
        //System.out.println(simple.num);  *num can't be used here since its private and is only accessible in the Simple class
        System.out.println("Please look at the comments to understand this number:"+simple.num2);  //As you can see num2 can be used since it's declared public


    }

}
class Simple{
    private int num = 121;
    public int num2= 80085;

}