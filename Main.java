import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.StringBufferInputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] str = br.readLine().split(" ");
			for (int i=0; i <=1; i++) {
				char[] reverse = str[i].toCharArray();
				for (int j=0; j < 1; j++) {
					char temp = reverse[j];
					reverse[j] = reverse[reverse.length-1];
					reverse[reverse.length-1] = temp;
					str[i] = String.valueOf(reverse);
				}
			}
			bw.append(Integer.parseInt(str[0]) < Integer.parseInt(str[1]) ? str[1] : str[0]);
			bw.close();
		} catch (Exception e) {}
	}
}