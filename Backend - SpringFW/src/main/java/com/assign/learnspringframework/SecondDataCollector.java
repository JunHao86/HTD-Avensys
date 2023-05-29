package com.assign.learnspringframework;

import org.springframework.stereotype.Component;

/* Week 5 - Day 4
 * Completed on 2023/05/25
 */

@Component
public class SecondDataCollector implements DataProvider{
	public int[] provideData() {
		return new int[] {1,3,5,7,9};
	}
}