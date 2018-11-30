package com.test;

import java.util.Scanner;

public class PatternTriangular {

//	Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints each of the patterns as shown:
//
//		Enter the size: 8
//
//		#                    # # # # # # # #      # # # # # # # #                    #
//		# #                  # # # # # # #          # # # # # # #                  # #
//		# # #                # # # # # #              # # # # # #                # # #
//		# # # #              # # # # #                  # # # # #              # # # #
//		# # # # #            # # # #                      # # # #            # # # # #
//		# # # # # #          # # #                          # # #          # # # # # #
//		# # # # # # #        # #                              # #        # # # # # # #
//		# # # # # # # #      #                                  #      # # # # # # # #
//		     (a)                   (b)                  (c)                  (d)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the size ");
		int size = sc.nextInt();
		
		// (a)
		 // Outer loop to print each of the rows
	      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
	         // Inner loop to print each of the columns of a particular row
	         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
	            if (row >= col) {
	                System.out.print("# ");
	            } 
//	            else {
//	                System.out.print("  ");  // Need to print the "leading" blanks
//	            }
	         }
	         // Print a newline after printing all the columns
	         System.out.println();
	      }
	      System.out.println("\n\n");
	      
	      
	   // (b)
	   // Outer loop to print each of the rows
	      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
	         // Inner loop to print each of the columns of a particular row
	         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
	            if (row + col <= size + 1) {
	                System.out.print("# ");
	            }
//	            else {
//	                System.out.print("  ");  // Need to print the "leading" blanks
//	            }
	         }
	         // Print a newline after printing all the columns
	         System.out.println();
	      }
	      
	      System.out.println("\n\n");
	      // (c)
	      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
		         // Inner loop to print each of the columns of a particular row
		         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
		            if (row >= col) {
		                System.out.print("# ");
		            } else {
		                System.out.print("  ");  // Need to print the "leading" blanks
		            }
		         }
		         // Print a newline after printing all the columns
		         System.out.println();
		      }
	      
	      System.out.println("\n\n");
	      // (d)
	      
	      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
		         // Inner loop to print each of the columns of a particular row
		         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
		            if (row + col >= size + 1) {
		                System.out.print("# ");
		            } else {
		                System.out.print("  ");  // Need to print the "leading" blanks
		            }
		         }
		         // Print a newline after printing all the columns
		         System.out.println();
		      }
	      
	}

	
//	Hints
//	On the main diagonal, row = col. On the opposite diagonal, row + col = size + 1, where row and col begin from 1.
//	You need to print the leading blanks, in order to push the # to the right. The trailing blanks are optional, which does not 
	//affect the pattern.
//	For pattern (a), if (row >= col) print #. Trailing blanks are optional.
//	For pattern (b), if (row + col <= size + 1) print #. Trailing blanks are optional.
//	For pattern (c), if (row >= col) print #; else print blank. Need to print the leading blanks.
//	For pattern (d), if (row + col >= size + 1) print #; else print blank. Need to print the leading blanks.
}
