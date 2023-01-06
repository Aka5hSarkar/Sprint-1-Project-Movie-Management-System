package com.fruitchart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fruitchart.entity.Fruit;
import com.fruitchart.service.FruitService;

@RestController
public class FruitController {

	@Autowired
	private FruitService service;
	@PostMapping("/fruit")
	public Fruit addFruit(@RequestBody Fruit fruit) {
		return service.saveFruit(fruit);
	}
	@GetMapping("/fruit")
	public List<Fruit> findAllFruits(){
		return service.getFruits();
	}
	@GetMapping("/fruit/{id}")
	public Fruit findFruitById(@PathVariable int id) {
		return service.getFruitById(id);
	}
	@GetMapping("/fruit/{name}")
	public Fruit findFruitByName(@PathVariable  String name) {
		return service.getFruitByName(name);
	}
	@DeleteMapping("/fruit/{id}")
	public String deleteFruitById(@PathVariable int id) {
		return service.deleteFruitById(id);
	}
	@DeleteMapping("/fruit/{name}")
	public String deleteFruitByName(@PathVariable String name) {
		return service.deleteFruitByName(name);
	}
	@PutMapping("/fruit")
	public Fruit updateFruit(@RequestBody Fruit fruit) {
		return service.updateFruit(fruit);
	}
}
