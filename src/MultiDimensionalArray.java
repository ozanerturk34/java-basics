import java.util.Arrays;

public class MultiDimensionalArray {
    public static void print() {
       int[] oneDimensionalArray = {1,2,3};
        System.out.println(Arrays.toString(oneDimensionalArray));
        System.out.println(oneDimensionalArray[1]);
        int[][ ] multiDimensionalArray = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(multiDimensionalArray));
        System.out.println(multiDimensionalArray[1][1]);

        // Create a matrix of 4x2
        double[][] doubleArray = new double[4][2];
        System.out.println(Arrays.deepToString(doubleArray));
        System.out.println(doubleArray[3][1]);

        // Create a matrix of 4xX
        double[][] doubleArrayUnknownHeight = new double[4][];

        for(int i = 0; i <multiDimensionalArray.length;i++) {
            for(int j = 0; j < multiDimensionalArray[i].length; j++) {
                System.out.println("i= "+i);
                System.out.println("j= "+j);
                System.out.println("value= "+multiDimensionalArray[i][j]);
                System.out.printf("\n");
            }
        }
    }
}
