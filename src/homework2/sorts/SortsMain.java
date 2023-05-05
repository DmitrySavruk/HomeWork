package homework2.sorts;
import homework2.utils.ArraysUtils;
import homework2.utils.SortsUtils;

import java.util.Arrays;
import java.util.Scanner;
public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        SortsUtils.sort(arr1);
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6}) + " -> " + Arrays.toString(arr1));

        int[] arr2 = new int[]{1,1,1,1};
        SortsUtils.sort(arr2);
        System.out.println(Arrays.toString(new int[]{1,1,1,1}) + " -> " + Arrays.toString(arr2));

        int[] arr3 = new int[]{9,1,5,99,9,9};
        SortsUtils.sort(arr3);
        System.out.println(Arrays.toString(new int[]{9,1,5,99,9,9}) + " -> " + Arrays.toString(arr3));

        int[] arr4 = new int[]{};
        SortsUtils.sort(arr4);
        System.out.println(Arrays.toString(new int[]{}) + " -> " + Arrays.toString(arr4));

        int[] arr5 = new int[]{6,5,4,3,2,1};
        SortsUtils.sort(arr5);
        System.out.println(Arrays.toString(new int[]{6,5,4,3,2,1}) + " -> " + Arrays.toString(arr5));

        int[] arr6 = ArraysUtils.arrayRandom(50, 100);
        SortsUtils.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        int[] arr7 = ArraysUtils.arrayFromConsole();
        SortsUtils.sort(arr7);
        System.out.println(Arrays.toString(arr7));
    }
}

