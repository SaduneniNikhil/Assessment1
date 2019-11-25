package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubProductRepo extends CrudRepository<SubProduct, Integer> {
	List<SubProduct> findByProductName(Optional<String> productname);

	
}
