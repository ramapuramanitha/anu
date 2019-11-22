package com.jspiders2;

import java.util.Scanner;
class Mfactorial
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
factOfNum(n);
static void factOfNum(int a)
{
for(int i=1;i<a;i++)
{
System.out.println(i + "!=" + fact(i));
}
}
}
static void fact(int n)
{
int fact=1;
while(n!=0)
{
fact=fact*n;
n--;
}
}
}
