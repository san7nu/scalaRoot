object setGrp {
	def main(args: Array[String]): Unit = {
		
		val alist = Seq(("one", "i"), ("two", "2"), ("two", "ii"), ("one", "1"), ("four", "iv"))

		 alist.groupBy(x => x._1).map(y => {print(y._1+"--->");y._2.map(z =>print(z._2+" "));println})


	}
	
}