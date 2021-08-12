//import sun.net.www.content.text.plain;

public class LinkedListOperationsAndQuestions {

	public static Node head;
	public static Node tail;
	int size=0;
	public void createNode(int value)
	{
		head =new Node();
		Node node=new Node();
		node.value=value;
		node.next=null;
		head=node;
		tail=node;
		size++;
	}
	public void insertAtfirst(int n)
	{
		Node node=new Node();
		node.value=n;
		node.next=head;
		head=node;
		size++;
		
		
	}
	public void insertAtEnd(int n)
	{
		Node node=new Node();
		node.value=n;
		tail.next=node;
		tail=node;
		size++;
		
	}
	public void insertAtLocation(int n,int loc)
	{
		
		Node node =new Node();
		node.value=n;
		if(head==null)
		{
			createNode(n);
		}
		else if(loc==0)
		{
			insertAtfirst(n);
		}
		else if(loc>size)
		{
			insertAtEnd(n);
		}
		else
		{
		Node temp=head;
		int index=0;
		while(index<loc-1)
		{
			temp=temp.next;
			index++;
		}
		node.next=temp.next;
		temp.next=node;
		}
		size++;
	}
	public void deleteNode(int loc)
	{
		if(loc==0)
		{
			head=head.next;
		}
		else if(loc==size)
		{
			Node n=head;
			while(n!=tail)
			{
				System.out.print(n.value);
				n=n.next;
			}
			tail=n;
		}
		else
		{
			int index=1;
			Node temp=head;
			while(index!=loc-1)
			{
				temp=temp.next;
				index++;
			}
			//System.out.println(temp.value);
			temp.next=temp.next.next;
			//System.out.println(temp.next.value);
			
		}
	}
	public void printLI()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.value+"-->");
			n=n.next;
		}
	}
	public void printRe(Node head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.value);
		printRe(head.next);
		
		
	}
	public void reverse()
	{
		Node curr=head;
		Node pre=null;
		Node nxt=null;
		while(curr!=null)
		{
			nxt=curr.next;
			curr.next=pre;
			pre=curr;
			curr=nxt;
		}
		head=pre;
	}
	public void reverse(Node head)
	{
		if(head==null)
		{
			return;
		}
		reverse(head.next);
		head.next.value=head.value;
	}
	
}
