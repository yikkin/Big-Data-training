def square(x : Double) : Double  = x*x
//square(5)

def sumofsquare(x : Double , y : Double) : Double =
  square(x) + square(y)

//sumofsquare(5,5)

def abs(x : Int) : Int = if(x>=0) x else -x

//abs(-5)

def reste(x : Int , y : Int) : Int = if (x > y) x%y else y%x

//reste(4,5)
//reste(7,1)

def max(x : Int , y : Int) : Int = if (x>y)  x else y

//max(4,5)