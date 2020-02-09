package br.com.big.adapters.database.repositories;

import br.com.big.Core.entities.Product;
import br.com.big.Core.interfaces.repositories.IProductRepository;
import br.com.big.adapters.database.repositories.entities.ProductPersistence;
import br.com.big.adapters.mappers.interfaces.IProductPersistenceMapper;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ProductRepository implements IProductRepository {

	private IProductPersistenceMapper productPersistenceMapper;

	public ProductRepository(IProductPersistenceMapper productPersistenceMapper) {
		this.productPersistenceMapper = productPersistenceMapper;
	}

	@Override
	public Product Save(Product product) {
		ProductPersistence productPersistence = productPersistenceMapper.Map(product);
		// Utilize some O.R.M. technology to persist data in the database.
		productPersistence.setId(UUID.randomUUID());
		// Setting the database ID.
		product.setId(productPersistence.getId());
		return product;
	}
}
