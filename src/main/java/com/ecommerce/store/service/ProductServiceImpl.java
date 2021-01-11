package com.ecommerce.store.service;

import com.ecommerce.store.dao.ProductRepository;
import com.ecommerce.store.entity.Product;
import com.ecommerce.store.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepo;

    public ProductServiceImpl(ProductRepository product){
        productRepo = product;
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getProduct(int id) {
        //optional object whihc may or may not contain a non-null value
        Optional<Product> prodTemp = productRepo.findById(id);
        if(!prodTemp.isPresent()){
            throw new ProductNotFoundException("No Product Found with this ID");
        }
        return prodTemp.get();


//        Product product = null;

//        if(prodTemp.isPresent()){
//            product = prodTemp.get();
//            return prodTemp.get();
//        }else{
//            throw new RuntimeException("No Product Found with the id");
//        }
//        System.out.println(product.getPrice());
//        return product;
    }

    @Override
    public void addProduct(Product prod) {
        productRepo.save(prod);
    }

    @Override
    public void removeProduct(int id) {
        productRepo.deleteById(id);
    }
}
