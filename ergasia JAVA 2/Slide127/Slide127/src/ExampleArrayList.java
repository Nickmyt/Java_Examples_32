import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[]args){
        ArrayList<String> array = new ArrayList<>();

        //Adding elements on the array list
        array.add("Django");
        array.add("Ripley");
        array.add("Peter");
        array.add("Zorbas");
        array.add("Keannu");

        //Deleting elements from arraylist
         array.remove(0);


        //Changing values in the arraylist
         array.set(0,"ernold");

        //Traversing array list
        for (String element:array) {

            System.out.println(element);
        }
    }
}
