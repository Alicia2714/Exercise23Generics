package com.Exercise23Generics.model;

public class Resta <K, V>{
	
	K key;
	V value;
	
	public Resta(){
		
	}
	
	public Resta(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	public void setKey() {
		this.key=key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue() {
		this.value=value;
	}
	
	public String ToString() {
		return "key: "+this.key+"Value: "+this.value;
	}
	

}
