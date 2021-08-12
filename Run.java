import java.util.Arrays;


public class Run {
	

	public static void main(String[] args) {
		QueueLL ll=new QueueLL();
		ll.enqueue(1);
		ll.enqueue(2);
		ll.enqueue(3);
		ll.enqueue(4);
		ll.enqueue(5);
		ll.enqueue(6);
		ll.peak();
		System.out.println(ll.deque());
		System.out.println(ll.isEmpty());
		ll.deque();
		ll.deque();
		ll.deque();
		ll.deque();
		ll.peak();
		ll.deque();
		ll.deque();
		ll.deque();
		ll.deque();
		ll.peak();
	}
}
