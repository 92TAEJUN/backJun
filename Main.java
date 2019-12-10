import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String[] alphabet  = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		for (String temp : alphabet) {
			str = str.replace(temp, "a");
		}
		System.out.println(str.length());
	}
}