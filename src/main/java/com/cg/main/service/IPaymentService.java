package com.cg.main.service;

import java.util.List;


import javax.validation.Valid;

import com.cg.main.model.Payment;

public interface IPaymentService{
	Payment addUPIPayment(@Valid Payment payment);
	Payment addCardPayment(@Valid Payment payment);
	List<Object[]> getAllPaymentStatus();
	Object getPaymentStatusById(int id);

}
