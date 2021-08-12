
public class StackLL {
	Node head=null;
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(int n)
	{
		Node node=new Node();
		node.value=n;
		
		if(head==null)
		{
			head=node;
			node.next=null;
		}
		else
		{
			node.next=head;
			head=node;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("underflow");
			return -1;
		}
		else
		{
			int value=head.value;
			head=head.next;
			
			return value;
		}
	}
	public void peak()
	{
		if(isEmpty())
		{
			System.out.println("Nothing to peak");
		}
		else
		{
			System.out.println(head.value);
		}
	}

}
