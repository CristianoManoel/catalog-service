package br.com.big.Core.interfaces.repositories;

import br.com.big.Core.entities.Product;
import org.springframework.stereotype.Service;

public interface IProductRepository {
	Product Save(Product product);
}
