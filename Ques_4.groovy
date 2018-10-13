// Ques 4  GString... override the toString() of the Person class to return something like... "Sachin is a man aged 24 who lives at Delhi.
//         He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!."
import groovy.transform.ToString

@ToString
class Person2
{
    String name
    int age
    String location
    String address
    //List<Add2> fields
}

@ToString
class Add2 extends Person2
{
    int empId
    String company
    int salary
}
Person2 add2 = new Add2()
add2.setName("Abhi")
add2.setAge(22)
add2.setLocation("Delhi")
add2.setAddress("Logic Tech Park")
add2.setEmpId(3029)
add2.setCompany("TotheNew")
add2.setSalary(15000)

println "${add2.name} is a man aged ${add2.age} who lives at ${add2.location}. He works for ${add2.company} with employee id ${add2.empId} and draws ${add2.salary} lots of money !!!!."
