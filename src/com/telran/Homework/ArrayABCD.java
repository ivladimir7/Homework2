package com.telran.Homework;

import java.util.Arrays;


import static java.lang.System.*;

public class ArrayABCD {
    public static void main(String[] args) {

        char[] arr1 = {'A', 'B', 'C', 'D'};
        char[] arr2 = {'D', 'A', 'B', 'C'};

        if (collation(arr1, arr2)) {
            out.println(Arrays.toString(arr1) + " -----> " + Arrays.toString(arr2) + " : it is true");
        } else out.println(Arrays.toString(arr1) + " ------> " + Arrays.toString(arr2) + " : it is false");

    }

    public static boolean collation(char[] arr1, char[] arr2) {
        int i = 0;
        int length = 0;

        if (arr1.length == arr2.length) {
            length = arr1.length + arr1.length;
        } else {
            return false;
        }
        char[] tmp = new char[length];

        arraycopy(arr1, 0, tmp, 0, arr1.length);
        arraycopy(arr1, 0, tmp, arr1.length, arr2.length);

        while (i < tmp.length - arr2.length) {
            int count = 0;
            int a = 0;
            while (a< arr2.length) {
                if (tmp[i + a] == arr2[a])
                    count++;
                if (count != arr2.length) {
                    a++;
                } else {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

}
