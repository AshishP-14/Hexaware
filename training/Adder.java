package training;

public class Adder {

//	 Integer a = 20 , b = 25 ;
//	 Character ch1 = 'a';
//	 Character ch2 ='c';
//	 Float f1 = 54.25f , f2 = 25.88f ;
//	 Boolean b1 = true , b2= false ;
	
	public  Integer  addInt (Integer a , Integer b) {
		return a+b;
	}
	public  Character addChar(Character ch1 , Character ch2) {
		return  (char)(ch1+ch2) ;
	}
	public  Float addFloat(Float f1,Float f2) {
		return f1+f2;
	}
	public  Boolean andBoolean(Boolean b1 ,Boolean b2) {
		return b1&&b2;
	}
	public  Integer addInt1(Integer x, Integer y){
		return x+y;
	}
	
	public static void main(String[] args) {
		Adder ad = new Adder();
		Integer sum = ad.addInt(20,25);
		System.out.println("sum of a and b is  " + sum);
		
		Float sumf = ad.addFloat(36.5F,22.5f);
		System.out.println("sum of f1 and f2 is "+ sumf);
		
		Boolean sumb = ad.andBoolean(true,false);
		System.out.println("b1 & b2 is "+ sumb);
		
		Character sumc = ad.addChar('x','a');
		System.out.println(sumc);
		
		System.out.println(ad.addInt1(5,10));
		
		
	}

}

