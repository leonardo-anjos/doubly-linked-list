
public class LDE {
	public Node head;
	public Node tail;

	public LDE() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
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
