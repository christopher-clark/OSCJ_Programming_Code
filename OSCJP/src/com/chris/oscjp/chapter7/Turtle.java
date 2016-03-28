package com.chris.oscjp.chapter7;
import java.util.*;

class Turtle {
 int size;
 
 public Turtle(int s) { 
	 size = s; 
 }
 public boolean equals(Object o) { 
	 return (this.size == ((Turtle)o).size); 
 }
 public int hashCode() { 
	 System.out.println(size/5);

	 return size/5; 
 }
}
