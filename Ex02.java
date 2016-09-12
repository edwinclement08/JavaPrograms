/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program that counts the total number of employees in an organization. */


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
		id = ++counter;
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

class Ex02	{
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);

		Employee[] emp = new Employee[100];

        int i = 0;
        String inp;
        do  {
		    System.out.println("Enter Details of Employee " + i);
			emp[i] = new Employee();
		    System.out.println("Do you want to enter another Employee[Y/N]");
            i++;
            inp = sc.nextLine();
        } while(!inp.equals("n"));

        System.out.println("The number of Employee:" + Employee.counter);

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
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex02.java
Enter Details of Employee 0
Please Enter details of the Employee
Name:Edwin
Salary:200000
Do you want to enter another Employee[Y/N]
y
Enter Details of Employee 1
Please Enter details of the Employee
Name:Kevin
Salary:230000
Do you want to enter another Employee[Y/N]
n
The number of Employee:2
*/
