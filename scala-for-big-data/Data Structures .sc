 //tuple and pairs

 val pair = ("answer" , 42)
 pair._1

 val coord = (10 , -5 , 3)
val x =  coord._1
 val y = coord._2
  val z = coord._3

// val xs = List("pommes" , "oranges" , "poires" , "kiwi")
//val ys = List("bananes","apple","gingembre")
// xs.head
//// xs.init
//xs.last
 //xs take 3

 //xs(3)
// xs drop 3

// xs++ys

 //xs:+"fruit"

 //filter , reduce , map
 val list = List(1,2,3,4,5,6,7,8,9,10)
 val listDouble = list.map(x => x*2)
 val listPaire = list.filter(x => x%2 == 0)
 val listsum = list.reduce((x,y) => x+y)
 val listsum2 = list.reduce(_+_)

 val liste_add10 = list.map(x => List(x,x+10))
 val listFlatMap = liste_add10.flatMap(x=>x)

 val pairs: List[(Char, Int)] = ('a', 2) :: ('b', 3) :: Nil
 val chars: List[Char] = pairs.map(p => p match {
  case (ch, num) => ch
 })

 def avant_dernier_elt(list : List[Int]) : Int
 list drop list.length
 

 avant_dernier_elt(list)

 def last(ls : List[Int]) : Int =
  ls match{
   case h::Nil =>h
   case _::tail => last(tail)
   case _ => throw new NoSuchElementException
  }

 last(list)

 def avantdernier(ls : List[Int]) : Int = ls match{
  case h::_::Nil =>h
  case _ ::tail => avantdernier(tail)
  case _ => throw new NoSuchElementException
 }

 avantdernier(list)


