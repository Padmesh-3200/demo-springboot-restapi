package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.repo.IStudentRepo;

@Service
@Primary
@Qualifier("a")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo studentRepo;
	
	public String greeting() {
		return studentRepo.greeting();
	}
	
	
	

}
