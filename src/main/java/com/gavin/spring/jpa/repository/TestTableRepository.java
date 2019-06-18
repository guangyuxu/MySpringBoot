package com.gavin.spring.jpa.repository;

import com.gavin.spring.jpa.entity.TblTest;
import com.gavin.spring.jpa.entity.TblTestIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TestTableRepository extends CrudRepository<TblTest, TblTest> {}
