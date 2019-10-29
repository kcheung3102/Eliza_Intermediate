import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> chatBot = new ArrayList<>();
        String toAdd = "";


        while(!toAdd.equalsIgnoreCase("q")) {
            System.out.println("Enter Response or Q to quit");
            toAdd = keyboard.nextLine().toLowerCase();
            String replaceMessage = messageReplacement(toAdd);
            System.out.println(replaceMessage);
        }
        System.out.println("END >>>>>>>>");
    }

    public String messageReplacement(String str) {
        String s = str;
        s = s.replace("i","you");
        s = s.replace("me", "you");
        s = s.replace("my", "your");
        s = s.replace("am", "are");
        return s;
    }
}
