package Home.Work.App;

   public class HomeWorkApp {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
           printThreeWords();
           checkSumSign();
           printColor();
           Numbers();
       }

       public static void printThreeWords() {
           System.out.println("Orange");
           System.out.println("Banana");
           System.out.println("Apple");
       }

       public static void checkSumSign() {
           int ass = 2000, bss = 155;
           int c = ass + bss;
           System.out.println(c);
           c = ass + bss; // переменная c = 2000 + 155 = 2155
           System.out.println("c = " + c);
           if (c >= 0) {
               System.out.println("the amount positive");
           }
           if (c < 0) {
               System.out.println("the amount is negative");
           }
       }

       public static void printColor() {
           int value = 1000;
           System.out.println(value);
           if (value <= 0) {
               System.out.println("red");
           }
           if (value < 100) {
               System.out.println("yellow");
           }
           if (value > 101) {
               System.out.println("green");
           }
           ;
       }

       public static void Numbers() {
           int a = 1356, b = 550;
           if (a >= b) {
               System.out.println("a >= b");
           }
           if (a < b) {
               System.out.println("a < b");
           }


           ;
       }


   }









