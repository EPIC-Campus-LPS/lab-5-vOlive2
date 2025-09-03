import java.util.Scanner;
public class lab5file1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1c1 = scan.nextInt();
		int r1c2 = scan.nextInt();
		int r1c3 = scan.nextInt();
		int r2c1 = scan.nextInt();
		int r2c2 = scan.nextInt();
		int r2c3 = scan.nextInt();
		int r3c1 = scan.nextInt();
		int r3c2 = scan.nextInt();
		int r3c3 = scan.nextInt();
		int tot = r1c1 + r1c2 + r1c3;
		boolean check1 = r2c1 + r2c2 + r2c3 == tot;
		boolean check2 = r3c1 + r3c2 + r3c3 == tot;
		boolean check3 = r1c1 + r2c1 + r2c1 == tot;
		boolean check4 = r1c2 + r2c2 + r3c2 == tot;
		boolean check5 = r1c3 + r2c3 + r3c3 == tot;
		boolean check6 = r1c1 + r2c2 + r3c3 == tot;
		boolean check7 = r3c1 + r2c2 + r1c3 == tot;
		if(check1 && check2 && check3 && check4 && check5 && check6 && check7) {
			System.out.println("The array is a magic square");
		} else {
			System.out.println("The array is not a magic square");
		}
	}
}
