package br.com.big.Core.entities;

import br.com.big.Core.enums.ProductCategory;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product{
	private UUID id;
	private String code;
	private String name;
	private ProductCategory category;
}