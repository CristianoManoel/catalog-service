package br.com.big.adapters.database.repositories.entities;

import br.com.big.Core.enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductPersistence {
	private UUID id;
	private String code;
	private String name;
	private ProductCategory category;
}
