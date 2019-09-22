package hublal_p3;
import java.util.Scanner;
public class hublal_p3 {
	public static void main(String[] args) {
	float min=0,max=0,temp;
	int i,j,minMark=0,maxMark=0;
	String[] topics = {"\nHow important is freedom of speech?","\nHow important is the right to own guns?","\nHow important is the upcoming election?","\nHow important is Area 51 to you?","\nHow important is Healthcare to you?"};
	int[][] response = new int[10][5];
	Scanner scnr = new Scanner(System.in);
	for (i=0 ; i<10 ; i++) {
		System.out.print("Please rate the following topics on a scale of one to ten based on how important they are to you.");
		for (j=0 ; j<5 ; j++) {
			System.out.print(topics[j]);
			response[i][j] = scnr.nextInt();
	    }
	}	
	for (j=0 ; j<5 ; j++) {
		System.out.printf("\n"+ topics[j]);
		for (i=0 ; i<10 ; i++) {
			System.out.printf("\t%d",response[i][j]);	
		}
		temp = (response[0][j]+response[1][j]+response[2][j]+response[3][j]+response[4][j]+response[5][j]+response[6][j]+response[7][j]+response[8][j]+response[9][j])/(float)10;
		if (max == 0) {
			max = temp;
			maxMark=j;
		}
		if (min ==0) {
			min = temp;
			minMark = j;
		}
		if (temp > max) {
			max = temp;
			maxMark = j;
		}
		if (temp < min) {
			min = temp;
			minMark = j;
		}	
		System.out.printf("\t%.3f",temp);
	}
	System.out.printf(topics[maxMark] + " has recieved the highest point total of " + (max*10) + "!\n");
	System.out.printf(topics[minMark] + " has recieved the lowest point total of " + (min*10) + "!\n");
	scnr.close();
}
	
}
