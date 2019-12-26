package com.san.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.san.model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	//@Query("select u from User u order by u.id desc limit 1")
	@Query("from User order by id desc")
	ArrayList<User> lastRecard();
}
