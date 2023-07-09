package one;

//public class Methods {
//    static void myMethod(int age) {
//        if (age<18) {
//            System.out.println("Kirish taqiqlanadi !");
//        }else{
//            System.out.println("Kirish mumkin !");
//        }
//    }
////public static void main(String[] args) {
////        myMethod(12);
//
//
//}
//}

public class Methods {
    public static void main(String[] args) {
        int result = sum(6);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
