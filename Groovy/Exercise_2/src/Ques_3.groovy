// Ques 3    Given two lists [11, 12, 13, 14] and [13, 14, 15],
//           how would we obtain the list of items from the first that are not in the second?

List list1=[11,12,13,14]
List list2=[13,14,15]

list1.removeAll(list2)  // By passing list2 in parameters removeAll will remove all the common elemnets from list1
println(list1)
