package Test;

import java.util.Scanner;

public class bai64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("so thu nhat : ");
	        int a = in.nextInt();  
			System.out.print("so thu hai: ");
			int b = in.nextInt(); 
			System.out.println("ketqua: "+result(a, b));
	    }
		public static int result(int x, int y)
	     {  
		if(x == y)
			return 0;
		    if(x % 6 == y % 6)
			    return (x < y) ? x : y;
		    return (x > y) ? x : y;
	}

}
