class Program16
{
public static void main(String arg[])
{
String ar[]={"B","D","F","P","R","T","U","Z"};
boolean rs=binarySearch(ar,0,ar.length-1,"F");
if(rs)
System.out.println("yes it is true");
else
System.out.println("no it is not there");
}
static boolean binarySearch(String st[],int low,int high,String str)
{
if(low>high)
return false;
int mid=(low+high)/2;
if(st[mid].equals(str))
return true;
if(st[mid].compareTo(str))
return binarySearch(st,low,mid-1,str);
else
return binarySearch(st,mid+1,high,str);
}
}
