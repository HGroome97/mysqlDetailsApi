package com.qa.repository.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.repository.domain.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

}
