import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println(c>b ? a/(c-b)+1 : -1);
	}
}