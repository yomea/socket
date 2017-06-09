package com.socdf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Client {

	private class ClientA {

		private void print() {
			System.out.println("ClientA ....");
		}

	}

	private class ClientB {

		private void echo() {
			System.out.println("ClientB ....");
		}

	}

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Client.class;
		Class<?>[] cls = clazz.getDeclaredClasses();
		
		for (Class<?> class1 : cls) {
			try {
				
				Constructor<?> c = class1.getDeclaredConstructor(Client.class);
				c.setAccessible(true);
				Object obj = c.newInstance(new Client());

				Method[] methods = class1.getDeclaredMethods();

				for (Method method : methods) {
					method.setAccessible(true);
					method.invoke(obj);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
