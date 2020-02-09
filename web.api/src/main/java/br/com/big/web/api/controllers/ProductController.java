package br.com.big.web.api.controllers;

import br.com.big.Core.entities.Product;
import br.com.big.Core.interfaces.use.cases.ISaveProductUseCase;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "br.com.big")
@RestController
@RequestMapping("api/v1/product")
public class ProductController {

	private ISaveProductUseCase saveProductUseCase;

	ProductController(ISaveProductUseCase saveProductUseCase) {
		this.saveProductUseCase = saveProductUseCase;
	}

	@PostMapping
	public ResponseEntity save(@RequestBody Product product)
	{
		Product savedProduct = saveProductUseCase.Save(product);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add( "Location", "api/v1/product/"+savedProduct.getId().toString());
		return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
	}
}
