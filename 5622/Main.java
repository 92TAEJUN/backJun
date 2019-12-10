import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		int[] alphabet = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		try {
			char[] inValue = br.readLine().toCharArray();
			for (char ch : inValue) {
				result += alphabet[ch-'A'];
			}
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
		} catch (Exception e) {}
	}
}