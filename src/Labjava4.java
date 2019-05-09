import java.util.Scanner;
public class Labjava4 {
    public static void main(String[] args) {

        boolean b = true;
        if (b) {
            System.out.println("Merge");
        }
        System.out.println("sfarsit ex!");
        if (15 < 35) {
            System.out.println("You are a kid!");
        } else if (10 > 50) {
            System.out.println("You are a liar ");
        } else {
            System.out.println(" You are playing games");
        }
        int points = 200;
        if (points >= 100) {
            System.out.println("You win!");
        }


        Scanner sr = new Scanner((System.in));
        int age = sr.nextInt();
        if (age < 65) {
            System.out.println("You might be in your mid thirties");
        } else if (age >= 65) {
            System.out.println("You are a senior citizen");
        }

        int nr = sr.nextInt();
        if (nr == 0) {
            System.out.println("*");
        } else if (nr == 1) {
            System.out.println("+");
        } else if (nr == 2) {
            System.out.println("$");
        }


        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        switch (st) {
            case '0':
                System.out.println("*");
                break;
            case '2':
                System.out.println("+");
                break;
            case '3':
                System.out.println("$");
                break;
            default:
                System.out.println("Default");

                Scanner a = new Scanner(System.in);
                char dir = sc.nextLine().charAt(0);
                switch (dir) {
                    case 'n':
                        System.out.println("You are going North!");
                        break;
                    case 's':
                        System.out.println("You are going South!");
                        break;
                    case 'e':
                        System.out.println("You are going East!");
                        break;
                    case 'w':
                        System.out.println("You are going West!");
                        break;
                    default:
                        System.out.println("Bad direction!");
                }

        }
    }
}

