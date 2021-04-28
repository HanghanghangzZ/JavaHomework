package com.hang.experiment.ex3;

public class EXP3_11 {
    public static void main(String[] args) {
        IntSort s = new IntSort();
        int a = 30, b = 12, c = 40;
        int arr[] = {34, 8, 12, 67, 44, 98, 52, 23, 16, 16};
        System.out.println("两个数的排序结果：" + s.sort(a, b));
        System.out.println("三个数的排序结果：" + s.sort(a, b, c));
        System.out.println("数组的排序结果：" + s.sort(arr));
    }
}

class IntSort {
    public String sort(int a, int b) {
        if (a < b)
            return a + " " + b;
        else
            return b + " " + a;
    }

    public String sort(int a, int b, int c) {
        int swap;
        if (a < b) {
            swap = a;
            a = b;
            b = swap;
        }
        if (a < c) {
            swap = a;
            a = c;
            c = swap;
        }
        if (b < c) {
            swap = b;
            b = c;
            c = swap;
        }
        return c + " " + b + " " + a;
    }

    public String sort(int arr[]) {
        String s = " ";
        int swap;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
        for (int i = 0; i < arr.length; i++)
            s = s + arr[i] + " ";
        return s;
    }
}

