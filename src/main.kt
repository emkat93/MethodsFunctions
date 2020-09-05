
fun triangle(x: Int, y: Int): Double {
    return 0.5 * x * y
}

fun square(a: Int): Int {
    return a * a
}

fun rectangle(e: Int, f: Int,): Int {
    return e * f
}

fun ellipse(m: Int, n: Int): Double {
    return 3.14 * m * n
}

fun main(){
    var z = triangle(2, 4)
    var b = square(5)
    var g = rectangle(10, 12)
    var o = ellipse(15, 16)
    var userAns = 0
    var userString = "c"
    var isexit = true

    do{
        println("1. triangle")
        println("2. square")
        println("3. rectangle")
        println("4. ellipse")

        print("Enter the number of the shape who's area you want: ")
        userAns = readLine()!!.toInt()
        when (userAns){
            1 -> {userString = "The area of the triangle is $z feet squared"
            isexit = false
            }
            2 -> {userString = "The area of the square is $b feet squared"
            isexit = false
            }
            3 -> {userString = "The area of the rectangle is $g feet squared"
            isexit = false
            }
            4 -> {userString = "The area of the ellipse is $o feet squared"
            isexit = false
            }
            !in 1..4 -> println("Invalid Option, Please Try Again")

        }

    }while (isexit)

    println("$userString")

}