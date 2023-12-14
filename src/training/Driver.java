package training;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles c1 = new Circles(2,"Red","paper");
		Circles c2 = new Circles(2,"Red","cloth");
		Circles c3 = new Circles(2,"Red","paper");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c1.hashCode());
	}

}
