/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program to print the employee of an organization in ascending order of their salary. */


import java.io.*;
import java.util.*;

class Employee	{
	private float salary;
	String name;
	int id;
	static int counter;

	Employee()	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter details of the Employee");
		System.out.print("Name:");
		name = sc.nextLine();
		System.out.print("Salary:");
		salary = sc.nextFloat();
		id = counter++;
	}

	Employee(String name, float salary)	{
		this.name = name;
		this.salary = salary;
		id = counter++;
	}

	void display()	{
		System.out.println("The Details of the employee are:");
		System.out.print("Name: " + name + " Salary: " + (int)salary);
	}

	float getSalary()	{
		return salary;
	}
	
}

class Ex05	{
	public static void main(String[] args)	{
		System.out.println("Enter number of Employees");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Employee[] emp = new Employee[num];

		for(int i = 0; i < emp.length; i++)	{
			emp[i] = new Employee();
		}

		emp = sort(emp);
        displayEmployees(emp);

	}

    static void displayEmployees(Employee[] emp)    {
		System.out.println("This is the List of Employees sorted on the basis of salary");
        for (int i = 0; i < emp.length; i++ )   {
            emp[i].display();
            System.out.println();
        }
    }

	static Employee[] sort(Employee[] emp)	{
        Employee temp;
        for(int i = 0; i < emp.length - 1; i++)    {
            for(int j = 0; j < emp.length - 1; j++)    {
                if(emp[j].getSalary() > emp[j+1].getSalary())    {
                    temp = emp[j];
                    emp[j] = emp[j+1];
                    emp[j+1] = temp;
                }
            }
        }
		return emp;
	}
}

/* Output --
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex05.java
Enter number of Employees
4
Please Enter details of the Employee
Name:Edwin
Salary:1000000000
Please Enter details of the Employee
Name:Susan 
Salary:4320000
Please Enter details of the Employee
Name:Somjit
Salary:1223402  
Please Enter details of the Employee
Name:Denny
Salary:3244536
This is the List of Employees sorted on the basis of salary
The Details of the employee are:
Name: Somjit Salary: 1223402
The Details of the employee are:
Name: Denny Salary: 3244536
The Details of the employee are:
Name: Susan Salary: 4320000
The Details of the employee are:
Name: Edwin Salary: 1000000000
*/
