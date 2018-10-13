
// Ques 11  Make copy of an image type file byte by byte


def src = new File("/home/anuj/filetest/desktop.png").readBytes()
new File('/home/anuj/filetest/write').append(src)


//println(dst)
//{ file ->
//    dst<<(file.getText())