package training;

import java.util.*; 

public class HourGlass {
	
	public static int calculateHours(int[][] array){
		int temp = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				sum = array[i][j] + array[i][j + 1] + array[i][j + 2]
						+ array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] 
								+ array[i + 2][j + 2];
				temp = sum>temp?sum:temp;
			}
		}
		return temp;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] myArray = new int[6][6];
        
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 6; j++)
                myArray[i][j] = sc.nextInt();
        
        sc.close();
        
        int res = calculateHours(myArray);
        System.out.println(res);
    }
    
}