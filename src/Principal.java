
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LDE lista = new LDE();
		
		lista.insetAtEnd(10);
		lista.insetAtEnd(32);
		lista.insetAtEnd(22);
		lista.insetAtEnd(5);
		lista.print();
		
		lista.insertAtPosition(1, 3);
		lista.print();
	}

}
