package UC3_Queue;

public class LinkedList <T> {
	Node<T> head;

	
//	 * @param Node data added at Start
	 
	public void AtStart(T data) {
		Node<T> node =new Node<>();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	
//	 * Printing The Data Of Node till next equal to null
	 
	public void show() {
		Node<T> node = head;
		if(head==null) {
			System.out.println(" is Empty");
		}
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}