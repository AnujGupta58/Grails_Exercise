class Person
{
    String name;
    int age;
    String gender;
    String address;
}
Person person = new Person();
person.setName("Anuj")
person.setAge(22)
person.setGender("Male")
person.setAddress("LogicTech Park Noida-127")

// Accessing Class members using getter
println "Accessing Class members using getter"
println(person.getName())
println(person.getAge())
println(person.getGender())
println(person.getAddress())

// Accesssing Class members using dot operator
println "Accesssing Class members using dot operator"
println(person.name)
println(person.age)
println(person.gender)
println(person.address)