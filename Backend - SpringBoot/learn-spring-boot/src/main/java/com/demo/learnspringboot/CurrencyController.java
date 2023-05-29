package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Week 5 - Day 5
 * Completed on 2023/05/26
 */

@RestController
public class CurrencyController {
	
		@Autowired
		private CurrencyServiceConfiguration config;
	
		//basically a getter for Autowired CurrencyServiceConfiguration
		@RequestMapping("/currency")
		public CurrencyServiceConfiguration receiveConfig() {
			return config;
		}
}