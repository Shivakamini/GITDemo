package abstact;
abstract class Officer
{
	private String name;
	Officer(String name)
	{
		this.name=name;
	}
	void print()
	{
		System.out.println(name);
	}
	abstract void calcsalary();
}
class Salaried extends Officer
{
	private String name;
	private float salary;
	Salaried(String name,float salary)
	{
		super(name);
		this.salary=salary;
	}
	void print()
	{
		super.print();
	}
	void calcsalary()
	{
		System.out.println(salary);
		System.out.println(salary*10);
	}
}
class Extra extends Officer
{
	private String name;
	private float salary;
	private int wage;
	Extra(String name,float salary,int wage)
	{
		super(name);
		this.salary=salary;
		this.wage=wage;
	}
	void print()
	{
		super.print();
	}
	void calcsalary()
	{
		System.out.println(salary);
		System.out.println(salary*10*100);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Salaried s=new Salaried("shiva",100f);
		s.print();
		s.calcsalary();
		Extra e=new Extra("Sai",1000f,10);
		e.print();
		e.calcsalary();

	}

}
