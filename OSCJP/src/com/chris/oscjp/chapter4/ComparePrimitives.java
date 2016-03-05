package com.chris.oscjp.chapter4;

import javax.swing.JButton;

class ComparePrimitives {
	public static void main(String[] args) {
		JButton butt = new JButton("Yes");
		JButton no = butt;
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		System.out.println("5 != 6? " + (5 != 6));
		System.out.println("5.0 == 5L? " + (5.0 == 5L));
		System.out.println("true == false? " + (true == false));
		System.out.println("yes == no? " + (butt == no));
	}
}