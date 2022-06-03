package lesson3;

public class Main {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    // Заменить 0 на 1, 1 на 0;
    private static void invertArray() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        System.out.println();
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++)
            System.out.print (i + "-" + mass[i]+" ");
        }

        // Заполнить массив значениями 1 2 3 4 5 6 7 8 … 100;
        public static void fillArray() {
            int[] arr = new int[100];
            for (int i =0 ; i< arr.length; i++)
            System.out.print(i + " " + arr[i] + " ");
        }

    //Задать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

     /* Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */
    public static void fillDiagonal() {

            int[][] arr = new int[5][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        ;}
    // 5 * Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
        public static void fillLen(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }
    // 6 * Задать одномерный массив и найти в нем минимальный и максимальный элементы.

    public static void fillMaxMin( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
;
}

