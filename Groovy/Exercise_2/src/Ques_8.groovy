// Ques 8    Consider a class Emp with following details * Name * Age * Salary Create a list consisting of 10 Emp objects.
//              Get a list of employees who earn less than 5000
//              Get the name of the youngest employee and oldest employee
//              Get the employee with maximum salary
//              Get the list of names of all the employees

class Emp
{
    String name;
    int Age;
    double Salary;
}

Emp employee1=new Emp(name: "Abhi",Age: 21,Salary: 15000);
Emp employee2=new Emp(name: "Adesh",Age: 22,Salary: 1500);
Emp employee3=new Emp(name: "Ashish",Age: 25,Salary: 1000);
Emp employee4=new Emp(name: "Deepak",Age: 27,Salary: 8000);
Emp employee5=new Emp(name: "Suresh",Age: 24,Salary: 3000);
Emp employee6=new Emp(name: "Ramesh",Age: 28,Salary: 650);
Emp employee7=new Emp(name: "Tripti",Age: 21,Salary: 550);
Emp employee8=new Emp(name: "Ganesh",Age: 29,Salary: 9500);
Emp employee9=new Emp(name: "Shekhar",Age: 22,Salary: 2500);
Emp employee10=new Emp(name: "Vaibhav",Age: 25,Salary: 7700);

List listEmployee=[employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10]


println listEmployee.any{
    if(it.Salary>5000)
        print(it.name+"  ")
}

