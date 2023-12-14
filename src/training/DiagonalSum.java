package training;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = {{2,4,6,8}, {1,3,6,9},{2,8,2,6},{1,1,1,1}};
		int row = arr2D.length;
		int col = arr2D[0].length;
		System.out.println(row +" "+ col);
        for(int j =0; j<row ;++j) {
        for(int i=0;i< col;++i) {

            System.out.print( " " + arr2D[j][i]);
        }
        System.out.println();
        }
        
        int dsum =0;
        for(int j =0; j<arr2D.length ;++j) {
            for(int i=0;i< arr2D[j].length;++i) {
            		if(i==j) {
            			System.out.println(arr2D[j][i]);
            			dsum+=arr2D[j][i];
            		}
            }
        }
        System.out.println("diagonal sum:  " +dsum);
        
	}

}
