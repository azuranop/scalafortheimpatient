
import scala.collection.mutable.ArrayBuffer

val r = scala.util.Random

val a = 1 to 15 map { _ => r.nextInt(20) }

val ma = a.toArray

for (a <- 1 until (ma.length, 2)) { 
      val x = ma(a-1)
      ma(a-1) = ma(a)
      ma(a) = x
      }
