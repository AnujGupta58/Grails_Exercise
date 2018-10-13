// Ques 9    Create a file which contains all the odd numbered lines of a given file.
//           Each line should be numbered at the beginning of line viz : 1, 3, 5.....

def src=new File("/home/anuj/filetest/Even").readLines().find({it->println(it%2)})

