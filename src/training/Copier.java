package training;

public class Copier {
    public static void main(String... original) {
    	String[] copy = new String[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println(copy.length + " " + copy[0]);
    }
}
