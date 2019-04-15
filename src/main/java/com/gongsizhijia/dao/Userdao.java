package com.gongsizhijia.dao;

import com.gongsizhijia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<User, Integer> {
    User getByUsernameAndPassword(String username, String password);
}
