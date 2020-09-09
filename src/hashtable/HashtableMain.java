package hashtable;

public class HashtableMain {

	public static void main(String[] args) {

		Hashtable<String, String> map = new Hashtable<>(5);

		map.put("Shiva", "Shiva Verma");
		map.put("Madhav", "Madhav Verma");
		map.put("Raghav", "Raghav Verma");
		map.put("Dhruv", "Dhruv Verma");
		map.put("Dhruv", "Dhruv Verma");
		map.put("Keshav", "Keshav Verma");
		map.put("Krishna", "Krishna Verma");
		map.put("Krishn", "Krishna Verma");
		map.put("Krishnaa", "Krishna Verma");
//		System.out.println(map.get("545"));
//		System.out.println(map.get("Keshav"));
//		System.out.println(map.remove("Keshav"));
		System.out.println(map.remove("Keshav", "Keshav Verma"));
//		System.out.println(map.get("Dhruv"));
		map.printHashtable();
	}
}
