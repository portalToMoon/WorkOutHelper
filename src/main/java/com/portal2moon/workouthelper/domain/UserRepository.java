package com.portal2moon.workouthelper.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
//    Optional<User> findByAlias(String alias);
}
