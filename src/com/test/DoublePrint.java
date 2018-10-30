package com.test;

import java.math.BigDecimal;

public class DoublePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dexp = 12345678;
		System.out.printf("dexp: %f\n", dexp);
		
		int time = 46319;
		
		double d= time;  
		
		System.out.println(d);  
		
		double starttime = 1539173882;
		
		double ans =  starttime + d;
		  System.out.printf("\n ans "+ ans);
		
		 BigDecimal bigDecimal = new BigDecimal(starttime);
         bigDecimal =  bigDecimal.add(new BigDecimal(time));
         String alltime = bigDecimal.toPlainString();
         System.out.printf("\n bigDecimal  "+ alltime); 
         
         BigDecimal db = new BigDecimal(alltime).setScale(12, BigDecimal.ROUND_HALF_UP);
         BigDecimal db1 = new BigDecimal(starttime).setScale(2, BigDecimal.ROUND_HALF_UP);


         
         System.out.printf("\n db "+ db);
         System.out.printf("\n "+ db1.doubleValue());
		
	}

}
