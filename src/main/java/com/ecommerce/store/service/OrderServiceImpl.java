package com.ecommerce.store.service;

import com.ecommerce.store.dao.OrderRepository;
import com.ecommerce.store.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepo;

    public OrderServiceImpl(OrderRepository ordrepo){
        orderRepo = ordrepo;
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public List<Order> findByUserId(int id){
        return orderRepo.findByUserId(id);
    }

    @Override
    public void addOrder(Order order) {
        orderRepo.save(order);
    }
}
