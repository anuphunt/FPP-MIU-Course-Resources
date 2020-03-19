package mystringlinkedlist;

public class Main {

	public static void main(String[] args) {
		MyStringLinkedList l = new MyStringLinkedList();

		l.add("Bob");
		l.add("Gerald");
		l.add("Thomas");
		
		System.out.println(l);
		l.addFirst("Anup");
		l.addLast("Pradip");
		System.out.println(l);
		l.deleteFirst();
		System.out.println(l);
		l.deleteLast();
		System.out.println(l);

//		System.out.println(l);
//		System.out.println(l.size());
//
//		// l.sort();
//		if (l.size() > 0) {
//			System.out.println(l);
//		}
//
//		else {
//			System.out.println("empty");
//		}
//
//		l.insert("Bob", 0);
//		l.insert("Dave", 1);
//		l.insert("Jim", 2);
//		l.add("Ricardo");
//		System.out.println(l);
//		// l.sort();
//
//		System.out.println(l);
//
//		System.out.println("Size = " + l.size());
//		System.out.println("The list = " + l);
//		l.insert("Sally", 2);
//		l.insert("Billy", 0);
//		System.out.println("Size = " + l.size());
//		// System.out.println("The list = "+l);
//		// l.sort();
//		System.out.println("The list = " + l);
//		System.out.println("Found Bob " + l.find("Bob"));
//		System.out.println("Found Bobby " + l.find("Bobby"));
//		l.remove("Sally");
//		System.out.println(l);
//		l.remove(0);
//		System.out.println(l);
//	
	}
}
