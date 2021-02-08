package com.cg.main.controller;

import java.util.List;
/**
 * 
 * @author Dishani
 *create controller class for Payment management
 */

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.main.exception.PaymentNotFoundException;
import com.cg.main.model.Payment;
import com.cg.main.service.IPaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value = "controller", description = "handler methods related to Payment module")
@RestController
@RequestMapping("/api")
public class MyController {
	@Autowired
	IPaymentService service;
    //method add payment through upi mode
	@ApiOperation(value = "click here to proceed with UPI payment")
	@PostMapping("/add_UPI_Payment")
	public Payment addUPIPayment(@Valid @RequestBody Payment payment) {
		return service.addUPIPayment(payment);
	}
	//method to add payment through card
	@ApiOperation(value = "click here to proceed with CARD payment")
	@PostMapping("/add_Card_Payment")
	public Payment addCardPayment(@Valid @RequestBody Payment payment) {
		return service.addCardPayment(payment);
	}
	//method to get payment status by ID
	@ApiOperation(value = "click here to get Payment status with specific ID")
	@GetMapping("/getPaymentStatus/{id}")
	public ResponseEntity<Object> getPaymentStatus(@PathVariable("id") int id) {
		Object payment = service.getPaymentStatusById(id);
		if (payment == null) {
			throw new PaymentNotFoundException("No payment done with the given id: " + id);
		}
		return new ResponseEntity<>(payment, HttpStatus.OK);
	}
	//method to get all payment status
	@ApiOperation(value = "click here to get all Payment status")
	@GetMapping("/getAllPaymentStatus")
	public ResponseEntity<List<Object[]>> getAllPaymentStatus(){
		List<Object[]> paymentInfo = service.getAllPaymentStatus();
		return new ResponseEntity<>(paymentInfo, HttpStatus.OK);
	}
}