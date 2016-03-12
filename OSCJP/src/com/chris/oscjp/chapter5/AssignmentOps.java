package com.chris.oscjp.chapter5;

class AssignmentOps {
	public static void main(String [] args) {
		int sizeOfYard = 8;
		int numOfPets = 1;
		String status = (numOfPets<4)?"Pet count OK" :(sizeOfYard > 8)? "Pet limit on the edge":"too many pets";
		System.out.println("Pet status is " + status);
		
		
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		int x = (int) (Math.random() * vowels.length);
		char c = vowels[x];
		//char c = 'z';
		switch(c) {
		case 'a': 
		case 'A':	System.out.println("vowel is an a");
					System.out.println("vowel is " + c);
		break;
		case 'e': 
		case 'E':	System.out.println("vowel is an e");
					System.out.println("vowel is " + c);
		break;
		case 'i': 
		case 'I':	System.out.println("vowel is an i");
					System.out.println("vowel is " + c);
		break;
		case 'o': 
		case 'O':	System.out.println("vowel is an o");
					System.out.println("vowel is " + c);
		break;
		case 'u': 
		case 'U':	System.out.println("vowel is an u");
					System.out.println("vowel is " + c);
		break;
		default: 	System.out.println("Default vowel is " + c);
		}
			/*for (int i = 0,j = 0; (i<10) && (j<20); i++, j++) {
			System.out.println("i is " + i + " j is " +j);
			}*/
	}
}
