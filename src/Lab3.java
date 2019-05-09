public class Lab3 {
    public static void main(String[] args){
        String a = "abc";
        String b = new String("abc");
        String c = "abc";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a == c);

        // concatenation
        String h = "Hello";
        String t = " World";
        String rez = h + t;
        System.out.println(rez);

        // Methods from API
        String str = " THE BIG BLACK FOX JUMP OVER THE FENCE ";
        System.out.println(str.toLowerCase());// this is how you lowercase the string.
        System.out.println(str.toUpperCase());// this is how you uppercase the string.
        System.out.println(str.replace("E", "O"));// replace
        String end = "CE ";
        System.out.println(str.endsWith(end));//boolean
        String finish = "you";
        System.out.println(str.endsWith(finish));
        String start = " TH";
        System.out.println(str.startsWith(start));
        // String str = "a";
        //String str2 = "b";
        //String str 3 = str + str2;
        // sb.append/Stringbuilder

    }
}
