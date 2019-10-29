import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        String toAdd = "";
        ArrayList<String> chatBot = new ArrayList<String>();
        chatBot.add("Please tell me more");
        chatBot.add("Why do you say that ");
        chatBot.add("You seem to think that");
        Random rand = new Random();
        System.out.print("Good Day Whats your problem? ");


        while(!toAdd.equalsIgnoreCase("q")) {
            System.out.println("Enter Response or Q to quit");
            toAdd = keyboard.nextLine().toLowerCase();
            if(toAdd.contains("my") || toAdd.contains("me")) {
                String replaceMessage = wordReplacement(toAdd);
                System.out.println(chatBot.get(1) + replaceMessage);

            } else if(toAdd.contains("i ")) {
                String replaceMessage = wordReplacement(toAdd);
                System.out.println(chatBot.get(2) + " " + replaceMessage);
            }
            else {
                System.out.println(chatBot.get(0));
            }



        }
        System.out.println("END >>>>>>>>");
    }

    public String wordReplacement(String str) {
        String s = str;
        s = s.replace("i ","you ");
        s = s.replace("me ", "you");
        s = s.replace("my ", "your ");
        s = s.replace("am ", "are");
        return s;
    }
}
