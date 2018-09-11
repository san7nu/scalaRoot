object denomination {
	def main(args: Array[String]): Unit = {
		
		def denom(d:Int) = {
			
			var Ns = 1

			//1s
			//2s 1s
			//3s 2s 1s
			//(n-1)s ..... 1s
			counter()
			//possibles for 10 in 5s
			possibles(10,5)
			{
				possibles(5,1)
				possibles(5,2)
				{
					possibles(2,1)
				}
				possibles(5,3)
				{
					possibles(3,1)
					possibles(3,2)
				}
				possibles(5,4)
				{
					possibles(4,3)
					possibles(4,2)
					possibles(4,1)
				}
			}

			def possibles(x:Int,n:Int) ={
				print(n+" ")
				for(i <- 1 to n){
					printNI(n,i)
				}
			}

			def printNI(t:Int,p:Int) ={
				//print Total(t) in Parts(p)
				for(i <- )
			}

			for(i <- 1 to d)
			possibles(d,i)

		}


	println(denom(5))

	}
	
}