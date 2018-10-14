// Ques 22

// Conside a class named "Emp" which has the following properties: 1) Name 2) Age 3) DepartmentName 4) EmployeeNumber 5) Salary Let's say that there's a list of 50 employees available. Perform the following operations on the list of employees:
//Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on.
//Get a count of the number of employees in each department
//Get the list of employees whose age is between 18 and 35
//Group the employees according to the alphabet with which their first name starts and display the number of employees in each group whose age is greater than
//Group the employees according to their department.

class Employee
{
    String name;
    int Age;
    double Salary;
    String Department
    int EmployeeNumber;

/*    @Override
    String toString() {
        return "Employee "+ name;
    }*/
}

Employee employee1=new Employee(name: "Abhi",Age: 21,Salary: 15000, Department: "IT",EmployeeNumber: 1);
Employee employee2=new Employee(name: "Adesh",Age: 22,Salary: 15000,Department: "Network",EmployeeNumber: 2);
Employee employee3=new Employee(name: "Ashish",Age: 25,Salary: 8000,Department: "Sales",EmployeeNumber: 3);
Employee employee4=new Employee(name: "Deepak",Age: 27,Salary: 8000,Department: "IT",EmployeeNumber: 4);
Employee employee5=new Employee(name: "Suresh",Age: 14,Salary: 8000,Department: "Sales",EmployeeNumber: 5);
Employee employee6=new Employee(name: "Ramesh",Age: 15,Salary: 6500,Department: "Network",EmployeeNumber: 6);
Employee employee7=new Employee(name: "Tripti",Age: 21,Salary: 6500,Department: "IT",EmployeeNumber: 7);
Employee employee8=new Employee(name: "Ganesh",Age: 29,Salary: 9500,Department: "Sales",EmployeeNumber: 8);
Employee employee9=new Employee(name: "Shekhar",Age: 16,Salary: 9500,Department: "IT",EmployeeNumber: 9);
Employee employee10=new Employee(name: "Vaibhav",Age: 25,Salary: 7700,Department: "Network",EmployeeNumber: 10);

List<Employee> list=[employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10]



// Part 1  -- //Group the employees on the basis of the bracket in which their salary falls.
//              The ranges are 0-5000, 5001 and 10000, and so on.
println("Part 1")
list.groupBy({ Employee -> Employee.Salary }).eachWithIndex
        { Map.Entry<Double, List<Employee>> entry, int i -> println entry.key+"-->"+ entry.value.name}
println()


// Part 2  -- //Get a count of the number of employees in each department
println("Part 2")
list.groupBy {Employee->Employee.Department}.eachWithIndex{
    Map.Entry<String, List<Employee>> entry, int i -> println entry.key+"-->"+ entry.value.name}
println()


// Part 3 -- //Get the list of employees whose age is between 18 and 35
println("Part 3")
list.each({
    if(it.Age>18 && it.Age<35)
        println it.name  // +"__" +
})
println()



// Part 4  -- Group the employees according to the alphabet with which their first name starts
//              and display the number of employees in each group whose age is greater than
println("Part 4")
a=list.sort{a1,a2->a1.name<=>a2.name} //.eachWithIndex{ Map.Entry<String, List<Employee>> entry, int i -> println entry.value.name }
println(a.name)
println()




// Part 5  -- //Group the employees according to their department.
println("Part 5")
list.groupBy {Employee->Employee.Department}.eachWithIndex{
    Map.Entry<String, List<Employee>> entry, int i -> println entry.key+"-->"+ entry.value.name}









//println EmployeeBySalary

//def EmployeeBydepartment = list.groupBy({ Employee -> Employee.Department })
//println EmployeeBydepartment.keySet.count(Department)



//Map<String,String> map=[:]
//map.put(employee1.Department,employee1.name)
//map.put(employee2.Department,employee2.name)
//map.put(employee3.Department,employee3.name)
//map.put(employee4.Department,employee4.name)
//map.put(employee5.Department,employee5.name)
//map.put(employee6.Department,employee6.name)
//map.put(employee7.Department,employee7.name)
//map.put(employee8.Department,employee8.name)
//map.put(employee9.Department,employee9.name)
//map.put(employee10.Department,employee10.name)
