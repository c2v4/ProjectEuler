val differenceBetweenSquares = { n: Int -> (1..n).fold(0,{
    acc, i ->
    acc + 2 * ((i+1)..n).map { a -> a * i }.sum() 
}) }

fun main(args: Array<String>) {
    print(differenceBetweenSquares(100))
}