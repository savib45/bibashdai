package com.bibashdai.bibashdai.controller;

import com.bibashdai.bibashdai.exceptions.BadRequestException;
import com.bibashdai.bibashdai.exceptions.ResourcesNotFoundException;
import com.bibashdai.bibashdai.models.Blog;
import com.bibashdai.bibashdai.repository.BlogRepository;

import java.util.List;

public class BlogRepositoryImpl implements BlogRepository {

    @Override
    public List<Blog> findAll(Integer userId) throws ResourcesNotFoundException {
        return null;
    }

    @Override
    public Blog findById(Integer userId, Integer postId) throws ResourcesNotFoundException {
        return null;
    }

    @Override
    public Integer create(Integer userId, String title, String comment) throws BadRequestException {
        return null;
    }

    @Override
    public void update(Integer userId, Integer postId, Blog title, Blog comment) throws BadRequestException {

    }

    @Override
    public void removeBy(Integer userId, Integer postId) {

    }
}
