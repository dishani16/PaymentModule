package com.cg.main.exception;

@SuppressWarnings("serial")
public class PaymentNotFoundException extends RuntimeException {
	public PaymentNotFoundException() {

	}
    //customized exception
	public PaymentNotFoundException(String message) {
		super(message);
	}
}
