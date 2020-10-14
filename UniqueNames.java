import java.util.*;
//complete
public class UniqueNames {
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		nameInput();
		//checks names arraylist for duplicates
		for(int i = 0; i <= names.size(); i++) {
			for(int x = i + 1; x < names.size(); x++) {
				if(names.get(i).equalsIgnoreCase(names.get(x))) {
					String removed = names.remove(i);
					if(removed.equals(names.get(x)))names.remove(x);
				}
			}
		}
		System.out.println("Unique name list contains: ");
		System.out.println(names);
	}
	//name input, breaks if input is blank
	public static ArrayList<String> nameInput() {
		String name = "initialized";
		while(name.length() > 0) {
		System.out.println("Enter name: ");
		name = input.nextLine();
		names.add(name);
		}
		return names;
	}
}