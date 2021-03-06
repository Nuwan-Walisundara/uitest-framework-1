package com.wso2telco.test.framework.tools.data;

import java.util.Random;

public class DataGenerator {

	/**
	 * Generate random number.
	 *
	 * @author JayaniP
	 * @param num the num
	 * @return the string
	 */
	public String generateRandomNumber(int num){
		String number = "";
		Random generator = new Random();
		for (int i = 0; i < num; i++) {
			number += generator.nextInt(10);
		}
		return number;
	}
}
