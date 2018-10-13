// Ques 10  Write a method which removes all the white spaces in a file and writes the output to another file.
//          Suppose white space characters are Space, Tab and Enter

def a=new File("/home/anuj/filetest/Linux.txt").eachLine ({line-> line.replaceAll("\\s","")})
new File("/home/anuj/filetest/Writing").append(a)








//ch<<change.each ({file->file.getText()})
//FileWriter fileWriter = new FileWriter("/home/anuj/filetest/Writing")

//def dst = new File('/home/anuj/Example2.txt')
//new File("/home/anuj/filetest").eachFileRecurse { file ->
//    dst<<(file.getText())
//}
//
//.each( {
//    file-> ch<<(file.getText())
//}