package com.jspiders2;

class Program7
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
printPowerOfTwo(n);
}
public static void printPowerOfTwo(int number)
{
double ans;
for(int power=0;power<=number;power++)
{
ans=Math.pow(2,power);
System.out.println(power+" "+ans);
}
}
}
