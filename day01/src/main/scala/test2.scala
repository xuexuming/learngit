object test2 {
  def main(args: Array[String]):Unit ={

    val x = 10
    val y = 100
    println("x = " + x + "; y = " + y)

    //s插值器
    val str = s"x = $x; y = $y"
    println(str)

    //raw插值器
    val raw = raw"hello\t\nworld"
    println(raw)

    //f插值器
    val height = 1.9
    val name = "James"
    println(f"$name%s is $height%2.2f meters tall")

    //守卫语句
    //yield取值
    val a = for (i <- 0 until 10; if i%2 == 0) yield {
      i*2+1
    }
    println(a)

    //Range(start,end,间隔)
    for (i <- Range(1,10,2)){
      println(i)
    }

    for(i <- 1 to 5; j <- 6 to 9){
      println(i*10+j)
    }
  }

}
