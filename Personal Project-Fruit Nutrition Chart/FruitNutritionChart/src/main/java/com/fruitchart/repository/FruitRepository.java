package com.fruitchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fruitchart.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit,Integer> {
	Fruit findByName(String name);

	void deleteByName(String name);
}
