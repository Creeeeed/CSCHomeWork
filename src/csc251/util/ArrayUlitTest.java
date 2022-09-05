package csc251.util;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String... args) throws Exception {
        testFill();
        testCopyOfRange();
        testSum();
        testSumOfArray();
    }

    static void testFill() {
        int[] toFill = new int[5];
        ArrayUtil.fill(toFill,2);
    }

    static void testCopyOfRange() throws Exception {
        int[] original = new int[]{0,1,2,3,4,5,6,7};
        int[] newArray = ArrayUtil.copyOfRange(original, 2,5);
        System.out.println(Arrays.equals(newArray, new int[]{2,3,4,5}));

        try {
            ArrayUtil.copyOfRange(original, -1, 5);
        } catch(Exception ex) {
            System.out.println("Found error for from value: "+ ex);
        }
        try {
            ArrayUtil.copyOfRange(original, 1, 9);
        } catch(Exception ex) {
            System.out.println("Found error for to value: "+ ex);
        }
    }

    static void testSum() {
        int[] array = new int[]{1,2,3};
        System.out.println(6== ArrayUtil.sum(array));
    }

    static void testSumOfArray() {
        int[][] doubleArray = new int[][] { new int[]{1,2,3}, new int[]{4,5,6}};
        System.out.println(21== ArrayUtil.sum(doubleArray));
    }
}
