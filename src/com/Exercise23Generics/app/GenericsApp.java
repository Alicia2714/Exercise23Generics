package com.Exercise23Generics.app;

import com.Exercise23Generics.model.Suma;
import com.Exercise23Generics.model.Resta;
import java.util.ArrayList;
import java.util.HashMap;
import com.Exercise23Generics.model.Multi;

public class GenericsApp {

	public static void main(String[] args) {
		
		Suma<Integer> myObject = new Suma<Integer>(5);
		Suma<String> myObjectString = new Suma<String>("Testo");
		Resta<Integer, Integer> myObjectresta = new Resta<Integer, Integer>(10, 20);
		Resta<Integer, Integer> myObjectresta2 = new Resta<Integer, Integer>(5, 15);
		
		System.out.println("Object of myObject: "+myObject.getMyObject());
		System.out.println("Object of myObjectString: " +myObjectString.getMyObject());
		
		System.out.println(Multi.ShowDataType(10));
		System.out.println(Multi.ShowDataType("El macho"));
		System.out.println(Multi.ShowDataType(10.02));
		
		System.out.println("The sum of 5.66 + 6.23 is: "+Suma.SumaNumeros(5.66, 7.23));
		

	}

}
