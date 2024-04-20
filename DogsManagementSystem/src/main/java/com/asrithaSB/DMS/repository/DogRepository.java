package com.asrithaSB.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asrithaSB.DMS.Models.Dog;

/**
 * @author S560800 Asritha Daida
 */

public interface DogRepository extends CrudRepository <Dog, Integer>{
	List<Dog> findByName(String name);
}
