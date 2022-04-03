package UC1_CreateStack;

public class MyStack<T> {
	Node<T> top;
	int index;
	
//	Object of Linked List class to invoke linked List Class Method

	LinkedList<T> List = new LinkedList<T>(); 
									
	
//	 * Stack Push Operation by Using Linked List Add Method
	
	public void push (T data) {
		
		List.AtStart(data);
	}

	public void showRunner () {
		
		List.show() ;
	}

}