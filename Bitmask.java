
public class Bitmask {

	public static void main(String[] args) {
		int n = 5;
		int position = 1;
		int bitmask = 1<<position;
		if((bitmask & n)==0) {
			System.out.println("zero");
		}else {
			System.out.println("one");
		}
	}

}
