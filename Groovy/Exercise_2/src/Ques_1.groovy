
// Ques 1   Initialize an empty list and give the output of the following code:
//          l[11] = "myelement"
//          println l[11]
//          println l.get(5)
//          println l
//          Initialize a list using a range and find all elements which are even.

List list=[1,2,3,4,5,6,"Hello","Hi",9,10,"World","myelement","tothenew"]  // Initializeda list

/// Part 1 --- l[11] = "myelement"
List l=[]

/// Part 2 --- println list[11]
println list[11]

/// Part 3 --- println list.get(5)
println list.get(5)

/// Part 3 --- println list
println list


/// Part 5 ---  Initialize a list using a range and find all elements which are even.
Range range=1..20
range.each {
    it-> l.add(it)
}
println(l)

l.each {
   if(it%2==0)
   {
       print(it+ " ")
   }
}