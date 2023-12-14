package training;

public class Student {
	 String name ;
	 int rollno ;
	 enum Day {
		 		MON, TUE, WED, THU, FRI, SAT, SUN 	
		}
	 private Day labday;
	  Student(){
	     name = "default" ;
	     rollno = 1;
	  }

	  Student(String stdname, int id , Day labday){
	        name = stdname ;
	        rollno = id;
	        this.labday = labday;
	  }

	  String introduce(){
	        return "My Name is " + name +" "+ rollno + " labday is: "+ labday;
	  }


	  public static void main(String[] args) {
	        Student ron = new Student("Ron",2,Day.MON);
	        Student simi =new Student("Simi",5,Day.TUE);
	        Student anony = new Student("anony",1,Day.FRI);

	        String s = ron.introduce();
	        System.out.println(s);

	        String r = simi.introduce();
	        System.out.println(r);

	        String d = anony.introduce();
	        System.out.println(d);
	  }

}
