package com.socket;

public class HEHE {
	
	
	private class Client{
		
		
	}
	
	
	
	public static void main(String[] args) {
		Class<?> clazz = HEHE.class;
		Class<?>[] cls = clazz.getDeclaredClasses();
		
		
		for (Class<?> class1 : cls) {
			System.out.println(class1.getName());
		}
		
		
		
	}

}
