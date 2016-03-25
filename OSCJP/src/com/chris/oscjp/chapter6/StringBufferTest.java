package com.chris.oscjp.chapter6;

public class StringBufferTest {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer("The Clash");
		sb.append("def").reverse().insert(3, "---").delete(1,3);
		System.out.println(" StringBuffer = " + sb);
		System.out.println(" Reversed = " + sb.reverse().delete(3,4).append("uckin Rock"));*/
		String s = "initial string";
		System.out.println(s);
		System.out.println("concatting to s");
		s.concat("xxx");
		System.out.println(" s after concat(\"xxx\") = " + s);
		s = s.concat("xxx");
		System.out.println(" s after s =  concat(\"xxx\") = " + s);
		StringBuffer sbuf = new StringBuffer("string Buffer");
		StringBuilder sbuilder = new StringBuilder("string Builder");
	
	}

}
