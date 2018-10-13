// Ques 8  Combine content of all the files in a specific directory to another new file

def dst = new File('/home/anuj/Example2.txt')
new File("/home/anuj/filetest").eachFileRecurse { file ->
    dst<<(file.getText())
}

// eachfileRecurse method recursively searches the file inside its subfolders and return data based on the condition

// getText() metho will read the the text from the text file returns the content of the text file.




/*
def dir=new File("/home/anuj/")
def dst = new File('/home/anuj/Example.txt')
dir.eachDirRecurse(txt.FILES) {
    dst << src.text
}
*/

/*
def src1 = new File('/home/anuj/Linux.txt')
def dst1 = new File('/home/anuj/Example.txt')
println new File(src1,dst1)
println Paths.get(src1,dst1)*/


/*def src1 = new File('/home/anuj/Linux.txt')
def dst1 = new File('/home/anuj/Example.txt')
src1.readLines()*/