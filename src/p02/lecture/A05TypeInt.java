package p02.lecture;

import org.omg.CORBA.INV_FLAG;

public class A05TypeInt {
	public static void main(String[] args) {
		// int : 4byte(32bit) 
		
		// 십진법 0  : 0000 0000 0000 0000 0000 0000 0000 0000
		//        1  : 0000 0000 0000 0000 0000 0000 0000 0001
		//        2  : 0000 0000 0000 0000 0000 0000 0000 0010
		//           : 
		// 2147483647: 0111 1111 1111 1111 1111 1111 1111 1111
		//-2147483648: 1000 0000 0000 0000 0000 0000 0000 0000
		//         -1: 1111 1111 1111 1111 1111 1111 1111 1111
		//          0: 0000 0000 0000 0000 0000 0000 0000 0000
		
		int intVar;
		intVar = 0;
		intVar = 2147483647;
//		intVar = 2147483648; // not ok
		intVar = -2147483648;
//		intVar = -2147483649; // not ok
		
		// 16진법 :    0 ~ F    
		//  2진법 : 0000 ~ 1111
		// 10진법 :    0 ~ 15   
		
		// css color : rgb(255, 255, 255)
		//             #FFFFFF
		
		intVar = 255;
		System.out.println(intVar);
		intVar = 0xFF;
		System.out.println(intVar);
		intVar = 0377;
		System.out.println(intVar);
	}
}







