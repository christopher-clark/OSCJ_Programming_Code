package com.chris.oscjp.chapter6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-eA-C]");
		Matcher m = p.matcher("CAF12Eadsdcv676@$dfcafe");
			while(m.find()) {
				System.out.print(m.start() + " ");
			}
	}
}
