// Ques 7  Sort the given list in descending order having distinct elements: [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]

List list=[14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]
println list.sort{a1,a2->a2<=>a1}.unique()
