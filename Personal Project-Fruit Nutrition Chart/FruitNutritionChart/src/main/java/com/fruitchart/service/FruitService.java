package com.fruitchart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitchart.entity.Fruit;
import com.fruitchart.repository.FruitRepository;

@Service
public class FruitService {
	@Autowired
	private FruitRepository fruitRepo;
	public Fruit saveFruit(Fruit fruit) {
		return fruitRepo.save(fruit);
	}
	public List<Fruit> getFruits(){
		return fruitRepo.findAll();
	}
	public Fruit getFruitById(int id) {
		return fruitRepo.findById(id).orElse(null);
	}
	public Fruit getFruitByName(String name) {
		return fruitRepo.findByName(name);
	}
	public String deleteFruitById(int id) {
		fruitRepo.deleteById(id);
		return "Deleted";
	}
	public String deleteFruitByName(String name) {
		fruitRepo.deleteByName(name);
		return "Deleted";
	}
	public Fruit updateFruit(Fruit fruit) {
		Fruit existingFruit=fruitRepo.findById(fruit.getFruitId()).orElse(null);
		existingFruit.setFruitName(fruit.getFruitName());
		existingFruit.setVitamin(fruit.getVitamin());
		existingFruit.setProtien(fruit.getProtien());
		existingFruit.setCarbs(fruit.getCarbs());
		existingFruit.setCalories(fruit.getCalories());
		existingFruit.setFiber(fruit.getFiber());
		existingFruit.setMinerals(fruit.getMinerals());
		return fruitRepo.save(existingFruit);
	}
}
