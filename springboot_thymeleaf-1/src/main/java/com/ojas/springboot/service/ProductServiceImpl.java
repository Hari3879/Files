package com.ojas.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.entity.ProductEntity;
import com.ojas.springboot.model.Product;
import com.ojas.springboot.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public boolean saveProduct(Product product) {
		ProductEntity prod = new ProductEntity();
//prod.setpName(product.getpName());
//prod.setPrice(product.getPrice());
//prod.setQty(product.getQty());

		BeanUtils.copyProperties(product, prod);
		ProductEntity productEntity = repo.save(prod);
		boolean flag = false;
		if (productEntity != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<Product> getAllProducts() {
		List<ProductEntity> findproduct = repo.findAll();
		List<Product> addproduct = new ArrayList<>();
		for (ProductEntity pe : findproduct) {
			Product p = new Product();
			/*
			 * p.setpId(pe.getpId()); p.setpName(pe.getpName()); p.setQty(pe.getQty());
			 * p.setPrice(pe.getPrice());
			 */
			BeanUtils.copyProperties(pe, p);
			addproduct.add(p);
		}

		return addproduct;
	}

	@Override
	public Product getProductById(int pid) {
		Optional<ProductEntity> findById = repo.findById(pid);
		ProductEntity productentity = findById.get();
		Product product = new Product();
		BeanUtils.copyProperties(productentity, product);
		return product;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int pid) {
		Optional<ProductEntity> findById = repo.findById(pid);
		ProductEntity productentity = findById.get();
		boolean flag = false;
		if (productentity != null)
			repo.deleteById(pid);
		flag = true;
		return flag;
	}

}
