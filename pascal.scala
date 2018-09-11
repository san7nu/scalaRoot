object second {
	def main(args: Array[String]): Unit = {

		def pascal(c:Int,r:Int):Int = {
				if(c==0 || c==r)
				1
				else
				pascal(c,r-1)+pascal(c-1,r-1)
				}		




	}
	
}