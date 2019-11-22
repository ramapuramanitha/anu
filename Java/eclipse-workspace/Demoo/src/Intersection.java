import java.util.Scanner;
class Intersection
{
public static void main(String arg[])
{
int x[]={23,45,56,78,89,35};
int y[]={42,56,32,45,89};
int z[]=minusset(x,y);
for(int i=0;i<z.length;i++)
{
System.out.println(z[i]+" ");
}
}
static int[] minusset(int a[],int b[])
{
int c[]=new int[a.length];
int k=0;
for(int i=0;i<a.length;i++)
{
int find=1;
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
find=0;
break;
}
if(find==1)
c[k++]=a[i];
}
}
return c;
}
}
