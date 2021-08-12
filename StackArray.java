
public class StackArray {

	int arr[];
	int top,size;
	public StackArray(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	public boolean isEmpty()
	{
		if(this.top==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(top==arr.length-1)
		{
			return true;
		}
		return false;
	}
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Overflow");
		}
		else
		{
			arr[++top]=x;		
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
			return arr[top--];
		}
	}
	public void peak()
	{
		if(isEmpty())
		{
			System.out.println("No element to peak");
			
		}
		else
		{
			System.out.println(arr[top]);
		}
	}
	
	
	
}
