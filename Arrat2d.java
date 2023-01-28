package day5_functional;

import java.util.Scanner;

public class Arrat2d {

	public static void main(String[] args) {
	
			try (Scanner sc = new Scanner (System.in)) {
				System.out.println("Enter the numbers:");
				int row =sc.nextInt();
				int col =sc.nextInt();
				
				 System.out.println("Enter array elements : ");    
				    
				   int twoD[][]=new int[row][col];
				    
				      
				    for(int i=0; i<row;i++)
				     {            
				        for(int j=0; j<col;j++)
				        {
				            twoD[i][j]=sc.nextInt();
				        }
				     }
				    System.out.print("\nData you entered : \n");
				    for(int []x:twoD){
				        for(int y:x){
				        System.out.print(y+"        ");
				        }
				        System.out.println();
				    }
			}
		}
	}
			
		        

	