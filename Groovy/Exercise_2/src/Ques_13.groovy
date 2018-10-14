// Ques 13  Find the number of occurences of a character in a string

String s="event"
str=s.toList()
//println str[1]

///  str.groupBy({str-> str}).each {it->println it}

a=str.groupBy({it->it})
a.values().each {it->println(it)}

println(a)
//println(b)







/*
Map map=[:]
for (String i : a.values()) {
    Integer j = map.get(i);
    map.put(i, (j == null) ? 1 : j + 1);
}

println(map.keySet()+"_____"+ map.values())
*/


/*
Map<Character,Integer> map=[:]
str.every( {
    if(!map.containsKey(str[it]))
    {
        map.putAt(str.getAt(it))
    }
    if(map.containsKey(str[it]))
    {
        map.putAt(str[it],map.getAt(str[it])+1)
    }
    println map
}
)*/
