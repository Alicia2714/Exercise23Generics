package com.Exercise23Generics.model;

public class Multi {
	
	public static <T> String ShowDataType(T object){
		
		return "Dyata type: "+object.getClass()+"\n Name of the parameter: "+object.getClass().getName()+"\n Value of the element: "+object;
	}
	
	

}
