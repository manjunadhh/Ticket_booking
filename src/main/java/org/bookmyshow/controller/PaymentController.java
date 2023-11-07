package org.bookmyshow.controller;

import org.bookmyshow.model.Payment;
import org.bookmyshow.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movieticketbooking/paymentservice")
public class PaymentController {
	@Autowired
	public PaymentService paymentService;

	@PostMapping("/add")
	public Payment addPayment(@RequestBody Payment payment) {
		return paymentService.addPayment(payment);
	}

	@GetMapping("/payment_id")
	public int getId(@RequestParam int id) {

		return paymentService.getId(id);

	}

}
