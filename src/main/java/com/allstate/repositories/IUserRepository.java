package com.allstate.repositories;

import com.allstate.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<Users, Integer> {
}
