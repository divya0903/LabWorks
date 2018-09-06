package com.cg.product.service;

import java.util.List;

import com.cg.product.bean.Product;
import com.cg.product.exception.ProductException;


/**
 * Interface: IProductService
 * @author gudivya
 * Date of creation: 08/08/2018
 */
public interface IProductService {

	public Product createProduct(Product product) throws ProductException;
	
	public Product updateProduct(Product product) throws ProductException;
	
	public String deleteProduct(String id) throws ProductException;
	
	public Product getProduct(String id) throws ProductException;
	
	public List<Product> getAllProducts() throws ProductException;
}
