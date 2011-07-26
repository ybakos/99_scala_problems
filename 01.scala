// P01 (*) Find the last element of a list.
//     Example:
// 
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

def last(l: List[Any]) = {
	l.reverse.head
}
