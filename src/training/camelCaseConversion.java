package training;

public class camelCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a brown fox jumped into the lazy";
	    
	    StringBuilder res = new StringBuilder();
	    String[] arr = str.split(" ");
	    
	    for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (i == 0) {
                res.append(word);
            } else {
                res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }
        System.out.println(res.toString()); 
        
        
      
	}

}
