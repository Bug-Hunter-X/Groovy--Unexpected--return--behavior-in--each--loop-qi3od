```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { it, index ->
    println it
    if (it == "exit") {
      return //Return from the eachWithIndex method
    }
  }
  println "Method completed"
}

myMethod(["a", "b", "exit", "c"])


def myMethod2(List<String> list) {
  for(String item : list){
    println item
    if(item.equals("exit")){
      return
    }
  }
  println "Method completed"
}

myMethod2(["a","b","exit","c"])
```