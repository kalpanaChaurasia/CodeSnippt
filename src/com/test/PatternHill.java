package com.test;

public class PatternHill {

//	Write 3 programs called HillPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:
//
//		Enter the rows: 6
//
//		          #                # # # # # # # # # # #                #                # # # # # # # # # # #
//		        # # #                # # # # # # # # #                # # #              # # # # #   # # # # #
//		      # # # # #                # # # # # # #                # # # # #            # # # #       # # # #
//		    # # # # # # #                # # # # #                # # # # # # #          # # #           # # #
//		  # # # # # # # # #                # # #                # # # # # # # # #        # #               # #
//		# # # # # # # # # # #                #                # # # # # # # # # # #      #                   #
//		         (a)                        (b)                 # # # # # # # # #        # #               # #
//		                                                          # # # # # # #          # # #           # # #
//		                                                            # # # # #            # # # #       # # # #
//		                                                              # # #              # # # # #   # # # # #
//		                                                                #                # # # # # # # # # # #
//		                                                               (c)                        (d)
		                                                               
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Hints
//=============================
//	For pattern (a):
//	      for (int row = 1; ......) {
//	         // numCol = 2*numRows - 1
//	         for (int col = 1; ......) {
//	            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
//	               ......;
//	            } else {
//	               ......;
//	            }
//	         }
//	         ......;
//	      }
//	or, use 2 sequential inner loops to print the columns:
//	      for (int row = 1; row <= rows; row++) {
//	         for (int col = 1; col <= rows; col++) {
//	            if ((row + col >= rows + 1)) {
//	               ......
//	            } else {
//	               ......
//	            }
//	         }
//	         for (int col = 2; col <= rows; col++) {  // skip col = 1
//	            if (row >= col) {
//	               ......
//	            } else {
//	               ......
//	            }
//	         }
//	         ......
//	      }
}
