package main.service;

import java.math.BigDecimal;
import java.util.List;

import main.model.ShoppingCartDetails;

public interface ShoppingCartDetailsService {
	
	public List<ShoppingCartDetails> getAll();

	public ShoppingCartDetails getById(long id);

	public void saveOrUpdate(ShoppingCartDetails shoppingCartDetails);

	public void delete(long id);
	
	public void addProduct(long id);

}
