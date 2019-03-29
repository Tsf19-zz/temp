package com.uipttrns.generic.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AlienRepoDao<T> extends CrudRepository<T, Integer> { }