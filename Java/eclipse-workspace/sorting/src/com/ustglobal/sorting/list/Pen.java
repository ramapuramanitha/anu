package com.ustglobal.sorting.list;

public class Pen  implements Comparable<Pen>{

	double price;
	String brand;
	String color;
	public Pen(double price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
//	@Override
//	public int compareTo(Pen lp) {
//		Double s=this.price;
//		Double t=lp.price;
//		return s.compareTo(t);
//	}
//	
//}


//@Override
//public int compareTo(Pen lp) {
//	String p=this.brand;
//	String q=lp.brand;
//	return p.compareTo(q);
//}
//
//}
	@Override
	public int compareTo(Pen lp) {
		String r=this.color;
		String u=lp.color;
		return r.compareTo(u);
	}

	}

	
