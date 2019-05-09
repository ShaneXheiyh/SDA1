public class Homework5 {
    public static void main(String[] args) {

//        int[] arr1 = {9, 8, 7, 14, 18, 3, 55, 1, 1087};
        int[] arr1 = {-9, -8};
        int x = 18;
        boolean included = false;
        for (int el : arr1) {
            if (x == el) {
                included = true;
            }
        }
        System.out.println("The element is:" + x);
        System.out.println("Is this element included?:" + included);

        int max = Integer.MIN_VALUE;
        for( int el : arr1){
            if (el > max){
                max = el;
            }
        }
        System.out.println("Maximum Value is:"+ max);
//        int max = 0;
//        for (int el : arr1) {
//            if (el > max) {
//                max = el;
//            }
//        }
//        System.out.println(max);
//
//        int min = 1000;
//        for (int el : arr1) {
//            if (el < min) {
//                min = el;
//            }
//        }
//        System.out.println(min);

        int min = Integer.MAX_VALUE;
        for(int el : arr1){
            if (el < min){
                min = el;
            }
        }
        System.out.println("Minimun Value is:" + min);
    }
}
