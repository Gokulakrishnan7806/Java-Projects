public class Funtion {
    public static void main(String[] args) {
        System.out.println(add("10", "20")); // parameter
        sub();  // non para void funtion
    }


        public  static String add ( String a, String b){
            String c = a + b;
            return c;
        }
        public static void sub () {
            int a = 10;
            int b = 20;
            int c = a - b;
            System.out.println(c);
        }
        public static void mil () {
            int a = 10;
            int b = 20;
            int c = a * b;
            System.out.println(c);
        }



}
