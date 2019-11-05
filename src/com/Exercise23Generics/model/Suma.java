package com.Exercise23Generics.model;

public class Suma <T>{
	T myObject;
	
	public Suma(T myObject) {
		this.myObject = myObject;
	}
	
	public T getMyObject(){
		return myObject;
	}
	
	public static <T extends Number, Y extends Number> T SumaNumeros(T object1, Y object2){
		Double result = 0.0;
		/*
		if(object1 instanceof Double && object2 instanceof Double) {
			objDouble1 = ((Double) object1).doubleValue();
			objDouble2 = ((Double) object2).doubleValue();
		}*/
		result = object1.doubleValue() + object2.doubleValue();
		
		return (T)result;
	}
	

}
