package com;

class TestClass {
	static int i = 0;
	int j = 0;
	public TestClass(){
		i = i + 1;
		j = j + 1;
	}
	static int tt(){
		int i =0;
		return i;
	}
	public void test(){
		for(;;){
			if( i == 1)
				i = i +1;
			
		}
	}
	
	public static void main(String[] args) {
		/*String a = "but the butter was bitter";
		String b ="so she added a bit of butter";
		String c = "to make bitter butter better";
		int i = 0;	
		while(!a.substring(i,i+1).equals(b.substring(i,i+1))){
			System.out.println(c.indexOf(c.substring(i,i+1)));
			i++;
		}*/
		int x = 20, y = 10,z;
		z = ++x + x++ * y++ - x%y;
		// ++x + 20 * 10 -x%y
		//22 + 200
		System.out.println(z);
	}
	
	
}
