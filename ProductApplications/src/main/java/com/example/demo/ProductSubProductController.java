package com.example.demo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductSubProductController {

	@Autowired
	MainProductRepo mainrepo;

	@Autowired
	SubProductRepo subrepo;

	@PostMapping("/Mainproducts")
	public ResponseEntity<Object> createMainProduct(@RequestBody MainProduct service1) {
		service1.setId(1001);
		service1.setName("Yamaha");
		service1.setCost(11500.23);
		service1.setFromDate((LocalDate.of(2019, 02, 21)));
		service1.setThruDate((LocalDate.of(2020, 10, 25)));
		mainrepo.save(service1);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@PostMapping("/Subproducts")
	public ResponseEntity<Object> createSubProduct(@RequestBody SubProduct service2) {
		service2.setId(100);
		service2.setProductName("Yamaha");
		service2.setSubProductName("Fz-V3");
		service2.setSubProductCost(11500.23);
		service2.setSubProductFromDate((LocalDate.of(2019, 02, 21)));
		service2.setSubProductThruDate((LocalDate.of(2020, 10, 25)));
		service2.setId(200);
		service2.setProductName("Yamaha");
		service2.setSubProductName("Fz-V2");
		service2.setSubProductCost(10000.23);
		service2.setSubProductFromDate((LocalDate.of(2019, 02, 21)));
		service2.setSubProductThruDate((LocalDate.of(2020, 10, 25)));
		subrepo.save(service2);
		return new ResponseEntity<>("SubProduct is created successfully", HttpStatus.CREATED);
	}

	@GetMapping("/Subproductdetails")
	public ResponseEntity<Object> getSubProducts(@RequestBody SubProduct product2) {

		Optional<String> productName = Optional.of(product2.getProductName());
		if (productName.isPresent())
			return new ResponseEntity<>(subrepo.findByProductName(productName), HttpStatus.CREATED);
		return new ResponseEntity<>("Product Not Found", HttpStatus.CREATED);
	}

	@GetMapping("/Product/{Quan}")
	public void getSubProducDetails(@RequestBody SubProduct subProduct, @PathVariable("Quan") int Quant) {
		Optional<String> pName =Optional.of(subProduct.getProductName());
		/*
		 * for (int i = 0; i < subrepo.findByProductName(pName).size(); i++) { String pn
		 * = subrepo.findByProductName(pName).get(i).getSubName(); Double d =
		 * subrepo.findByProductName(pName).get(i).getSubCost() * Quant; }
		 */

	}

}
