package me.umov.springbootdeployments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

	@GetMapping
	public String status() {
		return "Books application - 1.0.0";
	}
}
