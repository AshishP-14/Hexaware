package training;

public class StringManip {
    public static void main(String[] args) {
    	
    	StringBuilder s1 = new StringBuilder("Employee");
    	StringBuilder s2 = new StringBuilder("Company");
    	
    	System.out.println("Strings are equal? "+ s1.toString().equals(s2.toString()));
    	
    	System.out.println("length of s1: "+s1.length() +"\nlength of s2: "+s2.length());
    	
    	System.out.println(s1.substring(4));
    	System.out.println(s2.substring(4));
    	
    	System.out.println(s1.append(s2));
    	
    	System.out.println("lowercase "+ s1.toString().toLowerCase());
    
    	System.out.println("Uppercase "+ s1.toString().toUpperCase());
    
    	System.out.println("index of lo "+ s1.indexOf("lo"));
    	System.out.println("prefix big to s2 : "+ s2.insert(0, "Big"));
    	
    	
    	
    	
    	
//        String s1 = "student";
//        String s2 = "student";
//        String s3 =new String("student");
//        String s4 =new String("student");
        
//        System.out.println(s1+s1.hashCode()+
//        		"\n"+s2+s2.hashCode()+s3+s3.hashCode()+
//        		"\n"+s4+s4.hashCode());
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));
//        boolean areEqual = str1.equals(str2);
//        System.out.println(areEqual);
//        
//        System.out.println("Length of str1: " + str1.length());
//        System.out.println("Length of str2: " + str2.length());
//
//        
//        String subStr = str1.substring(4);
//        System.out.println("Substring of str1 from index 4: " + subStr);
//
//        
//        String str3 = str1.concat(str2);
//        System.out.println("Concatenated string: " + str3);
//
//        
//        System.out.println("Lowercase : " + str1.toLowerCase() +" "+str2.toLowerCase());
//        System.out.println("Uppercase : "+str1.toUpperCase() +" "+ str2.toUpperCase());
//
//        
//        int index = str1.indexOf("lo");
//        System.out.println("Index of 'lo' in str1: " + index);
    }
}

