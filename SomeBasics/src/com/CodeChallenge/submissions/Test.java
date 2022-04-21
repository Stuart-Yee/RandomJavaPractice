package com.CodeChallenge.submissions;

public class Test {

	public static void main(String[] args) {
		Test.echo(args);

}

	public static void echo(String[] args) {
		for (String arg: args) {
			System.out.print(arg + " ");
		}
	}

}