import java.util.*;
public class UniqueNames {
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		nameInput();
		System.out.println(names);
	}
	public static ArrayList<String> nameInput() {
		System.out.println("Enter name: ");
		names.add(input.nextLine());
		return names;
	}
}
