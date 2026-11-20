package com.rays.date;

import java.util.Date;

public class TestDateloop {
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while (i < 7) {

			Thread.sleep(1000);

			Date d = new Date();

			System.out.println(d);

			i++;

		}

	}

}
