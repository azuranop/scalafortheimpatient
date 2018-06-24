class Point (x: Double, y: Double) {
      val xcoordinate = x
      val ycoordinate = y
 }


object Point{
   def apply(x: Double, y: Double) =
      new Point(x, y)
 }
