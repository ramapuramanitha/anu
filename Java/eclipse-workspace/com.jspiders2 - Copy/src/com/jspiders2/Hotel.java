package com.jspiders2;

public class Hotel 
{
   Food serve ()
    {
	Food f=new Food();
	System.out.println("Hotel Serve Food");
     return f;
     }
    public static void main(String[] args) 
    {
		Hotel h1=new Hotel();
		h1.serve();
		
	}
    
}
