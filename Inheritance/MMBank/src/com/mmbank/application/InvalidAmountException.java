package com.mmbank.framework;

/**
 * InvalidAmountException is a class for handling exception which occurred because of an invalid amount
 * This class extends Exception class
 * @author sbhatt1
 *
 */
public class InvalidAmountException extends Exception {

	public InvalidAmountException(String message) {
		super(message);
	}

}
