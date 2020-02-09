package br.com.big.adapters.mappers.database.entities;

import br.com.big.Core.entities.Product;
import br.com.big.adapters.database.repositories.entities.ProductPersistence;
import br.com.big.adapters.mappers.interfaces.IProductPersistenceMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductPersistenceMapper implements IProductPersistenceMapper {
	@Override
	public ProductPersistence Map(Product product) {
		ProductPersistence productPersistence = ProductPersistence
				.builder()
				.id(product.getId())
				.code(product.getCode())
				.name(product.getName())
				.category(product.getCategory())
				.build();
		return productPersistence;
	}
}
