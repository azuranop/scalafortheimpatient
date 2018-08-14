
import scala.collection.mutable.{Map => MutableMap}
import scala.io.Source

source.replace(",", "").replace(".", "").split("\\s+").map(_.toLowerCase).foldLeft {
      MutableMap[String, Int]().withDefault(_ => 0)
      } {
        (m, w) => m += (w -> (m(w) + 1))
      }
