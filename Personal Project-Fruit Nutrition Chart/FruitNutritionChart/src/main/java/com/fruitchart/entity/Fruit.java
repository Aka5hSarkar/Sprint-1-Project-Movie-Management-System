package com.fruitchart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="fruit_details")
public class Fruit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fruitId;
	private String fruitName;
	private double vitamin;
	private double protien;
	private double carbs;
	private double calories;
	private double fiber;
	private double minerals;
	
}
