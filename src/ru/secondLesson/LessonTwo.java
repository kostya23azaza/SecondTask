package ru.secondLesson;

public class LessonTwo {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1, 0};
        System.out.print("Первое упражение "); //First exercise
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Второе упражение ");
        int[] arr2 = new int[8]; //Second exercise
        for (int k = 1, l = 0; k < arr2.length; k++)
            arr2[k] = l += 3;
        for (int p = 0; p < arr2.length; p++) {
            System.out.print(arr2[p] + " ");
        }
        System.out.println();
        System.out.print("Третье упражение ");
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Third exercise
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
                System.out.print(arr3[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Четвертое упражение");
        int arr4[][] = new int[5][5]; //Fourth exercise
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0)
                    arr4[i][j] = 1;
                System.out.print(" " + arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Пятое упражение");
        int arr5[] = {1, -102, 49, 123, -321, 221, 0, 90};//Fifth exercise
        int minValue = arr5[0];
        int maxValue = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (minValue > arr5[i])
                minValue = arr5[i];
            else if (maxValue < arr5[i])
                maxValue = arr5[i];
        }
        System.out.println("Минимальное значение =" + minValue);
        System.out.println("Максимальное значение =" + maxValue);
        System.out.println("Шестое упражение");
        int arr6[] = {1, 5, 4, 2, 5, 3};
        System.out.println(checkBalance(arr6));
        System.out.println("Седьмое упражение");
        changeOfNumbers(arr6, 3);
        changeOfNumbers(arr6, -3);
    }

    static boolean checkBalance(int[] arrkar) {
        for (int i = 0; i < arrkar.length; i++) {
            int left = 0;
            int right = 0;
            for (int k = 0; k < i; k++) {
                left += arrkar[k];
            }
            for (int k = i; k < arrkar.length; k++) {
                right += arrkar[k];
            }
            if (left == right)
                return true;
        }
        return false;
    }

    static void changeOfNumbers(int[] arrkar2, int n) {
        if (n > 0) {
            for (int k = 0; k < n; k++) {
                int kek = arrkar2[arrkar2.length - 1];
                if (arrkar2.length - 1 >= 0) System.arraycopy(arrkar2, 0, arrkar2, 1, arrkar2.length - 1);
                arrkar2[0] = kek;
                for (int i : arrkar2) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int k = 0; k > n; k--) {
                int kek = arrkar2[0];
                System.arraycopy(arrkar2, 1, arrkar2, 0, arrkar2.length - 1);
                arrkar2[arrkar2.length - 1] = kek;
                for (int i : arrkar2) System.out.print(i + " ");
                System.out.println(); // ..
            }
        }
    }
}





