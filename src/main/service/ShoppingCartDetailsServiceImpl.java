package main.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Product;
import main.model.ShoppingCartDetails;
import main.model.Tour;
import main.model.User;
import main.repository.ProductRepository;
import main.repository.ShoppingCartDetailsRepository;

@Service
@Transactional
public class ShoppingCartDetailsServiceImpl implements ShoppingCartDetailsService {

	
	@Autowired
	private ShoppingCartDetailsRepository shoppingCartDetailsRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<ShoppingCartDetails> getAll() {
		return shoppingCartDetailsRepository.findAll();
	}

	@Override
	public ShoppingCartDetails getById(long id) {
		return shoppingCartDetailsRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(ShoppingCartDetails shoppingCartDetails) {
		shoppingCartDetailsRepository.save(shoppingCartDetails);
	}

	@Override
	public void delete(long id) {
		shoppingCartDetailsRepository.deleteById(id);		
	}

	@Override
	public void addProduct(long id) {
		Product product = productRepository.getOne(id);
		ShoppingCartDetails shoppingCartDetails = getById(id);
		if (product != null) {
			shoppingCartDetails.setProduct(product);
			saveOrUpdate(shoppingCartDetails);
		}
	}

}
