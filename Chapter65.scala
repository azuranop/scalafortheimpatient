
object Hello extends App {
  if (args.length > 0)
     println(args.reverse.mkString(" ")) 
  else
     println("Error")
}
