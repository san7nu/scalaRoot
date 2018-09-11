object balanceParanthesis{
	def main(args: Array[String]): Unit = {
		
		def balanceP(alist:List[Char]):Boolean = {
			var bal = 0
			for(i <- 0 to alist.length-1) {
			if(alist(i) == '(') 
				bal = bal +1
			if(alist(i) == ')')
				bal = bal -1
			}
		if(bal == 0)
		true
		else
		false
		}
	balanceP(List("this is fun("))
	}
	
}