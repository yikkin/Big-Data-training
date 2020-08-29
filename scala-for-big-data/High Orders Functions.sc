def sumints(a: Int , b : Int) : Int =
  if (a>b) 0  else a +  sumints(a+1 , b)

//sumints(5,7)

def sumf(f : Int => Int ,  a : Int , b : Int) : Int =
  if (a>b) 0 else f(a) + sumf(f , a+1 , b)

def sumints2(a: Int , b :Int) : Int = sumf(x=>x , a , b)

//sumints2(0 , 19)