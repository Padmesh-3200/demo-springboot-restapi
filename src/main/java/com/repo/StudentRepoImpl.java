package com.repo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepoImpl implements IStudentRepo{

	public String greeting() {
         return "hello ,came from Repository layer";
	}
	
	
}
