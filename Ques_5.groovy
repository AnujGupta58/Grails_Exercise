// Ques  5  Groovy Truth: if('test') { printlnn "test evaluated to true inside if" } try replacing test with various objects and observe its behaviour.
//          "Test"
//          'null'
//           null
//           100
//           0
//           empty list
//           list with all vaues as null List list = new ArrayList()
//           Write a class HourMinute where the class stores hours and minutes as separate fields.Overload + and - operator operator for this class

if("test")
{
    println "1. test evaluated to true inside if"
}


if('Test')
{
    println "2. test evaluated to true inside if"
}

if('null')
{
    println "3. test evaluated to true inside if"
}

if(null)
{
    println "4. test evaluated to true inside if"
}

if(100)
{
    println "5. test evaluated to true inside if"
}

if(0)
{
    println "6. test evaluated to true inside if"
}

List list=[]
if(list)
{
    println "7. test evaluated to true inside if"
}

List list1=new ArrayList()
list1.add(null)
list1.add(null)
if(list1)
{
    println "8. test evaluated to true inside if"
}


class HourMinute {
    int hours
    int minute

    HourMinute(int hours, int minute) {
        this.hours = hours
        this.minute = minute
    }

    HourMinute plus(HourMinute time) {
        return new HourMinute(this.hours+time.hours,this.minute+time.minute)
    }
    HourMinute minus(HourMinute time) {
        return new HourMinute(this.hours-time.hours,this.minute-time.minute)
    }
}
def h1 = new HourMinute(3, 5)
def h2 = new HourMinute(6, 9)

assert h1.hours+h2.hours == 9 && h1.minute+h2.minute == 14
assert h2.hours-h1.hours == 3 && h2.minute-h1.minute == 4
println('hi')

//println(h1)
//println(h2)