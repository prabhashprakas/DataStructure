package linkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(); 
		list.append("king");
		list.addAtStart("sonal");
		list.append("kong");
		list.append("jong");
		list.addAtStart("sonu");
		list.append("monu");
		list.printList();
	}

}
