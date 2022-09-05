package csc251.util;

import java.util.Arrays;

public final class ArrayUtil {

    private ArrayUtil(){}

    public static void fill(int[] toFill, int val) {
        for(int i=0;i< toFill.length;i++) {
            toFill[i] = val;
        }
        System.out.println(Arrays.toString(toFill));
    }

    public static int[] copyOfRange(int[] original, int from, int to) throws Exception {

        if(from>0 && from <original.length && to>0 && to <original.length) {
            int arraySize = to - from +1;
            int[] newArray = new int[arraySize];
            int index = 0;
            for (int i = from; i <= to; i++) {
                newArray[index] = original[i];
                index++;
            }
            System.out.println(Arrays.toString(newArray));

            return newArray;
        } else {
            throw new Exception("Invalid to and from values provided");
        }
    }

    public static int sum(int[] addends) {
        int sum=0;
        for (int val: addends) {
            sum = sum+val;
        }
        System.out.println(sum);

        return sum;
    }

    public static int sum(int[][] addends) {
        int sum=0;
        for (int[] valArray: addends) {
            for (int val: valArray) {
                sum = sum+val;
            }
        }

        System.out.println(sum);
        return sum;
    }
}
