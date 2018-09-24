import scala.io.Source
import util.control.Breaks._

object club {
	def main(args: Array[String]): Unit = {
		
		val filename1 = "tmp1.txt"
		val filename2 = "tmp2.txt"
		var set = scala.collection.mutable.Set[String]()
		for (line1 <- Source.fromFile(filename1).getLines) {
			set = set + line1.split(",")(0)
		}
		for (line2 <- Source.fromFile(filename2).getLines) {
			set = set + line2.split(",")(0)
		}
		
		
		println("----")
		for( i <- set ) breakable{
			
			for (line1 <- Source.fromFile(filename1).getLines) {
				if(line1.split(",")(0) == i ){
					set = set - i
					println(line1)
					break
				}
			}
			
			for (line2 <- Source.fromFile(filename2).getLines) {
				if(line2.split(",")(0) == i ){
					set = set - i
					println(line2)
					break
				}
			}
		}
		
		println("----")
		
	}
}