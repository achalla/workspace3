import java.util.Scanner;


public class Tester {

	public static int min(int a, int b){
		if(a < b) return a;
		else return b;
	}
	
	
	
	public static void main(String[] args){
		int[][] grid = new int[25][25];
		int[][] dp = new int[25][25];
		Scanner sc = new Scanner(System.in);
	    int gridSize = 25;
	    
	    
	    for(int i = 0; i < gridSize; i++){
	    	
	    	for(int j = 0; j < gridSize; j++){
	    		grid[i][j] = sc.nextInt();
	    	}
	    }
	    
	    for(int i = 0; i < gridSize; i++){
	    	for(int j = 0; j < gridSize; j++){
	    		if(j == 0) grid[i][j] += min(grid[i+1][j],grid[i][j+1]);
	    		else grid[i][j] += min(min(grid[i+1][j],grid[i][j+1]),grid[i][j-1]);
	    	}
	    }
	    for(int k = 0; k < gridSize; k++){
	    	System.out.println(grid[24][k]);
	    }
	}
	
}	
