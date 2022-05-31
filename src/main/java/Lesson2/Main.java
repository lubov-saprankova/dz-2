package Lesson2;

public class Main {

    public static void main(String[] args) {
        getName();
        getNumber();
        isNegative();
        printWordNTimes();
    }
    public static void getName() {
        int num = 33, NUM = 58;
        if ((num + NUM) >= 10 && (num + NUM) <= 20) {
            System.out.println(num + NUM);
            System.out.println("true");
        } else {
            System.err.println("false");
        }
        ;
    }
    public static void getNumber() {
        int number = 30;
        if (number < 0) {
            System.out.print("negative");
        } else if (number > 0) {
            System.out.println("positive");
        }
        ;
    }
    public static boolean isNegative() {
        int x = -16;
        if (x < 0) {
            System.out.println("true");
            return true;
        } else if (x > 0) {
            System.out.println("false");
        }
    ;
        return false;
    }
    public static void printWordNTimes() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print('4');
            }
            System.out.println();
        }
        ;
    }
    ;
}





