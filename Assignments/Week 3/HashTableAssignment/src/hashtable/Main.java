package hashtable;

public class Main {
	public static void main(String[] args) {
		MyHashtable hashtable = new MyHashtable();
		
		hashtable.put("Alex","641-472-1111");
		hashtable.put("James","641-472-2222");
		hashtable.put("Harry","641-472-555");
		hashtable.put("Sally","641-472-555");
		hashtable.put("Susan","641-472-544");
		
		System.out.println("All Datas :\n"+hashtable.toString());
		System.out.println("------------------");
		System.out.println("Total number of entry:"+hashtable.countEntry());
		System.out.println("------------------");
		System.out.println("Total number elements in largest LinkedList:\n"+hashtable.getElementsInLongestLinkedList());
		System.out.println("------------------");
		System.out.println("Total number empty cells in the table:"+hashtable.getNumberOfEmptyCell());
	}
}