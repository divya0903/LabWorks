package com.cg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.bean.Product;
import com.cg.product.dao.IProductRepo;
import com.cg.product.exception.ProductException;


/**
 * Class: ProductServiceImpl
 * Number of methods: 6
 * 1. createProduct
 * 2. updateProduct
 * 3. deleteProduct
 * 4. getProduct
 * 5. getAllProducts
 * 6. validateProduct
 * @author gudivya
 * Date of creation: 08/08/2018
 */

@Service
public class ProductServiceImpl implements IProductService {

	
	@Autowired
	private IProductRepo repo;
	
	
	/**
	 *  Method: createProduct
	 *  Parameter: product
	 *  Return : Product
	 *  Throws : ProductException
	 */
	@Override
	public Product createProduct(Product product) throws ProductException{
		
		if(repo.findById(product.getId()).isPresent())
		{
			throw new ProductException(product.getId()+" Id already exist in the database");
		}
		if(validateProduct(product))
		{
		repo.save(product);
		}
		return product;
	}
	
	/**
	 *  Method: updateProduct
	 *  Parameter: product
	 *  Return : Product1
	 *  Throws : ProductException
	 */
	@Override
	public Product updateProduct(Product product) throws ProductException{
		
		Product product1=new Product();
		
		if(validateProduct(product))
		{
		product1=repo.getOne(product.getId());
		product1.setName(product.getName());
		product1.setModel(product.getModel());
		product1.setPrice(product.getPrice());
		product1.setDate(product.getDate());
	
		repo.save(product1);
		}
		return product1;
	}
	
	/**
	 *  Method: deleteProduct
	 *  Parameter: string id
	 *  Return : string id
	 *  Throws : ProductException
	 */
	@Override
	public String deleteProduct(String id) throws ProductException{
		
		if(id.isEmpty())
		{
			throw new ProductException("Id cannot be empty");
		}
		if(!(repo.findById(id).isPresent()))
		{
			throw new ProductException("Id does not exist in the product database");
		}
		
		repo.deleteById(id);
		return id;
	}
	
	/**
	 *  Method: getProduct
	 *  Parameter: string id
	 *  Return : Product
	 *  Throws : ProductException
	 */
	@Override
	public Product getProduct(String id) throws ProductException{
		
		if(id.isEmpty())
		{
			throw new ProductException("Id cannot be empty");
		}
		if(!(repo.findById(id).isPresent()))
		{
			throw new ProductException("Id does not exist in the product database");
		}
		
		return repo.getOne(id);
	}
	
	/**
	 *  Method : getAllProducts 
	 *  Return : list of Product
	 *  Throws : ProductException
	 */
	@Override
	public List<Product> getAllProducts() throws ProductException{
		
		return repo.findAll();
	}
	
	/**
	 *  Method: validateProduct
	 *  Parameter : product
	 *  Return : boolean
	 *  Throws :ProductException
	 */
	private boolean validateProduct(Product product) throws ProductException {
	
		if(product.getId().isEmpty())
		{
			throw new ProductException("Product id cannot be empty");
		}
		if(product.getName().isEmpty())
		{
			throw new ProductException("Product name cannot be empty");
		}
		if(product.getModel().isEmpty())
		{
			throw new ProductException("Model of the Product cannot be empty");
		}
		if(product.getPrice()<=0)
		{
			throw new ProductException("Price of the product cannot be zero or negative");
		}
		return true;
	}
}
