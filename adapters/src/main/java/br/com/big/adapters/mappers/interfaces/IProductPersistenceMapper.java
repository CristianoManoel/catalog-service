package br.com.big.adapters.mappers.interfaces;

import br.com.big.Core.entities.Product;
import br.com.big.adapters.database.repositories.entities.ProductPersistence;

public interface IProductPersistenceMapper {
	ProductPersistence Map(Product product);
}
