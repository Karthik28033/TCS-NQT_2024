package com.tcsnqtquestions;

/* ------(ROTATE IMAGE)------ 
 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 
 Output: [[7,4,1],[8,5,2],[9,6,3]]      
 
 */
public class Tcs_Question3 {
	
	 public void rotate(int[][] matrix) {
	        int n = matrix.length;
	        
	        // Transpose the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        
	        // Reverse each row
	        for (int i = 0; i < n; i++) {
	            int left = 0;
	            int right = n - 1;
	            while (left < right) {
	                int temp = matrix[i][left];
	                matrix[i][left] = matrix[i][right];
	                matrix[i][right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        Tcs_Question3 rotator = new Tcs_Question3();
	        rotator.rotate(matrix);
	        
	        // Print rotated matrix
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
