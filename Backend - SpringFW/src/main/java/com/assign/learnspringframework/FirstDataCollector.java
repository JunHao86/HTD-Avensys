package com.assign.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/* Week 5 - Day 4
 * Completed on 2023/05/25
 */

@Component
@Primary
public class FirstDataCollector implements DataProvider{
	public int[] provideData() {
		return new int[] {10,20,30,40,50};
	}
}