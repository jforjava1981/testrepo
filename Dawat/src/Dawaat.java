import java.io.*;

public class Dawaat {
	public static void main(String[] args) throws IOException {
		System.out
				.println("*       *  *****  *      ****   ****   *     *  *****   *******   ****    *****     *    *       *    *      *   *******");
		System.out
				.println("*   *   *  *      *     *      *    *  * * * *  *          *     *    *    *   *   * *   *   *   *   * *    * *     *");
		System.out
				.println("*   *   *  ***    *     *      *    *  *  *  *  ***        *     *    *    *   *  *****  *   *   *  *****  *****    *");
		System.out
				.println(" * * * *   *      *     *      *    *  *     *  *          *     *    *    *   *  *   *   * * * *   *   *  *   *    *");
		System.out
				.println("  *   *    *****  *****  ****   ****   *     *  *****      *      ****    *****   *   *    *   *    *   *  *   *    *");
		// String x = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, t = 0;
		String m[] = new String[100];
		int n[] = new int[100];
		do {
			System.out
					.println("Enter 'vm' for vegetarian menu and 'nm' for non vegetarian menu");
			String a = (br.readLine());
			if (a.equalsIgnoreCase("vm")) {
				System.out
						.println("Enter 'i' for Indian foods,'ch' for chinese foods, 'co' for continental foods and 'be' for beverages");
				String b = (br.readLine());
				if (b.equalsIgnoreCase("i")) {
					System.out
							.println("Enter 'r' for rice,'b' for Indian bread,'cu' for curries,'sw' for sweets");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("r")) {
						System.out.println("1.Steamed Rice				Rs 20");
						System.out.println("2.Jeera Rice				Rs 40");
						System.out.println("3.Curd Rice					Rs 40");
						System.out.println("4.Pulav						Rs 80");
						System.out.println("5.Veg Biryani				Rs 120");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Steamed Rice");
							n[t] = 20;
							break;
						case '2':
							m[t] = ("Jeera Rice");
							n[t] = 40;
							break;
						case '3':
							m[t] = ("Curd Rice");
							n[t] = 40;
							break;
						case '4':
							m[t] = ("Pulav");
							n[t] = 80;
							break;
						case '5':
							m[t] = ("Veg Biryani");
							n[t] = 120;
							break;
						}
					}
				}
			}
			br.skip(2);
			System.out.println("Do you want to continue(y/n)");
		} while (br.readLine().equalsIgnoreCase("y"));
		System.out.println("Sr No \t Name \t cost");
		for (int i = 0; i <= t; i++) {
			sum = n[i] + sum;
			if (m[i] != "")
				System.out.println((i + 1) + "\t" + m[i] + "\t" + n[i]);
		}
		System.out.println("\t  Total=" + sum);
	}
}
