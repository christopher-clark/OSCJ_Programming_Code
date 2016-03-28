package com.chris.oscjp.chapter5;

public class FormatterTest {

	public static void main(String[] args) {
		System.out.printf("%1$d\n" + "%2$d\n", 123, 456);
		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$(7d< \n", i1);
		System.out.printf(">%0,8d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
	}
}
