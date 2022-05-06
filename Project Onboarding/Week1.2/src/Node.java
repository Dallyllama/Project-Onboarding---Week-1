public class Node {

	int key;
	Node next;
	Node(int key)
	{
	    this.key = key;
	    this.next = null;
	}
	static Node findLoopingKey(Node head)
	{
	    Node temp = new Node(1);
	    while (head != null)
	    {
	        if (head.next == null)
	        {
	            return null;
	        }
	        if (head.next == temp)
	        {
	            break;
	        }
	        Node next = head.next;
	 
	        head.next = temp;
	 
	        head = next;
	    }
	 
	    return head;
	}
	 
	public static void main(String[] args)
	{
	    Node head = new Node(43);
	    head.next = new Node(25);
	    head.next.next = new Node(65);
	    head.next.next.next = new Node(42);
	    head.next.next.next.next = new Node(61);
	    head.next.next.next.next.next = new Node(2);
	    head.next.next.next.next.next.next = head.next.next;
	    Node res = findLoopingKey(head);
	    if(res != null)
	        System.out.print("Loop starting node is " + res.key);
	 
	}
}