package com.test;
import com.*;
class ArrayReferenceThrow extends RuntimeException { }
class IndexThrow extends RuntimeException { }
class RightHandSideThrow extends RuntimeException { }
class IllustrateCompoundArrayAssignment {
        static String[] strings = { "Simon", "Garfunkel" };
        static double[] doubles = { Math.E, Math.PI };
        static String[] stringsThrow() {
                throw new ArrayReferenceThrow();
        }
        static double[] doublesThrow() {
                throw new ArrayReferenceThrow();
        }
        static int indexThrow() { throw new IndexThrow(); }
        static String stringThrow() {
                throw new RightHandSideThrow();
        }
        static double doubleThrow() {
                throw new RightHandSideThrow();
        }
        static String name(Object q) {
                String sq = q.getClass().getName();
                int k = sq.lastIndexOf('.');
                return (k < 0) ? sq : sq.substring(k+1);
        }
        static void testEight(String[] x, double[] z, int j) {
                String sx = (x == null) ? "null" : "Strings";
                String sz = (z == null) ? "null" : "doubles";
                System.out.println();
                try {
                        System.out.print(sx + "[throw]+=throw => ");
                        x[indexThrow()] += stringThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sz + "[throw]+=throw => ");
                        z[indexThrow()] += doubleThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sx + "[throw]+=\"heh\" => ");
                        x[indexThrow()] += "heh";
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sz + "[throw]+=12345 => ");
                        z[indexThrow()] += 12345;
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sx + "[" + j + "]+=throw => ");
                        x[j] += stringThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sz + "[" + j + "]+=throw => ");
                        z[j] += doubleThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sx + "[" + j + "]+=\"heh\" => ");
                        x[j] += "heh";
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print(sz + "[" + j + "]+=12345 => ");
                        z[j] += 12345;
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
        }
        public static void main(String[] args) {
                try {
                        System.out.print("throw[throw]+=throw => ");
                        stringsThrow()[indexThrow()] += stringThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[throw]+=throw => ");
                        doublesThrow()[indexThrow()] += doubleThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[throw]+=\"heh\" => ");
                        stringsThrow()[indexThrow()] += "heh";
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[throw]+=12345 => ");
                        doublesThrow()[indexThrow()] += 12345;
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[1]+=throw => ");
                        stringsThrow()[1] += stringThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[1]+=throw => ");
                        doublesThrow()[1] += doubleThrow();
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[1]+=\"heh\" => ");
                        stringsThrow()[1] += "heh";
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                try {
                        System.out.print("throw[1]+=12345 => ");
                        doublesThrow()[1] += 12345;
                        System.out.println("Okay!");
                } catch (Throwable e) { System.out.println(name(e)); }
                testEight(null, null, 1);
                testEight(null, null, 9);
                testEight(strings, doubles, 1);
                testEight(strings, doubles, 9);
        }
}
public class Test {
	int i;
	char c;
	float f;
	boolean b;
	public static void main(String[] args) {
		//System.out.println(fact1(4));
		///reverse("DAD", "");
		//test();
		//test1();
		//test2();
		//System.out.println(sumrecursive(5555));
		//System.out.println(reverse("af"));
		//System.out.println(mulrecursive(5555));
		//System.out.println(mulrecursivewithoutmulop(5,5));
		//float f = 1f/1 + 1f/1 + 1f/2 + 1f/6 + 1f/24;
		//System.out.println(f);
		//System.out.println(computeeseries(5));
		//int i = 1,b;
		//b = (i>10) ? i== 5 ? i<10? 33: 56 :7 : i<5 ? 3 : 5;
		//System.out.println(b);
		//i = i++ * i++;
		//i =   2 * 8 / 16  - 8 + 9;
		//i = 64/16 - 8 + 9 // 32 * 8 - 8 + 9
		//i = 4 - 8 + 9 // 256 - 8 + 9
		//i = 4 - 17  // 248 + 9
		//i = -13  // 257
		/*boolean p  = true && false;
		float f = 0;
		double d = 0;
		char c = ' ';
		i = (int) f;
		d = f;
		System.out.println(p);*/
	/*	int a = 9;
        a += (a = 3);                                                                   // first example
        System.out.println(a);
        int b = 9;
        b = b + (b = 3);                                                                        // second example
        System.out.println(b);
        String[] s = new String[]{"a","b"};
        s[-1] = s[0] += s[0];
        System.out.println(s[0]);*/
		/*int k = 1;
		k = (k + (k = 4)); 
		System.out.println( k);*/
		int a = 6,b=4,c=36;
		double bb = 0;
		float ff = 0.7f;
		//System.out.println(rtrue() && rfalse());
		//System.out.println((rfalse()) || (rtrue()));
		System.out.println(rtrue() || rfalse());
		if(a < 0.7){
			
		}
		Test t = new Test();
		System.out.println(t.i);
		System.out.println(t.c);
		System.out.println(t.f);
		System.out.println(t.b);
	}
	
	static boolean rtrue(){
		System.out.println("in rtrue");
		return true;
	}
	static boolean rfalse(){
		System.out.println("in rfalse");
		return false;
	}
	
	public static int fact(int n){
		if(n == 1 || n == 0){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}
	
	public static int fact1(int n){
		int fact = 1;
		while (n > 1){
			fact = fact * n--;
		}
		
		return fact;
	}
	
	
	public static void reverse(String s,String reverse){
		if(s.length() == 0){
			System.out.println(reverse);
			return;
		}else{
			reverse = reverse + s.charAt(s.length() -1) ;
			reverse(s.substring(0,s.length() -1),reverse);
		}
	}
	
	public static String reverse(String s){
		if(s.length() == 0){
			return s;
		}else{
			return s.charAt(s.length() -1) + reverse(s.substring(0,s.length() -1));
		}
	}
	
	public static void test(){
		int i = 0;
		while((i++)<=0)
		{
			i++;
			System.out.print(i + " ");
		}
		System.out.print(i);
	}
	
	public static void test1(){
			int a = 5, b, c;
			b = a++ + ++a + a++;
			System.out.println(a);
			c = ++a + a++ + a--;
			System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
	
	public static void test2(){
		int x = 2, y = 3;
			x = ++x * ++x;
			//x = 12
			y = ++y * ++y;
			//y = 20
			x = x++ * y++;
			//x = 240
			y = y++ * x++;
			//y = 5040
		System.out.println("x = " + x + " y = " + y);
		//x=241 y= 5040
	}
	/*#define CUBE(a) a * a * a
		void main()
		{
			int a;
			a = CUBE(5-3);
			//a = 5 - 3 * 5 -3 * 5 -3
			//a = 5 - 15 - 3 * 5 -3
			//a = 5 - 15 - 15 - 3
			//a = -28   
			printf(“\n value of a = %d”, a);
			
		}
	*/
	
	public static int sumrecursive(int num){
		//112
		if(num / 10 == 0){
			return num;
		}else{
			return  (num % 10) + sumrecursive(num / 10);
		}
	}
	
	public static int mulrecursive(int num){
		//112
		if(num / 10 == 0){
			return num;
		}else{
			return  (num % 10) * mulrecursive(num / 10);
		}
	}
	
	public static int mulrecursivewithoutmulop(int num,int anum){
		//112
		if(anum == 0){
			return 0;
		}else{
			return  num + mulrecursivewithoutmulop(num,--anum);
		}
	}
	
	public static float computeeseries(int numberofterms){
		//e = 1/0! + 1/1! + 1/2! + 1/3!...
		// e = 1/0 + 1/1 + 1/2*1 + 1/3*2*1 
		//e = 1+1+0.5+0.33+
		if(numberofterms == 0){
			return 0.0f;
		}else{
			return 1f/fact(numberofterms-1) + computeeseries(numberofterms - 1); 
		}
	}
	
		
}
	


