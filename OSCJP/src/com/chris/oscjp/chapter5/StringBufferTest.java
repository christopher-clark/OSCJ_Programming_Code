package com.chris.oscjp.chapter5;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("The Clash");
		sb.append("def").reverse().insert(3, "---").delete(1,3);
		System.out.println(" StringBuffer = " + sb);
		System.out.println(" Reversed = " + sb.reverse().delete(3,4).append("uckin Rock"));

	}

}
