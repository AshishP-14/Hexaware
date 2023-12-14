package training;

public class Students {
	int rollno;
	String name;
	public Students(int rollno , String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public void ifElseMethod () {
		// Using if else statement 
				System.out.println("Using if else statement");
				if (rollno >= 1 && rollno <= 2) {
		            System.out.println("Batch 1");
		            System.out.println("Student Name: " + name );
		            System.out.println("roll no. : "+ rollno);
		        } else if (rollno >= 3 && rollno <= 4) {
		            System.out.println("Batch 2");
		            System.out.println("Student Name: " + name);
		            System.out.println("roll no. : "+ rollno);
		        } else if (rollno >= 5 && rollno <= 6) {
		            System.out.println("Batch 3");
		            System.out.println("Student Name: " + name);
		            System.out.println("roll no. : "+ rollno);
		        } 
	}
	public void switchCaseMethod() {
		// using Switch case Statement 
				System.out.println("using Switch case Statement ");
				switch (rollno) {
		        case 1:
		        case 2:
		            System.out.println("Batch 1");
		            System.out.println("Student Name: " + name);
		            System.out.println("roll no. : "+ rollno);
		            break;
		        case 3:
		        case 4:
		            System.out.println("Batch 2");
		            System.out.println("Student Name: " + name);
		            System.out.println("roll no. : "+ rollno);
		            break;
		        case 5:
		        case 6:
		            System.out.println("Batch 3");
		            System.out.println("Student Name: " + name);
		            System.out.println("roll no. : "+ rollno);
		            break;
		        default:
		            System.out.println("Invalid rollno.");
		    }
	}
	public static void main(String[] args) {
		Students s = new Students(2,"Ashish");
		s.ifElseMethod();
		s.switchCaseMethod();
		
		Students s1 = new Students(6,"Ayush");
		s1.ifElseMethod();
		s1.switchCaseMethod();
	
	}

}
