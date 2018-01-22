package linkedList;

public class LinkedList<T> {
	
	private Node<T> head; 
	
	private Node<T> last;
	
	LinkedList() {
		head = last = null; 
	}
	
	public void printList() {
		Node<T> temp = head; 
		while(temp.hasNext()) {
			System.out.println(temp.getData());
			temp = temp.getNext(); 
		}
	}
	
	public void add(T data) {
		if(head == null) {
			
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
}
