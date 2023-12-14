package training;

public class Circles {
	private int r;
	private String color;
	private String material;
	
	final float pi ;
	
	Circles(){
		r = 2;
		pi=3.1456789f;
	}
	
	Circles(int r){
		this.r = r;
		pi=3.1456789f;
	}
	
	Circles(int r, String color, String material){
		this.r = r;
		this.color = color;
		this.material = material;
		pi=3.1456789f;
	}
	
	public double area() {
		double x = 3.14*r*r;
		return x;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circles c2 = (Circles)obj;
		return this.r == c2.r && this.color.equals(c2.color) && this.material.equals(c2.material);
		
		
	}
	
	//if two equal return true then there hashcode be same.
	@Override
	public int hashCode() {
		return this.r+this.color.length()+this.material.length();
		
	}
}
