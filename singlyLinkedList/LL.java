package singlyLinkedList;

public class LL {
	
	public class Node
	{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
	}

	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size=0;
	}
	
	public void insertFirst(int val) {
		Node n=new Node(val);
		n.next=head;
		head=n;
		
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		Node n=new Node(val);
		tail.next=n;
		tail=n;
		size++;
	}
	
	public void insert(int val,int ind) {
		if(ind==0) {
			insertFirst(val);
			return;
		}
		if(ind==size) {
			insertLast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<ind;i++) {
			temp=temp.next;
		}
		Node n=new Node(val,temp.next);
		temp.next=n;
		size++;
	}
	
	public int deleteFirst() {
		int val=head.value;
		head=head.next;
		if(head==null) tail=null;
		size--;
		return val;
	}
	
	public int deleteLast() {
		Node secn=get(size-2);
		
		int val=tail.value;
		tail=secn;
		tail.next=null;
		return val;
	}
	
	public int delete(int ind) {
		if(ind==0) deleteFirst();
		if(ind==size-1) deleteLast();
		
		Node prev=get(ind-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		return val;
	}
	
	public Node get(int ind) {
		Node n= head;
		for(int i=0;i<ind;i++) {
			n=n.next;
		}
		return n;
	}
	
	public void display() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	
}
