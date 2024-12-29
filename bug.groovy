```groovy
def myMethod(List<String> list) {
  list.each { it ->
    println it
    if (it == "exit") {
      return // This will only exit the each loop, not the method
    }
  }
  println "Method completed"
}

myMethod(["a", "b", "exit", "c"])
```