// Ques 2  Create a set from a list containing duplicate elements.
//         What do you observe? How can you achieve the same result without converting a list to a set?

List list = [1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10]
println "Output using toSet() "+list.toSet()        // USING toSet() METHOD WE HAVE REMOVED DUPLICATE VALUES

println "Output using unique() "+list.unique()   // Another way of achieving same result using unique() method
