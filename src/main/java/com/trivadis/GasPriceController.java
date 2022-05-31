package com.trivadis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GasPriceController {

	@GetMapping("/pricePerUnit")
	public double getCurrentPricePerUnit() {
		return Math.random() * 100;
	}
}
