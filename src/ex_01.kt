fun fibonacciComUmaVariavel(n: Int): Int {
    var fib = 1

    for (i in 1 until n) {

        val atual = fib % 1000000
        val anterior = fib / 1000000
        val proximo = atual + anterior
        fib = atual * 1000000 + proximo
    }

    return fib % 1000000
}

fun main() {
    val n = 2
    println("Fibonacci($n) = ${fibonacciComUmaVariavel(n)}")
}
