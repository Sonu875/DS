
public class QueueLL {
	Node tail=null;
	Node head=null;
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	public void peak()
	{
		if(isEmpty())
		{
			System.out.println("No man standing");
		}
		else
		{
			System.out.println(head.value);
		}
	}
	public void enqueue(int a)
	{
		Node n=new Node();
		n.value=a;
		n.next=null;
		if(isEmpty())
		{
			 head=n;	
			 tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
			
	}
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return -1;
		}
		else {
			int value=head.value;
			head=head.next;
			return value;
		}
			
	}
}
