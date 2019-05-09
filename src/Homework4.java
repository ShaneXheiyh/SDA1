import java.util.Scanner;

public class Homework4 {
    public static void main (String [] args) {
        // Scanner sc = new Scanner (System.in);
        //String str = sc.nextLine();
        // if (str.equals("star")) {
        //System.out.println("*"); }
        // {
        //else if (str.equals("plus")) {
        //System.out.println("+");
        // }
        //else {
        //System.out.println("again");}

        String Y = "yes";
        String N = "no";
        String M = "maybe";
        Scanner userInput = new Scanner((System.in));
        String input = userInput.next();
        if (input == Y) {
            System.out.println("*");
        } else if (input == N) {
            System.out.println("+");
        }

        // Scanner sc = new Scanner (System.in);
        //String str = sc.nextLine();
        // switch (str){
        //case "star":
        //System.out.println("*")
        //break;
        //case "plus":
        //System.out.println("+"):
        //break;
        //default:
        //System.out.println("Try again");
        //}

        String str = "Constellation";
        switch (str) {
            case "41North":
                System.out.println("*");
                break;
            case "Far North":
                System.out.println("+");
                break;
            case "South Lat":
                System.out.println("$");
                break;
                default:
                    System.out.println("BIG DIPPER");
        }


    }
}
