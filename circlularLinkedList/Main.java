package circlularLinkedList;

public class Main {

	public static void main(String[] args) {
		CLL list= new CLL();
		list.insert(10);
		list.insert(11);
	    list.insert(12);
	    list.insert(13);
	    list.delete(11);
	    list.display();
	}

}
