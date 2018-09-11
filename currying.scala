object currying {
	def main(args: Array[String]): Unit = {
		

		def prod(f:Int=>Int)(a:Int,b:Int):Int = {
			if(a>b) 1
			else f(a) * prod(f)(a+1,b)
		}

		def func(x:Int):Int = x
		def fact(n:Int):Int = prod(func)(1,n)

		println(fact(4))

/*
		def sumprodF(f:Int=>Int)(a:Int,b:Int):Int = {
			if(a>b) 1
			else f(a,sumprod(f)(a+1,b))
		}

		def genfunc(a:Int,f:Int=>Int):Int = 
*/ 
		


	}
	
}