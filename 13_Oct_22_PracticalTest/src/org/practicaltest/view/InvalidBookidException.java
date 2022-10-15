package org.practicaltest.view;

public class InvalidBookidException extends Exception{
	public InvalidBookidException(String s) {
		System.out.println(s);
	}
}
