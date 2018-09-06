package com.cg.product.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.product.bean.Product;
import com.cg.product.exception.ProductException;
import com.cg.product.service.IProductService;

/**
 * Class: ProductController
 * Number of Methods: 5
 * 1. createProduct
 * 2. updateProduct
 * 3. deleteProduct
 * 4. getProduct
 * 5. viewProducts
 * @author gudivya
 * date of creation:08/08/2018
 */

@RestController
public class ProductController {

	@Autowired
	private IProductService service;
	
	/**
	 * 
	 * @param Product object
	 * @return product 
	 * @throws ProductException
	 */
	
	@RequestMapping(method=RequestMethod.GET,value= {"/sayHello"},produces= {"application/text"})
	public ResponseEntity<String> getHelloMessage()
	{
		return new ResponseEntity<String>("Hello World from RestFullWebService",HttpStatus.OK);
	}
	@RequestMapping(value="/createProduct",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) throws ProductException
	{
		try {
			service.createProduct(product);
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
		return product;
	}
	
	@RequestMapping(value="/acceptProduct",method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Product> acceptProduct(@ModelAttribute Product product) throws ProductException 
	{
		
		return new ResponseEntity<Product>(service.createProduct(product),HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * @param Product object
	 * @return Product
	 * @throws ProductException
	 */
	@RequestMapping(value="/updateProduct",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) throws ProductException
	{
		try {
			service.updateProduct(product);
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
		return product;
	}
	
	/**
	 * 
	 * @param id
	 * @return id 
	 * @throws ProductException
	 */
	@RequestMapping(value="/deleteProduct",method=RequestMethod.DELETE)
	public String deleteProduct(String id) throws ProductException
	{
		try {
			return service.deleteProduct(id)+" deleted successfully";
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @return list of Product
	 * @throws ProductException
	 */
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> viewProducts() throws ProductException
	{
		try {
			return service.getAllProducts();
		} catch (ProductException e) {
		
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/allProducts",method=RequestMethod.GET,
			produces= {"application/JSON"})
	public ResponseEntity<List<Product>> AllProducts() throws ProductException
	{
		return new ResponseEntity<List<Product>>(service.getAllProducts(),HttpStatus.OK);
		
	}
	
	/**
	 * 
	 * @param id
	 * @return Product
	 * @throws ProductException
	 */
	@RequestMapping(value="/getProduct",method=RequestMethod.GET)
	public Product getProduct(String id) throws ProductException
	{
		try {
			return service.getProduct(id);
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET,
			produces= {"application/JSON"})
	public ResponseEntity<Product> product(@PathParam(value="id")String id) throws ProductException 
	{
		
		return new ResponseEntity<Product>(service.getProduct(id),HttpStatus.OK);
	}
}
