package com.sai.service;

import com.sai.exception.UserException;
import com.sai.model.User;

public interface UserService {
    
    public User findUserById(Long userId) throws UserException;

    public User findUserByProfileByJwt(String jwt) throws UserException;
}
