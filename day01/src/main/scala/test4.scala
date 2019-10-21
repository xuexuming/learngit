object test4 {
  def main(args: Array[String]):Unit = {
    val arr = (1 to 10).toArray

    for (i<- 0 to arr.length-1){
      println(arr(i))
    }

    for (i<- arr.indices){
      println(arr(i))
    }
  }

}
