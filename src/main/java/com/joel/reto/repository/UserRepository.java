package com.joel.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.joel.reto.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value="SELECT * FROM user WHERE name = :name" ,nativeQuery = true)
	User findUserByName(@Param("name")String name);
}
