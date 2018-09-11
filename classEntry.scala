object classEntry {
	
	def main(args: Array[String]): Unit = {

		class abc(a:Int,b:Int){
		def numen = a
		def denom = b

		def neg():Int = -a

		}
		
		val r1 = new abc(3,2)

		println(r1.neg)

		def add(r:abc) = {
			println(r.numen+"----"+r.denom)
		}

		

	}
}