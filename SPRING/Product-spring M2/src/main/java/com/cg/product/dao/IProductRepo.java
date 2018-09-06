package com.cg.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.product.bean.Product;

/**
 * Inteface: IProductRepo
 * @author gudivya
 * Date of Creation:08/08/2018
 */
@Repository
public interface IProductRepo extends JpaRepository<Product, String>{

}
