package org.strings;

public class Test {
public static void main(String[] args) {
	String s = "shakthi";
	String s1 = "GOKUL";
	String s2 = "This is java program";
	String s3 = "";
	String s4 = "          This is java program  ";
	int length = s.length();
	System.out.println(length);
	String upperCase = s1.toUpperCase();
	System.out.println(upperCase);	
	String lowerCase = s1.toLowerCase();	
	System.out.println(lowerCase);
	int index = s.indexOf('S');
	System.out.println(index);
	int las = s.lastIndexOf('i');		
	System.out.println(las);
	char charAt = s.charAt(3);
	System.out.println(charAt);
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	boolean equals = s.equals(s1);
	System.out.println(equals);
	boolean contains = s1.contains("KUL");	
	System.out.println(contains);
	String replace = s2.replace("i","9");
	System.out.println(replace);
	boolean startsWith = s1.startsWith("L");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("l");
	System.out.println(endsWith);
	boolean empty = s3.isEmpty();
	System.out.println(empty);	
	String trim = s4.trim();
	System.out.println(trim);
}
}
