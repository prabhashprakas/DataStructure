package linkedList;

public class LinkedList<T> {
	
	private Node<T> head; 
	
	private Node<T> last;
	
	LinkedList() {
		head = last = null; 
	}
	
	public void printList() {
		Node<T> temp = head; 
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext(); 
		}
	}
	
	public void append(T data) {
		if(head == null) {
			head = new Node<T>(data); 
			this.last = head; 
		}
		else {
			this.last.setNext(new Node<T>(data));
			last = last.getNext(); 
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
}
