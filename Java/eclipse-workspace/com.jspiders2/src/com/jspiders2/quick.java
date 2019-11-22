package com.jspiders2;
class MergeSort
{
public static void main(String arg[])
{
int a[]={38,27,3,9,12,10};
mergeSort(a,0,0);
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

}
static void mergeSort(int ar[],int l,int h)
{
if(l<h)
{
int mid=(l+h)/2;
mergeSort(ar,l,mid);
mergeSort(ar,mid+1,h);
mergeSort(ar,l,mid);
}
}
static void merge(int ar[],int l,int m,int h)
{
int a[]=new int[ar.length];
for(int i=0;i<ar.length;i++)
{
a[i]=ar[i];
}
int i=l;
int j=m+1;
while(i<=m && j<=h)
{
if(a[i]<a[j])
 ar[l++]=a[i++];

else
ar[l++]=a[j++];
}
while(i<=m)
{
ar[l++]=a[i++];
}
while(j<=h)
{
ar[l++]=a[j++];
}
}
}




