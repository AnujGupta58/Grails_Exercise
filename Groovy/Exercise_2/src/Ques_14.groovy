
// Ques 14  Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
//              For numbers which are multiples of both three and five print "FizzBuzz".

Range range=1..100
range.each {
    if (it%3==0 && it%5==0 && it%15==0)
    {
        println "fizzbuzz means divisible by 15"
    }
    else if(it%5==0)
    {
        println "buzz means divisible by 5"
    }
    else if(it%3==0)
    {
        println "fizz means divisible by 3"
    }
    else {
        println it
    }
}
