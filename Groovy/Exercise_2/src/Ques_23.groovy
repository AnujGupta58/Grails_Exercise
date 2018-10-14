// Ques 23
//Write a method which retruns the value of passed key from a search string of the form "http://www.google.com?name=johny&age=20&hobby=cricket"


def url = new URL("http://www.google.com?name=johny&age=20&hobby=cricket")
def parameters=url.query.split("&")
println(parameters)
println parameters.class



//def values=parameters.collectEntries({it->it.split("=")})