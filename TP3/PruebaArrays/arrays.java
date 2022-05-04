package PruebaArrays;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        int A[] = { 1, 4, 3, 2, 5 };
        int B[] = { 1, 2, 3, 4, 6 };
        int C[] = new int[5];

        Arrays.fill(C, 3);

        System.out.println(Arrays.toString(C));

        System.out.println(Arrays.toString(Arrays.copyOf(B, B.length)));

        boolean x = Arrays.equals(A, B);
        System.out.println(x);

        System.out.println(Arrays.toString(Arrays.copyOfRange(B, 2, 4)));

        System.out.println(Arrays.toString(A));

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

        System.out.println(Arrays.binarySearch(B, 6));

    }

}