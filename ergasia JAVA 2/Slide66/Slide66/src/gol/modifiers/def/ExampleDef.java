package gol.modifiers.def;
import com.modifiers.example.*;
import gr.exampleprotected.yeah.*;

public class ExampleDef extends ExampleProtected{

    public static void main(String[] args) {
        //ExamplePublic examp = new ExamplePublic();
        // *If we un-comment this we get a compile error since the ExamplePublic class is not public and thus can't be accessed outside the package
        // examp.Exec
        //Since the Class ExamplePublic is not public we can't use any of it's variables
         Mesg();

         ExampleProtected Exmpro = new ExampleProtected();
         Exmpro.Inher();

    }
   static void Mesg(){ System.out.println("LOOk AT THE COMMENTS"); }
}