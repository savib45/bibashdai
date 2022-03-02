package com.bibashdai.bibashdai.repository;

import com.bibashdai.bibashdai.exceptions.BadRequestException;
import com.bibashdai.bibashdai.exceptions.ResourcesNotFoundException;
import com.bibashdai.bibashdai.models.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll(Integer userId) throws ResourcesNotFoundException;
    Blog findById(Integer userId,Integer postId) throws ResourcesNotFoundException;
    Integer create(Integer userId, String title, String comment) throws BadRequestException;
    void update(Integer userId, Integer postId ,Blog title,Blog comment) throws BadRequestException;
    void removeBy(Integer userId, Integer postId);
}
