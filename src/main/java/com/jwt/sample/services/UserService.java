package com.jwt.sample.services;

import com.jwt.sample.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Amin Denizer", "a.m.denizer@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Amin Grimm", "a.m.d.enizer@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Amin Zare", "amdenizer@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}