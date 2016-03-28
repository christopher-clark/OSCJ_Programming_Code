package com.chris.oscjp.chapter7;
import java.util.*;

public class TurtleTest {
 public static void main(String[] args) {
	 LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
	 t.add(new Turtle(1)); 
	 t.add(new Turtle(2));
	 t.add(new Turtle(1));
	 System.out.println(t.size());
 }
}
