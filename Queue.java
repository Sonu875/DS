
public class Queue {

	int[] queue;
	int front=0,rear=0,size=0;
	public Queue(int size)
	{
		this.size=size;
		this.queue=new int[size];
	}
	public void enqueu(int a)
	{
		if(!isFull())
		{
			queue[rear++]=a;	
		}
		else
		{
			System.out.println("Overflow");
		}
		
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			front=0;
			rear=0;
			return -1;
		}
		return queue[front++];
	}
	public boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(rear==size)
		{
			return true;
		}
		return false;
	}
	
	
	
}
