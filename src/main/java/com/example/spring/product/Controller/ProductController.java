package com.example.spring.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.product.Entity.ProductEntity;
import com.example.spring.product.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;
	@GetMapping("/products")
	public List<ProductEntity> getAll()
	{
		return productservice.getAll();
	}
	@GetMapping("/product/{id}")
	public ProductEntity getById(@PathVariable int id)
	{
		return productservice.getById(id);
	}
	@PostMapping("addproducts")
	public ProductEntity addProducts(@RequestBody ProductEntity product)
	{
		return productservice.save(product);
	}
	@PostMapping("/addProducts")
	public List<ProductEntity> addProducts(List<ProductEntity> product)
	{
		return productservice.saveProducts(product);
	}
	@DeleteMapping("/removeProduct/{id}")
	public String removeProduct(@PathVariable int id)
	{
		productservice.deleteById(id);
		return "product deleted";
	}
	@DeleteMapping("/removeAllProducts")
	public String removeAllProducts()
	{
		return productservice.deleteAll();
	}
	@GetMapping("/home")
	public String home()
	{
		return "hii sweta";
	}
	

}
