package com.bibashdai.bibashdai.repository;

import com.bibashdai.bibashdai.exceptions.AuthException;
import com.bibashdai.bibashdai.models.User;

public interface UserRepository  {
    Integer create(String firstName, String lastName, String email, String password) throws AuthException;
    User findByEmailAndPassword(String email, String password) throws AuthException;
    Integer getCountByEmail(String email);
    User findBy(Integer userId);

}
