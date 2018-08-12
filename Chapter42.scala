
var wordsMap = new scala.collection.mutable.HashMap[String, Int]
val in = new java.util.Scanner(new java.io.File("textfile.txt"))

while (in.hasNext) {
    val word = in.next()
    val count = wordsMap.getOrElse(word, 0)
    wordsMap(word) = count + 1
    in.next()
  }

println(wordsMap.mkString(", "))
