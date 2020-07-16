package com.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("b")
public class Dummy implements IStudentService {

	public String greeting() {
		return "From Dummy";
	}

}
