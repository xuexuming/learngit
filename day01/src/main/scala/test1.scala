object test1 {
  def main(args:Array[String]): Unit ={

    val x = 1
    val y:Int = if(x>10) 10 else 0
    println(y)

    val score = 70
    var scoreStr = ""
    if (score>60 && score<90) scoreStr = "及格"
    else if (score>90) scoreStr = "优"
    else "不及格"

    val z = if (score>60 && score<90) "及格"
    else if (score>=90) "优"
    else "不及格"
  }

}
