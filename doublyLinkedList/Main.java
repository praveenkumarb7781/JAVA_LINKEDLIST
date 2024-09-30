package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertFirst(25);
		list.insertFirst(20);
		list.insertLast(55);
		list.insert(20, 100);
		list.display();
		
	}

}
