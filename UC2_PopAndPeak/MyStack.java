package UC2_PopAndPeak;

public class MyStack<T> {
	Node<T> top;
	int index;
	
//	Object of Linked List class to invoke linked List Class Method

	LinkedList<T> List = new LinkedList<T>(); 
									
	
//	 * Stack Push Operation by Using Linked List Add Method
	 
	public void push (T data) {
		
		List.AtStart(data);
	}
	
//     * For removes the top most Data/value of the stack
     
    public void pop() {
    	List.pop();
    }
    
//     * For  find the first element in stack
//     * @return
     
    public T peek() {
    	
    	while(List.peak() != null) {
            System.out.println("Top most element of the stack is: "+List.peak());
            break;
    	}
        return List.peak();
    }
	
//	 * Show function by Using Linked List Class Method
	 
	public void showRunner () {
		
		List.show() ;
	}

}