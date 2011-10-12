import java.io.*;
/* Single Node in a LinkedList */
class Node{
	Node next = null;
	int data;

	public Node(int element){
		this(element, null);
	}

	public Node(int element, Node next){
		this.data = element;
		this.next = next;
	}
}

/* class for Linked List */
public class LinkedList{
  private Node head;

   public LinkedList(){
	 this.head = null;
   }

   public void appendLast(int d){
	 Node n1 = new Node(d);
     if(head == null){
		 head = n1;
		 return;
	 }
     
	 Node n = head;
	 while(n.next != null){
		  n = n.next;
	 }
    n.next = n1;
  }

  public void appendFirst(int d){
	Node ele = new Node(d);	
	Node temp = head;
	head = ele;
	ele.next = temp;
  }

  public void display(){
	Node list = head;
	if(isEmpty()){
		System.out.println( "null");
		return;
	}
	while(list != null){
		System.out.print(list.data + " -> ");
	    list = list.next;
	}
	System.out.println( "null");
  }

  /** -1 indicates the Node could not be found **/
  public int findNode(int d){
      int index_cnt = 0;
	  if(isEmpty()){
          return -1;
	  }else{
		 Node current = head;
	     while(current.next!= null && current.data != d){
			  current = current.next;		
			  index_cnt++;
		  }

		 if(current.data != d){
			return -1;
		 }
	 }
	 return index_cnt;
  }

  public void deleteNode(int d){
	if(isEmpty()){
		System.out.println("The List is empty.");
	}else{
		Node current = head;
		Node prev = null;
		if(head.data == d){
           head = current.next;
		   return;
		}

		while(current.next!= null && current.data != d){
			prev = current;
			current = current.next;		
		}

		if(current.data == d){
			prev.next = current.next;
		}else{
		  System.out.println("The node to be deleted is not found in the list");
		}

	}
  }

  public void addNode(int index, int d){ 
	  if(findNode(d)== -1){
		  System.out.println("Node cannot be inserted at the given index");
	  }else{
		 Node current = head;
		 int index_cnt = 0;
	     while(current.next!= null && index_cnt == index){
			  current = current.next;					 
		  }
		 current.next = new Node(d);
	  }
	  
  }


  public boolean isEmpty(){
	  return head == null;
  }

  public static int readIntValue(){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	String val = null;
	try {
         val = br.readLine();
	} catch (IOException ioe) {
        System.out.println("IO error trying to read your name!");
        System.exit(1);
	}
	return Integer.valueOf(val);
  }
  
  public static void main(String[] args){
	   LinkedList list = new LinkedList();	        
	   for(;;){
		System.out.println("Enter the operation you wish to do.  \n");
		System.out.println("1) Add Node at First 2)Add Node at Last 3) Delete Node 4) Find Node 5) Print List 6)Add node at index 7) Exit the Program");
		int code = readIntValue();  
		switch(code) {
		   case 1: 
				   System.out.println("Enter the value to add ");
				   list.appendFirst(readIntValue());
				   list.display();
			       break;
		   case 2: 
				   System.out.println("Enter the value to add");
				   list.appendLast(readIntValue());
				   list.display();
			       break;
		   case 3: 
				   System.out.println("Enter the value to delete ");
				   list.deleteNode(readIntValue());
				   list.display();
			       break;
		   case 4: 
				   System.out.println("Enter the value to find ");
				   int index = list.findNode(readIntValue());
				   if( index == -1){
					   System.out.println("The Node is not found");
				   }else{
					   System.out.println("The Node is  found at " + index);
				   }
				   
			       break;
		   case 5: 
				   list.display();
			       break;
		   case 6: 
				   System.out.println("Enter the value to add ");
				   System.out.println("Enter the index ");
			       break;
		   case 7: 
				   System.out.println("You have choosen to end");
				   System.exit(0);
				   break;
		   default:
					System.out.println("Enter your correct choice between 1 to 7");
				   break;
		  }
	   }
	  // System.out.println(" ***** Adding elemnts to list *****");
	  // list.appendLast(1);
	  // list.appendLast(2);
	  // list.appendLast(3);
	  // list.appendLast(4);
	  // list.appendFirst(0);
	  // list.appendFirst(-1);
	  // System.out.println("**** The Elements in Linked List are: ****");
	  // list.display();  
  }

}
