object test3 {
  def main(args: Array[String]): Unit = {

    //参数x/y有默认值
    def add(x:Int,y:Int=10,z:Int=100):Int = {
      x+y+z
    }

    println(add(10,z=300))

    //变长参数
    def add1(a:Int*):Int = a.sum

    println(add1(1,2,3,4))

    val a = (1 to 10).toArray
    println(add1(a:_*))

  }

}
