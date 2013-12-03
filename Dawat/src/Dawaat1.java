import java.io.*;

public class Dawaat1 {
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
		String x = "";
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
					if (c.equalsIgnoreCase("b")) {
						System.out.println("1.Roti					Rs 15");
						System.out.println("2.Naan					Rs 25");
						System.out.println("3.Kulcha				Rs 30");
						System.out.println("4.Chapati				Rs 10");
						System.out.println("5.Aloo Parantha			Rs 30");
						System.out.println("6.Methi Parantha		Rs 30");
						System.out.println("7.Mooli Parantha		Rs 30");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Roti");
							n[t] = 15;
							break;
						case '2':
							m[t] = ("Naan");
							n[t] = 25;
							break;
						case '3':
							m[t] = ("Kulcha");
							n[t] = 20;
							break;
						case '4':
							m[t] = ("Chapati");
							n[t] = 10;
							break;
						case '5':
							m[t] = ("AlooParantha");
							n[t] = 30;
							break;
						case '6':
							m[t] = ("MethiParantha");
							n[t] = 30;
							break;
						case '7':
							m[t] = ("MooliParantha");
							n[t] = 30;
							break;
						}
					}
					if (c.equalsIgnoreCase("cu")) {
						System.out.println("1.Kaju Curry			Rs 130");
						System.out.println("2.Palak Paneer			Rs 140");
						System.out.println("3.Paneer Butter Masala 	Rs 150");
						System.out.println("4.Dal Tadka				Rs 40");
						System.out.println("5.Mushroom Masala		Rs 130");
						System.out.println("6.Malai Kofta			Rs 130");
						System.out.println("7.Tawa Fry				Rs 150");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Kaju Curry");
							n[t] = 15;
							break;
						case '2':
							m[t] = ("PalakPaneer");
							n[t] = 25;
							break;
						case '3':
							m[t] = ("Paneer Butter Masala");
							n[t] = 20;
							break;
						case '4':
							m[t] = ("Dal Tadka");
							n[t] = 10;
							break;
						case '5':
							m[t] = ("Mushroom Masala");
							n[t] = 30;
							break;
						case '6':
							m[t] = ("MalaiKofta");
							n[t] = 10;
							break;
						case '7':
							m[t] = ("Tawa Fry");
							n[t] = 30;
							break;
						}
					}
					if (c.equalsIgnoreCase("s")) {
						System.out.println("1.Gulab Jamun				Rs 600");
						System.out.println("2.Rasgulla					Rs 570");
						System.out.println("3.Ras-Malai					Rs 720");
						System.out.println("4.Halwa						Rs 480");
						System.out.println("5.Barfi      				Rs 700");
						System.out.println("All prices in Kg");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("GulabJamun");
							n[t] = 600;
							break;
						case '2':
							m[t] = ("Rasgulla");
							n[t] = 570;
							break;
						case '3':
							m[t] = ("Ras-Malai");
							n[t] = 720;
							break;
						case '4':
							m[t] = ("Halwa");
							n[t] = 480;
							break;
						case '5':
							m[t] = ("Barfi");
							n[t] = 700;
							break;
						}
					}
				}
				if (b.equalsIgnoreCase("ch")) {
					System.out
							.println("Enter 'n' for noodles,'f' for fried rice,'a' for appetizers");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("n")) {
						System.out.println("1.Pan Fried Noodles 		Rs 175");
						System.out.println("2.Haka Noodles				Rs 130");
						System.out.println("3.Schezwan Noodles			Rs 200");
						System.out.println("4.Boiled Baby Corn Noodles Rs 220");
						System.out.println("5.Vegetable Noodles		Rs 180");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Pan Fried Noodles");
							n[t] = 175;
							break;
						case '2':
							m[t] = ("Haka Noodles");
							n[t] = 130;
							break;
						case '3':
							m[t] = ("Schezwan Noodles");
							n[t] = 200;
							break;
						case '4':
							m[t] = ("Boiled Baby Corn Noodles");
							n[t] = 220;
							break;
						case '5':
							m[t] = ("Vegetable Noodles");
							n[t] = 180;
							break;
						}
					}
					if (c.equalsIgnoreCase("f")) {
						System.out.println("1.Fried Rice 			Rs 100");
						System.out.println("2.Schezwan	Fried Rice	Rs 140");
						System.out.println("3.Hunan Fried Rice		Rs 140");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Fried Rice");
							n[t] = 100;
							break;
						case '2':
							m[t] = ("Schezwan	Fried Rice");
							n[t] = 140;
							break;
						case '3':
							m[t] = ("Hunan Fried Rice");
							n[t] = 140;
							break;
						}
					}
					if (c.equalsIgnoreCase("a")) {
						System.out.println("1.Veg Momos				Rs 100");
						System.out.println("2.Spring Rolls				Rs 120");
						System.out.println("3.Veg Manchurian			Rs 100");
						System.out.println("4.Chilli Paneer			Rs 130");
						System.out.println("5.Veg Dimsums				Rs 100");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Veg Momos");
							n[t] = 100;
							break;
						case '2':
							m[t] = ("Spring Rolls");
							n[t] = 120;
							break;
						case '3':
							m[t] = ("Veg Manchurian");
							n[t] = 100;
							break;
						case '4':
							m[t] = ("ChilliPaneer");
							n[t] = 130;
							break;
						case '5':
							m[t] = ("Veg Dimsums");
							n[t] = 100;
							break;
						}
					}
				}
				if (b.equalsIgnoreCase("co")) {
					System.out
							.println("Enter 'sa' for sandwiches,'pi' for pizza and 'pa' for pasta");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("sa")) {
						System.out.println("1.Grilled Sandwich			Rs 30");
						System.out.println("2.Cheese Sandwich			Rs 40");
						System.out.println("3.Club Sandwich			Rs 60");
						System.out.println("4.Veg Burger				Rs 50");
						System.out.println("5.Cheese Burger			Rs 60");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Grilled Sandwich");
							n[t] = 30;
							break;
						case '2':
							m[t] = ("Cheese Sandwich");
							n[t] = 40;
							break;
						case '3':
							m[t] = ("Club Sandwich");
							n[t] = 60;
							break;
						case '4':
							m[t] = ("Veg Burger");
							n[t] = 50;
							break;
						case '5':
							m[t] = ("Cheese Burger");
							n[t] = 60;
							break;
						}
					}
					if (c.equalsIgnoreCase("pi")) {
						System.out.println("1.Margarita				Rs 70");
						System.out.println("2.Cheese 'n' Onion pizza	Rs 90");
						System.out.println("3.Veg Extravaganza			Rs 380");
						System.out.println("4.Cottage Cheese pizza		Rs 150");
						System.out.println("5.Mix Veg Pizza			Rs 175");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Margarita");
							n[t] = 70;
							break;
						case '2':
							m[t] = ("Cheese 'n' Onion pizza");
							n[t] = 90;
							break;
						case '3':
							m[t] = ("Veg Extravaganza");
							n[t] = 380;
							break;
						case '4':
							m[t] = ("Cottage Cheese pizza");
							n[t] = 150;
							break;
						case '5':
							m[t] = ("Mix Veg Pizza");
							n[t] = 175;
							break;
						}
					}
					if (c.equalsIgnoreCase("pa")) {
						System.out.println("1.Cheese Pasta				Rs 100");
						System.out.println("2.Tomato Pasta				Rs 120");
						System.out.println("3.Cream 'n' Onion Pasta	Rs 140");
						System.out.println("4.Original Italian Pasta	Rs 120");
						System.out.println("5.Mix Veg Pasta			Rs 150");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Cheese Pasta");
							n[t] = 70;
							break;
						case '2':
							m[t] = ("Tomato Pasta");
							n[t] = 90;
							break;
						case '3':
							m[t] = ("Cream 'n' Onion Pasta");
							n[t] = 380;
							break;
						case '4':
							m[t] = ("Original Italian Pasta");
							n[t] = 150;
							break;
						case '5':
							m[t] = ("Mix Veg Pasta");
							n[t] = 175;
							break;
						}
					}
				}
				if (b.equalsIgnoreCase("be")) {
					System.out
							.println("Enter 'h' for hot and 'c' for cold beverages");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("h")) {
						System.out.println("1.Tea						Rs 10");
						System.out.println("2.Coffee					Rs 15");
						System.out.println("3.Milk						Rs 10");
						System.out.println("4.Hot Chocolate			Rs 30");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Tea");
							n[t] = 10;
							break;
						case '2':
							m[t] = ("Coffee");
							n[t] = 15;
							break;
						case 23:
							m[t] = ("Milk");
							n[t] = 10;
							break;
						case '4':
							m[t] = ("Hot Chocolate");
							n[t] = 30;
							break;
						}
					}
					if (c.equalsIgnoreCase("c")) {
						System.out.println("1.Cold Drinks				Rs 35");
						System.out.println("2.Mineral Water			Rs 20");
						System.out.println("3.Soda						Rs 25");
						System.out.println("4.Lassi					Rs 30");
						System.out.println("5.Lemonade					Rs 40");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Cold Drinks");
							n[t] = 35;
							break;
						case '2':
							m[t] = ("Mineral Water");
							n[t] = 20;
							break;
						case 23:
							m[t] = ("Soda");
							n[t] = 25;
							break;
						case '4':
							m[t] = ("Lassi");
							n[t] = 30;
							break;
						case '5':
							m[t] = ("Lemonade");
							n[t] = 40;
						}
					}
				}
			}
			t++;
			if (a.equalsIgnoreCase("nm")) {
				System.out
						.println("Enter 'i' for Indian foods,'ch' for Chinese foods and 'co' for continental foods");
				String b1 = (br.readLine());
				if (b1.equalsIgnoreCase("i")) {
					System.out
							.println("Enter 'r' for rice,'s' for starters and 'cu' for curries");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("r")) {
						System.out.println("1.Chicken Dum Biryani		Rs 150");
						System.out.println("2.Mutton Dum Biryani		Rs 180");
						System.out
								.println("3.Hyderabadi Chicken BiryaniRs 220");
						System.out
								.println("4.Hyderabadi Mutton Biryani Rs 250");
						System.out.println("5.Egg Biryani				Rs 120");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Chicken Dum Biryani");
							n[t] = 150;
							break;
						case '2':
							m[t] = ("Mutton Dum Biryani");
							n[t] = 180;
							break;
						case '3':
							m[t] = ("Hyderabadi Chicken Biryani");
							n[t] = 220;
							break;
						case '4':
							m[t] = ("Hyderabadi Mutton Biryani");
							n[t] = 250;
							break;
						case '5':
							m[t] = ("Egg Biryani");
							n[t] = 120;
							break;
						}
					}
					if (c.equalsIgnoreCase("s")) {
						System.out.println("Tandoori Chicken			Rs 200");
						System.out.println("Fish Fry(seasonal)			Rs 150");
						System.out.println("Malai Kebab(Chicken)		Rs 160");
						System.out.println("Grilled Chicken				Rs 180");
						System.out.println("Prawn Fry					Rs 250");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Tandoori Chicken");
							n[t] = 200;
							break;
						case '2':
							m[t] = ("Fish Fry");
							n[t] = 150;
							break;
						case '3':
							m[t] = ("Malai Kebab(Chicken)");
							n[t] = 160;
							break;
						case '4':
							m[t] = ("Grilled Chicken");
							n[t] = 180;
							break;
						case '5':
							m[t] = ("Prawn Fry");
							n[t] = 250;
							break;
						}
					}
					if (c.equalsIgnoreCase("cu")) {
						System.out.println("Butter Chicken				Rs 250");
						System.out.println("Fish Curry(seasonal)		Rs 200");
						System.out.println("Chicken Handi				Rs 350");
						System.out.println("Mutton Handi				Rs 400");
						System.out.println("Mutton Mughlai				Rs 250");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Butter Chicken");
							n[t] = 250;
							break;
						case '2':
							m[t] = ("Fish Curry");
							n[t] = 200;
							break;
						case '3':
							m[t] = ("Chicken Handi");
							n[t] = 350;
							break;
						case '4':
							m[t] = ("Mutton Handi");
							n[t] = 400;
							break;
						case '5':
							m[t] = ("Mutton Mughlai");
							n[t] = 250;
							break;
						}
					}
				}
				if (b1.equalsIgnoreCase("ch")) {
					System.out
							.println("Enter 'n' for noodles,'f' for fried rice,'a' for appetizers");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("n")) {
						System.out.println("1.Chicken Pan Fried NoodlesRs 215");
						System.out.println("2.Chicken Haka Noodles		Rs 170");
						System.out.println("3.Schezwan Chicken Noodles	Rs 250");
						System.out.println("4.Schezwan Egg Noodles     Rs 220");
						System.out.println("5.Chicken Delight			Rs 150");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Chicken Pan Fried Noodles");
							n[t] = 215;
							break;
						case '2':
							m[t] = ("Chicken Haka Noodles");
							n[t] = 170;
							break;
						case '3':
							m[t] = ("Schezwan Chicken Noodles");
							n[t] = 250;
							break;
						case '4':
							m[t] = ("Schezwan Egg Noodles");
							n[t] = 220;
							break;
						case '5':
							m[t] = ("Chicken Delight");
							n[t] = 150;
							break;
						}
					}
					if (c.equalsIgnoreCase("f")) {
						System.out.println("1.Chicken Fried Rice 	Rs 175");
						System.out.println("2.Prawn Fried Rice	Rs 220");
						System.out.println("3.Schezwan Chicken RiceRs 200");
						System.out.println("4.Schezwan Prawn Rice	Rs 250");
						System.out.println("5.Egg Fried Rice		Rs 150");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Chicken Fried Rice");
							n[t] = 175;
							break;
						case '2':
							m[t] = ("Prawn Fried Rice");
							n[t] = 220;
							break;
						case '3':
							m[t] = ("Schezwan Chicken Rice");
							n[t] = 200;
							break;
						case '4':
							m[t] = ("Schezwan Prawn Rice");
							n[t] = 250;
							break;
						case '5':
							m[t] = ("Egg Fried Rice");
							n[t] = 150;
							break;
						}
					}
					if (c.equalsIgnoreCase("a")) {
						System.out.println("1.Chicken 65				Rs 150");
						System.out.println("2.Chicken Spring Roll		Rs 120");
						System.out.println("3.Chicken Manchurian		Rs 150");
						System.out.println("4.Chicken lollipop			Rs 175");
						System.out.println("5.Chilli chicken			Rs 150");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Chicken 65");
							n[t] = 100;
							break;
						case '2':
							m[t] = ("Chicken Spring Roll");
							n[t] = 120;
							break;
						case '3':
							m[t] = ("Chicken Manchurian");
							n[t] = 150;
							break;
						case '4':
							m[t] = ("Chicken lollipop");
							n[t] = 175;
							break;
						case '5':
							m[t] = ("Chilli Chicken");
							n[t] = 150;
							break;
						}
					}
				}
				if (b1.equalsIgnoreCase("co")) {
					System.out
							.println("Enter 'sa' for sandwiches and 'pi' for pizza");
					String c = (br.readLine());
					if (c.equalsIgnoreCase("sa")) {
						System.out.println("1.Chicken Burger			Rs 40");
						System.out.println("2.Hot Dog					Rs 60");
						System.out.println("3.Hamburger				Rs 40");
						System.out.println("4.Egg 'n' Cheese Sandwich	Rs 20");
						System.out.println("5.Chicken Grill Sandwich	Rs 60");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("Chicken Burger");
							n[t] = 40;
							break;
						case '2':
							m[t] = ("Hot Dog");
							n[t] = 60;
							break;
						case '3':
							m[t] = ("Hamburger");
							n[t] = 40;
							break;
						case '4':
							m[t] = ("Egg 'n' Cheese Sandwich");
							n[t] = 20;
							break;
						case '5':
							m[t] = ("Chicken Grill Sandwich");
							n[t] = 60;
							break;
						}
					}

					if (c.equalsIgnoreCase("pi")) {
						System.out.println("1.BBQ Chicken Pizza		Rs 200");
						System.out.println("2.Non Veg Extravaganza		Rs 450");
						System.out.println("3.Cheese 'n' Pepperoni		Rs 200");
						System.out.println("4.Meatzaa					Rs 400");
						System.out.println("5.Spicy Chicken Pizza		Rs 200");
						char d = (char) (br.read());
						switch (d) {
						case '1':
							m[t] = ("BBQ Chicken Pizza");
							n[t] = 200;
							break;
						case '2':
							m[t] = ("Non Veg Extravaganz");
							n[t] = 450;
							break;
						case '3':
							m[t] = ("Cheese 'n' Pepperoni");
							n[t] = 200;
							break;
						case '4':
							m[t] = ("Meatzaa");
							n[t] = 400;
							break;
						case '5':
							m[t] = ("Spicy Chicken Pizza");
							n[t] = 200;
							break;
						}
					}
				}
			}
			t++;
			System.out.println("Do you want to continue(y/n)");
			x = br.readLine();
		} while (x.equalsIgnoreCase("y"));
		System.out.println("Sr No \t Name \t cost");
		for (int i = 0; i < t; i++) {
			sum = n[i] + sum;
			if (m[i] != "")
				System.out.println((i + 1) + "\t" + m[i] + "\t" + n[i]);
		}
		System.out.println("\t  Total=" + sum);
	}
}
