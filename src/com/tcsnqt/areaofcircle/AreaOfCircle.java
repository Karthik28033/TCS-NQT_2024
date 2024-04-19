package com.tcsnqt.areaofcircle;
import java.util.*;

public class AreaOfCircle {

	public static double formula(int radius) {
		return Math.PI*radius*radius;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("ENTER DIAMETER OF CIRCLE: ");
		int diameter = sc.nextInt();

		int radius = diameter/2;

		double result = formula(radius);


		System.out.println("AREA OF CIRCLE IS: " + result);
	}

}
