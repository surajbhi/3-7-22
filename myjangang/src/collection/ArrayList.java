
public class ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("abc");
		al.add('D');
		al.add(100);
		al.add(null);
		al.add(null);
		System.out.println(al);
		// get the size
		System.out.println(al.size());
		// printing value at a particular index
		System.out.println(al.get(2));
		// set a value at a particular index
		al.set(1, "XYZ");
		System.out.println(al);
		// remove a value at a particular index
		al.remove(4);
		System.out.println(al);
		// to check a value
		System.out.println(al.contains("XYZ"));
		// to check if it is empty or not
		System.out.println(al.isEmpty());
		// to delete all records
		al.clear();
		System.out.println(al);
	}
}