// Ques 18   Try the following code on a map: println map.class println map.getClass() What do you observe?


Map map=[:]
println map.class  // In case of giving only .class it treat it as a key of the map so it returns the corresponding value

println map.getClass()  // // In case of giving .getClass() it will return the corresponding class name