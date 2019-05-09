import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
//        ex1();ex2();ex3();ex4();ex5();ex6();ex7();ex8();ex9();ex10();ex11();ex12();ex13();
//        printBackward ();readWithDoWhile();printfromBigtoSmall();Homeworkno6Drawarectangle();
        Arrays();
  //      EG();
    }

    public static void ex1() {
        System.out.println("Exercitiu 1");
        while (true) {
            System.out.println("test");
        }
    }

    public static void ex2() {
        System.out.println("Exercitiu 2");
        int x = 3;
        while (x > 1) {
            System.out.println(x);
            x--;
        }
    }

    public static void ex3() {
        int i = 0;
        while (i < 5) {
            System.out.println("Shermayne");
            i++;
        }
    }

    public static void ex4() {
        int y = 0;
        while (y < 10) {
            System.out.println("infinite");
        }
    }

    public static void ex5() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            String text = sc.nextLine();
            System.out.println(text);
            i++;
        }
    }

    public static void ex6() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void ex7() {
        do {
            System.out.println("hey");
        } while (false);
        do {
            System.out.println("hey");
        } while (true);
    }

    public static void ex8() {
        int i = 0;
        do {
            System.out.println("Shermayne");
            i++;
        } while (i < 5);
    }

    public static void ex9() {
        int i = 0;
        for (i = 0; i <= 10; i++) ;
        System.out.println("hello");
    }

    public static void ex10() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mike" + i);
        }
    }

    public static void ex11() {
        int sum = 0;
        for (int i = 0; i <= 50; i++) ;
        {
            sum = sum + 1;
        }
        System.out.println(sum);
    }

    public static void ex12() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void ex13() {
        int[] ar = {8, 9, 10, 11, 12, 13, 16, 15};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }

    public static void printBackward() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            StringBuilder stringBuilder = new StringBuilder((str));
            stringBuilder = stringBuilder.reverse();
            System.out.println(stringBuilder);
        }

    }

    public static void readWithDoWhile() {
        Scanner in = new Scanner(System.in);
        do {
            String str = in.nextLine();
            System.out.println(str);
        } while (true);
    }

    public static void printfromBigtoSmall() {
        for (int s = 5; s >= 0; s--) {
            System.out.println("Hey:" + s);
        }
    }

    public static void Homeworkno6Drawarectangle() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Arrays() {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 2;
        arr[4] = 194;
        for (int el : arr) {
            System.out.println(el);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//    public static void EG() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lungime: ");
//        int n = scanner.nextInt();
//        System.out.println();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Element Position" + i + " =");
//            int el = scanner.nextInt();
//            arr[i] = el;
//        }
//        for (int el : arr) {
//            System.out.println(el);
//        }
//        int sum = 0;
//        for (int el : arr) {
//            sum = sum + el;
//        }
//        System.out.println(sum);
//
//        int prod = 1;
//        for (int el : arr) {
//            prod = prod * el;
//        }
//        System.out.println(prod);
//    }
//
//}
//










