package com.klef.jfd.exam.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Customer {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  private String name;
	  private String email;
	  private String phoneNumber;
	  private String address;
	  private LocalDate dateOfBirth;
}
