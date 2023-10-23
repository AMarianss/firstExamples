/*
 *    Copyright (C) 2023 Guglielmo De Angelis (a.k.a. Gulyx)
 *    
 *    This file is part of the contents developed for the course
 * 	  ISPW (A.Y. 2023-2024) at Università di Tor Vergata in Rome. 
 *
 *    This is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as 
 *    published by the Free Software Foundation, either version 3 of the 
 *    License, or (at your option) any later version.
 *
 *    This software is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this source.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package it.uniroma2.dicii.ispw.myfirsttest;

import java.util.ArrayList;

public class ThisIsYetAnotherClass {

	public static void thisIsFoo(int primitiveTypeVar, ArrayList<String> formalParameter){
		primitiveTypeVar ++;
		System.out.println("var: "+ primitiveTypeVar + " (inside the invocation)");
		
		for (int index = 0; index < formalParameter.size(); index++) {
			String element = "foo_"+formalParameter.get(index); 
			formalParameter.set(index, element);
		}
	}
	
	public static void main (String args []){
		ArrayList<String> listOfStrings;
		listOfStrings = new ArrayList<String>();
		
		listOfStrings.add("Lorem");
		listOfStrings.add("ipsum");
		listOfStrings.add("dolor");
		listOfStrings.add("sit");
		listOfStrings.add("amet");
		
		int var = 200;
 
		System.out.println("The primitive type did not changed:");
		System.out.println("var: "+ var + " (before the invocation)");
		thisIsFoo(var, listOfStrings);
		System.out.println("var: "+ var + " (after the invocation)");
		
		System.out.println("The members of `listOfString` have been changed:");
		for (String s : listOfStrings) {
			System.out.println(s);
		}

	}
}