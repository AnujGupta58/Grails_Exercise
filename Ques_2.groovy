// Ques 2  Extend the Person class in Groovy Add following fields to it: empId, company, salary
//         Access the fields in all known ways: like through getter , by dot operator, by @ operator.

class Person1
{
    String name
    int age
    String gender
    String address
}

class Add extends Person1
{
    int empId
    String company
    int salary
}


Person1 add = new Add()
add.setName("Anuj")
add.setAge(22)
add.setGender("Male")
add.setAddress("Logic Tech Park")
add.setEmpId(3029)
add.setCompany("TotheNew")
add.setSalary(15000)

// Accessing data member using getter
println "Name: " + add.getName() + ", Age: "+ add.getAge() + ", Gender: " + add.getGender() + ", Address: "+ add.getAddress() + "EmpId: " + add.getEmpId() + ", Company: "+ add.getCompany() + ", Salary: " + add.getSalary()

// Accessing data member using dot operator
println "Name: " + add.name + ", Age: "+ add.age + ", Gender: " + add.gender + ", Address: "+ add.address + "EmpId: " + add.empId + ", Company: "+ add.company + ", Salary: " + add.salary

// Accessing data member using @ operator

println  "EmpId =" +add.@empId
println  "Company =" +add.@company
println  "Salary =" +add.@salary
println 'printing all the values using @ operator'