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
    while(list.next!=null){
		System.out.print(list.data + " -> ");
	    list = list.next;
	}
    System.out.println( "null");
  }

  public Node find(int d){ return null;}

  public void deleteNode(int d){}

  public Node addNode(int index, int d){ return null;}


  public boolean isEmpty(){
	  return head == null;
  }

  public static void main(String[] args){
	   LinkedList list = new LinkedList();
	   System.out.println(" ***** Adding elemnts to list *****");
	   list.appendLast(1);
	   list.appendLast(2);
	   list.appendLast(3);
	   list.appendLast(4);
	   list.appendFirst(0);
	   list.appendFirst(-1);
	   System.out.println("**** The Elements in Linked List are: ****");
	   list.display();  
  }

}
