package in.ineuron.test;

import java.util.Date;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJava {
	public static void main(String[] args) {
		System.out.println("Creating an object of dependent class using zero param constructor");
		Date date = new Date();
		
		System.out.println("Creating an object of target class using one param constructor");
		WishMessageGenerator wishMessageGenerator = new WishMessageGenerator(date);
		
		String message = wishMessageGenerator.generateMessage("Harsh");
		System.out.println(message);
		
		
	}
}	
