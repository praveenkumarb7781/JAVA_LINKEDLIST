package singlyLinkedList;

public class Main {

	public static void main(String[] args) {
		LL list= new LL();
		list.insertFirst(10);
		list.insert(99, 1);
		list.insert(100, 2);
		list.insertLast(112);
		//System.out.println(list.deleteFirst());
		//System.out.println(list.deleteLast());
		System.out.println(list.delete(2));
		list.display();

	}

}
