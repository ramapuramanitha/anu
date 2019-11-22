package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>
{

	@Override
	public int compare(Bank m1, Bank m2) {
		 if(m1.pincode>m2.pincode) {
			   return 1;
		   }else if(m1.pincode<m2.pincode){
			   return -1;
		   }else {
			   return 0;
		   }
	   }
}