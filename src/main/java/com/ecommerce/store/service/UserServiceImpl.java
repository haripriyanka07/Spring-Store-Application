package com.ecommerce.store.service;

import com.ecommerce.store.dao.UserRepository;
import com.ecommerce.store.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userrepo;

    public UserServiceImpl(UserRepository repo){
        userrepo = repo;
    }

    @Override
    public int getUserId(String username) {

        User usr = userrepo.findByUserName(username);
        return usr.getId();
    }
}
