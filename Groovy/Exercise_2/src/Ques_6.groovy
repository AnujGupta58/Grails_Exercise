// Ques 6  Consider the following list: [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ] Print the class name of each element.
//          What's the output of the following statement? list.get(6).get(9)

List list= [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
println " 1 class name -------------> "+list.get(0).class
println " 2 class name -------------> "+list.get(1).class
println " 3 class name -------------> "+list.get(2).class
println " element1 class name ------> "+list.get(3).class
println " 0.3 class name -----------> "+list.get(4).class
println " [2, 4, 6] class name -----> "+list.get(5).class
println " 0..10 class name ---------> "+list.get(6).class