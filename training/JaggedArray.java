package training;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] arr2d = {{1,1,1,1,1,1},{2,2,2,2},{3,3,3},{4,4,4,4,4,4,4}};
		
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j] +" ");
			}
			System.out.println();
			System.out.println("length of row"+ "["+i+"]"+ "= "+arr2d[i].length);
		}
		
		
	}

}
