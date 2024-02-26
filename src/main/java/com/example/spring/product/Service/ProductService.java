package com.example.spring.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.product.Entity.ProductEntity;
import com.example.spring.product.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductEntity> getAll()
	{
		return productRepository.findAll();
	}
	
	public ProductEntity getById(int id)
	{
		return productRepository.findById(id).orElse(null);
	}
	
	public List<ProductEntity> saveProducts(List<ProductEntity> product)
	{
		return productRepository.saveAll(product);
	}

	public ProductEntity save(ProductEntity product) {
		
		return productRepository.save(product) ;
	}
	public String deleteById(int id)
	{
		productRepository.deleteById(id);
		return "record deleted";
	}
	public String deleteAll()
	{
		productRepository.deleteAll();
		return "record deleted";
	}

	
}
