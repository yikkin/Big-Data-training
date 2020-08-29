
def sumf(f : Int => Int ,  a : Int , b : Int) : Int =
  if (a>b) 0 else f(a) + sumf(f , a+1 , b)

def sumsquare(a : Int , b : Int) : Int = sumf(x => x*x , a ,b)


//sumsquare(1,3)

def OneTwo( x : Int) : String = x match {
  case 1 => "one"
  case 2=> "two"
  case _ => "other"
}

//OneTwo(8)
