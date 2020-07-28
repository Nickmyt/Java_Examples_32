import java.util.Random;

public class TernaryExample {
    public static void main(String[]args){
        Random rand = new Random();
        int army1 = rand.nextInt(200000);
        int army2 = rand.nextInt(200000);
        while(army1==army2){
            army1=rand.nextInt(200000);
            army2=rand.nextInt(200000);
        }
        String winner = (army1>army2)?"army1":"army2";
        if(winner.equals(army1)){
            System.out.println("The first army wins!");
        }else{
            System.out.println("The second army wins!");
        }
    }
}
