
import java.util.*;

public class UniqueNames {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter Name: ");
			String name = scan.nextLine();
			if(name.equals("")) break;
			if(!list.contains(name)) {
				list.add(name);
			}
			
		}
		System.out.println("Unique name list contains:");
		printList(list);
	}
	private static void printList(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}