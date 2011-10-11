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

public class LinkedList{
   Node head;

   public LinkedList(){
	 this.head = null;
   }

   public void appendLast(LinkedList list, int d){
	 Node n1 = new Node(d);
     if(list.head == null){
		 list.head = n1;
		 return;
	 }
     
	 Node n = list.head;
	 while(n.next != null){
		  n = n.next;
	 }
    n.next = n1;
  }

  public void display(){
	Node list = this.head;
    do{
		System.out.print(list.data + " -> ");
	    list = list.next;
	}while(list.next!=null);
    System.out.println( "null");
  }

  public static void main(String[] args){
   LinkedList list = new LinkedList();
   System.out.println(" ***** Adding elemnts to list *****");
   list.appendLast(list, 1);
   list.appendLast(list, 2);
   list.appendLast(list, 3);
   list.appendLast(list, 4);
   System.out.println("**** The Elements in Linked List are: ****");
   if( list.head == null){
	   System.out.println("the list is empty");
   }else{
		list.display();
   }
  }

}
