package com.ly.repository;

import org.springframework.stereotype.Component;

import com.ly.entity.User;

@Component
public interface IUserRepository {

	User findUserByName(String name);
}
