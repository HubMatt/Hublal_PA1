package hublal_p1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int unEn,dig1,dig2,dig3,dig4;
		Scanner scnr = new Scanner(System.in);
		System.out.printf("Enter the number you wish to encrypt:\n");
		unEn = scnr.nextInt();
		dig1 = (((unEn/1000)+7) % 10);
		dig2 = (((unEn/100%10)+7) % 10);
		dig3 = (((unEn/10%100)+7) % 10);
		dig4 = (((unEn%1000 )+7) % 10);
		System.out.printf("Your encrypted number is now:\n%d%d%d%d",dig3,dig4,dig1,dig2);
		scnr.close();
 }
}
