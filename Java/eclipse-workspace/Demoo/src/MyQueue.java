class MyQueue
{
Object obj;
int cap;
int front,rear;
public MyQueue()
{
cap=0;
obj=new Object();
front=rear=-1;
}
public MyQueue(int cap)
{
this.cap=cap;
obj =new Object[cap];
front=rear=-1;
}
public  void nQueue(object ele)
{
if(rear==cap-1)
{
System.out.println("queue is full");
return;
}
if(front==-1)
front=0;
obj[++rear]=ele;
}
public int size()
{
if(front==-1)
{
return 0;
}
return rear-front+1;
}
public  Object dQueue()
{
if(front==-1)
{
return"queue is full";
}
Object ele=obj[front++];
if(front>rear)
{
front=rear=-1;
return ele;
}
void display()
{
System.out.println("Element in the array is");
for(int i=front;i<=rear;i++)
{
System.out.println(obj[i]);
if(i<rear)
{
System.out.println(",");
}
}
}
public static void main(String arg[])
{
MyQueue mq=new MyQueue(5);
mq.nQueue("A");
mq.nQueue("B");
mq.nQueue("C");
mq.display();
System.out.println();
System.out.println(mq.dQueue()+"is deleted");
System.out.println( mq.dQueue()+"is deleted");
mq.display();


}
