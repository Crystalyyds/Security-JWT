package com.github.sgblug.app.service;

/**
 * @author 20312
 * @author 2022/8/24 20:00
 */
import com.github.sgblug.app.model.entity.User;

public interface AuthService {

    String login( String username, String password );

}