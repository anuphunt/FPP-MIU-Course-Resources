package prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			Node currentNode = header;
			
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node newNode = new Node(null, currentNode, item);
			currentNode.next = newNode;
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			Node(){}
			
			Node(Node next, Node previous, String value){
				this.next = next;
				this.previous = previous;
				this.value = value;
			}
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
			list.addLast("Anup");
			System.out.println(list);
		}
}