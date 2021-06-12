package com.cg.trg.pl;

public class TypecastDemo {

	public static void main(String[] args) {
		//implicit typecast
		float fVar= 20;
		System.out.println(fVar);
		//by default, real values are double type
		//explicit typecast
//		float fVar1= (float) 3.18;
		float fVar1= 3.18f;
		System.out.println(fVar1);
		
		double dVar= 124.8088;
		//explicit typecast
		float fVar2= (float) dVar;
		System.out.println(fVar2);

	}

}
