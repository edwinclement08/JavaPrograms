/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program to implement multilevel inheritance types.
 * Person—Employee—Manager */
import java.util.*;

class Person
{
	private int age;
	private String firstName;
	private String lastName;

    Person()    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the First Name: ");
        firstName = sc.nextLine();
        System.out.println("Please enter the Last name: ");
        lastName = sc.nextLine();
        System.out.println("Please enter the Age: ");
        age = sc.nextInt();
        System.out.println("");
    }


	Person(String firstName, String lastName, int age)
	{
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void printName() {
		System.out.println("\tName: " + firstName + " " + lastName);
	}

	void printAge() {
		System.out.println("\tAge: " + age);
	}

    void display()  {
        printName();
        printAge();
    }
}

class Employee extends Person	{
    private long empId;
    private static long empIdCounter;
    protected double salary;

    Employee()  {
        super();
        System.out.println("Please enter salary: ");
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();

        empId = empIdCounter++;
    }

    Employee(String firstName, String lastName, int age, double salary)     {
        super(firstName, lastName, age);
        this.salary = salary;

        empId = empIdCounter++;
    }

    void printSalary()  {
        System.out.println("\tSalary: "+ salary);
    }

    void printEmpId()   {
        System.out.println("\tEmployee ID:" + empId);
    }

    void display()  {
        super.display();
        printSalary();
        printEmpId();
    }
}

class Manager extends Employee {
    double incentive;

    Manager()   {
        super();
        incentive = .1;
    }

    Manager(String firstName, String lastName, int age, double salary, double incentive)    {
        super(firstName, lastName, age, salary);
        this.incentive = incentive;
    }

    void printSalary()   {
        System.out.println("\tSalary: " + (1 + incentive) * salary);
    }
    
}


public class Ex11
{
	public static void main(String[] args)
	{
        System.out.println("Examples using data passed by constructer. :");

		Person person1 = new Person("John", "Smith", 32);
        Employee emp1  = new Employee("Ravi", "Davis", 23, 634334.00);
        Manager mng1   = new Manager("Harish", "Jacob", 43, 700000.0, .3);


        System.out.println("The Details of the person are::");
        person1.display();

        System.out.println("The Details of the Employee are::");
        emp1.display();

        System.out.println("The Details of the Manager are:: ");
        mng1.display();

        System.out.println("Example of data inputed within the classes. :");

		Person person2 = new Person();
        Employee emp2  = new Employee();
        Manager mng2   = new Manager();

        System.out.println("The Details of the person are::");
        person2.display();

        System.out.println("The Details of the Employee are::");
        emp2.display();

        System.out.println("The Details of the Manager are:: ");
        mng2.display();
	}
} 



/* Output --
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex11.java 
Examples using data passed by constructer. :
The Details of the person are::
	Name: John Smith
	Age: 32
The Details of the Employee are::
	Name: Ravi Davis
	Age: 23
	Salary: 634334.0
	Employee ID:0
The Details of the Manager are:: 
	Name: Harish Jacob
	Age: 43
	Salary: 910000.0
	Employee ID:1
Example of data inputed within the classes. :
Please enter the First Name: 
Edwin
Please enter the Last name: 
Clement
Please enter the Age: 
18

Please enter the First Name: 
Kevin
Please enter the Last name: 
Sunny
Please enter the Age: 
20

Please enter salary: 
320000
Please enter the First Name: 
Samson     
Please enter the Last name: 
Anto
Please enter the Age: 
24

Please enter salary: 
343566
The Details of the person are::
	Name: Edwin Clement
	Age: 18
The Details of the Employee are::
	Name: Kevin Sunny
	Age: 20
	Salary: 320000.0
	Employee ID:2
The Details of the Manager are:: 
	Name: Samson Anto
	Age: 24
	Salary: 377922.60000000003
	Employee ID:3
*/

