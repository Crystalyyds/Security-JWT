package com.github.sgblug.app.repository;

import com.github.sgblug.app.model.entity.Blog;
import com.github.sgblug.app.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

/**
 * @author 20312
 * @author 2022/8/24 10:12
 */
@SpringBootTest
public class UserRepositoryTest {
    @Inject
    private UserRepository userRepository;
    @Test
    void testAdd(){
        User user = new User();
        user.setUsername("葛某人");
        user.setPassword("ylswbb");
        userRepository.save(user);
    }
}