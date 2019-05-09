import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //how to read a string from keyboard????
        String str = "Salutare Everyone";
        char ch1 = str.charAt(3);
        System.out.println("Character at 3 index is " + ch1);

        String b = str.replace("Salutare", "Hello");
        System.out.println(b);
        Scanner sc = new Scanner((System.in));
        b = sc.nextLine();
        System.out.println(b);
        //
        int myLenght = b.length();
        System.out.println(myLenght);

        //print last letter
        char ch2 = b.charAt(myLenght - 1);
        System.out.println("Character at last position is " + ch2 );
        //
        String message = "Dan is tall";
        String rez = message.substring(0, 3);
        System.out.println(rez);
        String c = message.substring(4, 7);
        System.out.println(c);

        StringBuilder sb = new StringBuilder(600);
        sb.append("this is my string using stringbuilder");
        System.out.println(sb.toString());

        String str1  = "This course is enjoyable";
        int indexCh = str1.indexOf("e");
        System.out.println("Index of char e is :" +indexCh);

        int indexCH = str1.lastIndexOf("e");
        System.out.println("Last Index position of e = " + indexCH);

    }
}