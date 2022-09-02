package csc251.util;
 // correct fill method
public class ArrayUtil{
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        array.fill;

    }

    public static void fill(int[] toFill, int val) {
        //numbers go in here

    }

    public static int[] copyOfRange(int[] original, int from, int to) {
        return new int[0];
    }

}
    public static int sum(int[] addends) {
        int result = 0;
        for (int addend : addends)
            result += addend;
        return result;
    }
    public static int sum(int[][] addends){


    }


}






// Fill should place the passed in value into each cell within the array
// leaving the array filled entirely with the value.
//opyOfRange should copy the portion of the array
// specified by the from and to into a new array
// of the same type
// and return the new array.
//Sum is overloaded with two implementations.
// One that sums an array of ints.
// The second should sum an array of arrays of ints.