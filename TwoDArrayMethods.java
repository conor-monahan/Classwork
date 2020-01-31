/**
 * Classwork #1: Define the methods for problems #1-9
*/
public class TwoDArrayMethods
{
   
    public static void main(String[] args)
    {
        // Decaling a 2D array in one line of code, to be used for testing
        int[][] board =  {{2, 4, 6, 8},
                         {1, 2, 7, 9},
                         {4, 6, 1, 10},
                         {1, 3, 11, 2}};
                        
        // These are the method calls for the static methods you will define
        printMatrix(board);
        findTotal(board);
        findMax(board);
        sumRows(board);
        sumColumns(board);
        largestinRows(board);
        largestinColumns(board);
        System.out.println(isSquare(board));
        System.out.println(isRowMagic(board));
        System.out.println(isColumnMagic(board));
    }





/* #1 Write a method for printing the elements in an array. Each row should
* be on its own line, so that the 2D array prints as a matrix of data
*/
    public static void printMatrix(int[][] matrix)
    {
        for ( int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
            { System.out.println(matrix[i][j]);
            }
            System.out.println();

 
    }
    /*
     * #2 Write a method to print the sum of all elements in the array. The 
     * The output should read:
     * "The sum of all elements in the array is 77
     */
    public static void findTotal(int[][] matrix)
    {
        int sum = 0;
        for ( int i = 0; i < matrix.length; i++)
        {   for ( int j = 0; j < matrix[0].length; j++)
            { sum += matrix[i][j]; }
        }
        System.out.println(sum);



    }
    /*
     * #3 Write a method that prints the maximum value in the entire 2D array.
     * For example, this method call in our main method on page 1 should read:
     * "The maximum value in the entire matrix is 11
     */
    public static void findMax(int[][] matrix)
    {
        int max = 0;
        for ( int i = 0; i < matrix.length; i++)
            { for (int j = 0; j<matrix.length; j++)
                { if (matrix[i][j+1]>matrix[i][j])
                    { max = matrix[i][j+1];
                    }
                }
                System.out.println(max);
            }
        }
    
    /* #4 Write a method for printing the sum of each row in the array
     * For example, this method call in our main method should output: 
     * "The sum of the elements in row 0 is 20." 
     * "The sum of the elements in row 1 is 19." etc.
     */ 
    public static void sumRows(int[][] matrix)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum2 = 0;
        for ( int i = 0; i < matrix.length; i++)
            { for ( int j = 0; j < matrix.length; j++)
                {
                    sum1 += matrix[0][j];
                    sum2 += matrix[1][j];
                    sum3 += matrix[2][j];
                }
              System.out.println("The sum of row 0 is: " + sum1);
              System.out.println("The sum of row 1 is: " + sum2);
              System.out.println("The sum of row 2 is: " + sum3);
            }
    }
    
    /* #5 Write a method for finding the sum of each column in the array
     * For example, this method call in our main method should output:
     * "The sum of the elements in column 0 is 8" 
     * "The sum of the elements in column 1 is 15" etc.
     */ 
    public static void sumColumns(int[][] matrix)
   {
       int sum1 = 0;
       int sum2 = 0;
       int sum3 = 0;
       for ( int i = 0; i < matrix.length; i++)
            { for (int j = 0; j < matrix.length; j++)
                {
                    sum1 += matrix[j][0];
                    sum2 += matrix[j][1];
                    sum3 += matrix[j][2];
                }
              System.out.println("The sum of column 0 is: " + sum1);
              System.out.println("The sum of column 1 is: " + sum2);
              System.out.println("The sum of column 2 is: " + sum3);
            }
    }

     /* #6 Write a method for printing the largest value in each row.
     * For example, this method call in our main method should output:
     * "The largest value in row 0 is 8" etc.
     * "The largest value in row 1 is 9" etc.
     */ 
    public static void largestinRows(int[][] matrix)
    {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length[0].length; j++) {
                if (matrix[0][j+1].matrix[0][j]) {
                    max1 = matrix[0][j+1];
                }
                if (matrix[1][j+1]>matrix[1][j]) {
                    max1 = matrix[1][j+1];
                }
                if (matrix[2][j+1].matrix[2][j]) {
                    max1 = matrix[2][j+1];
                }
            }
            System.out.println("Row 0 max is: " + max1);
            System.out.println("Row 1 max is: " + max2);
            System.out.println("Row 2 max is: " + max3);
        }
    }

     /* #7 Write a method for printing the largest value in each column.
     * For example, this method call in our main method should output:
     * "The largest value in column 0 is 4" etc.
     * "The largest value in column 1 is 6" etc.
     */ 
    public static void largestinColumns(int[][] matrix)
    {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[0][j+1]>matrix[0][j]) {
                    max1 = matrix[j+1][0];
                }
                if (matrix[1][j+1]>matrix[1][j]) {
                    max1 = matrix[j+1][1];
                }
                if (matrix[2][j+1]>matrix[2][j]) {
                    max1 = matrix[j+1][2];
                }
            }
            System.out.println("Column 0 max is: " + max1);
            System.out.println("Column 1 max is: " + max2);
            System.out.println("Column 2 max is: " + max3);
        }
    }
   
     /*
     * #8 Write a method that checks if the array is a square matrix
     * A square matrix has the same number of rows and columns! 
     */
    public static boolean isSquare(int[][] matrix)
    {
        if (matrix.length==matrix[0].length) {
            System.out.println("The matrix is going to be a square");
        }
    }
    /* 
     * #9 Write a method that checks if the array is "row-magic", which means 
* that every row has the same row sum. You will need to change the values of 
* the test array in the main method to do this.
     */
    public static boolean isRowMagic(int[][] matrix)
    {





    }  
    /*
     * #10 Write a method that checks if the array is "column-magic", which means 
* that every column has the same sum. You will need to change the values of 
* the test array in the main method to do this.
     */
    public static boolean isColumnMagic(int[][] matrix)
    {



    } 
    /*
     * EXTENSION METHOD:
* #11 Write a method to determine if the array is a magic square, which 
* means its row sums are equal, its column sums are equal, AND the sum of
* its diagonals are equal. You could use the methods above as "helper"  
* methods!
     */
    public static boolean isMagic(int[][] matrix)
    {



    }
    /*
     * EXTENSION METHOD:
     * #12 Write a method that checks to see if the array is a Latin square. 
* A Latin square has the same # of rows and columns, which must contain 
     * the same values 1, 2, ..., n with no repeats. Examples:
     * 123
     * 123
     * 123
     * 
*  56
        *  56
     */
    public static boolean isLatin(int[][] a)
    {



    }
}
