package com.practiceflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	
	@GetMapping(value="/getSurprise")
	public String getSurprise()
	{
		return "Hey!! **Love Yourself before you love SomeOne** ;) ";
	}

}
