package br.com.big.application.use.cases;

import br.com.big.Core.entities.Product;
import br.com.big.Core.interfaces.repositories.IProductRepository;
import br.com.big.Core.interfaces.use.cases.ISaveProductUseCase;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication(scanBasePackages = "br.com.big")
@Service
public class SaveProductUseCase implements ISaveProductUseCase {

	private IProductRepository productRepository;

	public SaveProductUseCase(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product Save(Product product) {
		Product savedProduct = productRepository.Save(product);
		return savedProduct;
	}
}
