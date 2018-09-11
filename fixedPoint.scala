object fixedPoint {
	def main(args: Array[String]): Unit = {

		def fixedP(f:Double=>Double,guess:Double):Double = {
			if(f(guess) == guess) guess
			else {
				println(guess)
				fixedP(f,f(guess))
			}
		}

	def avgDamp(x:Double):Double = 1 + (x/2)

	println(fixedP(x=>(x+25/x)/2,1))

	}
	
}