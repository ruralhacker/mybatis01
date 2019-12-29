package com.dao;

import com.domain.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> findAll();
}
