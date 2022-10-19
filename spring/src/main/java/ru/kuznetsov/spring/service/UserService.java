package ru.kuznetsov.spring.service;

import ru.kuznetsov.spring.model.User;


import java.util.List;

public interface UserService {
    List<User> showAll();

    User show(int id);

    void save(User user);

    void update(User updatedUser);

    void delete(int id);
}
