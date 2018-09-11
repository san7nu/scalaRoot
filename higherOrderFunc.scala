object higherOrderFunc {
	def main(args: Array[String]): Unit = {
		

		def sumInts(a:Int,b:Int):Int = {
			if(a>b) 0
			else a + sumInts(a+1,b)
		}

		def mulInts(a:Int,b:Int):Int = {
			if(a>b) 1
			else a * mulInts(a+1,b)
		}

		def genInts(f:Int =>Int,a:Int,b:Int):Int = {
			if(a>b) 1
			else f(a) + genInts(f,a+1,b)
		}

		def id(x:Int):Int = x
		def cube(x:Int):Int = x*x*x


	//println(genInts(x=>x*x*x,3,6))
	//println(genInts(cube,3,6))

/*
		def sum(f: Int => Int)(a: Int, b: Int): Int = {
  			def loop(a: Int, acc: Int): Int = {
    			if (a>acc) 1
    			else loop(a+1, acc)
  			}
  			loop(a, b)
		}

	println(sum(id,3,6))
*/

		def sumCurry(f:Int=>Int)(a:Int,b:Int):Int = {
			if(a>b) 0
			else f(a) + sumCurry(f)(a+1,b)
		}

		println(sumCurry(id)(3,6))

	}
	
}