package training;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 3, 5, 6, 8, 9 ,10};
		double sum = 0;
		int len = arr.length;
		double avg;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
		}
		avg = sum /len ;
		System.out.println("Average of array is : "+ avg);

	}

}
