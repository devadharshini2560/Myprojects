package com.dd.project;

import java.util.Scanner;
public class ArithmaticCalculator {

	public static void main(String[] args) {
	   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any two numbers");
	    int firstnum=sc.nextInt();
	    int secnum= sc.nextInt();
	    System.out.println("Enter the operator ");
	    char op=sc.next().charAt(0);
	    double Ans=0;

	    switch(op){
	    case '+': Ans=firstnum+secnum;
	    break;
	    case '-':Ans=firstnum-secnum;
	    break;
	    case '*': Ans=firstnum*secnum;
	    break;
	    case '/':Ans=firstnum/secnum;
	    break;
	    }
	    System.out.println("The answer is " +Ans);
	  }
}
	