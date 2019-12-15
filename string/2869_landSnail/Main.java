import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = st.nextToken();
			double b = st.nextToken();
			double v = st.nextToken();
			if (a==v) {
				bw.write("1");
			} else {
				bw.write(String.valueOf((int)Math.ceil((v-a)/(a-b)) + 1));			
			}
			bw.close();
		} catch (Exception e) {
		}
	}
}