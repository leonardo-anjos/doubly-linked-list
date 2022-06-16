
public class LDE {
	public Node head;
	public Node tail;

	public LDE() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}
	
	// problem 1 -> insert value A in position B
	public void insertAtPosition(int value, int position) {
		if (position < 0 || position > this.length()) return;
		
		Node aux = this.head;
		
		for (int i = 0; i < position; i++) {
			aux = aux.next;
		}
		
		Node node = new Node(value);
		node.next = aux.next;
		node.prev = aux;
		aux.next.prev = node;
		aux.next = node;
	}
	
	public void insetAtEnd(int value) {
		Node node = new Node(value);
		node.next = tail;
		node.prev = tail.prev;
		tail.prev.next = node;
		tail.prev = node;
	}
	
	public int length() {
		int tam = 0;
		Node aux = head.next;
		
		while(aux != tail) {
			aux = aux.next;
			tam++;
		}
		
		return tam;
	}
	
	public boolean isEmpty() {
		if(head.next == tail) return true;
		return false;
	}
	
	public void print() {
		Node aux = head.next;
		
		while(aux != tail) {
			System.out.print(aux.info + "-");
			aux =  aux.next;
		}
		
		System.out.println("");
	}
}
