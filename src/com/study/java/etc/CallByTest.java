package com.study.java.etc;

public class CallByTest {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("기본형은 값 자체를 넘긴다.");
        System.out.println(num);
        primitiveIsCallByValue(num);
        System.out.println(num);

        System.out.println("참조형은 주소값을 넘긴다.");
        int[] arr = {1, 2, 3};
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        referenceIsCallByValue(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }


    }

    public static void primitiveIsCallByValue(int number) {
        number -= 99;
        System.out.println(number);
    }

    public static void referenceIsCallByValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 10;
        }

    }
}
