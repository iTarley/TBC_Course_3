class Calculation {
    fun gcdCalc(x:Int, y:Int):String{
        var gcd = 1

        var i = 1
        while (i <= x && i <= y) {
            if (x % i == 0 && y % i == 0)
                gcd = i
            ++i
        }

        return ("$x -ის და $y -ის უსგ არის $gcd")
    }
    fun lcmCalc(x:Int,y:Int):String{

        var lcm: Int = if (x > y) x else y

        while (true) {
            if (lcm % x == 0 && lcm % y == 0) {
                return ("$x -ის და $y -ის უსჯ არის $lcm")

            }
            ++lcm
        }
    }
    fun containsCheck(checker:String):String{
        return if (checker.contains("$")){
            ("\"$checker\" შეიცავს დოლარის სიმბოლოს")
        }else{
            ("\"$checker\" არ შეიცავს დოლარის სიმბოლოს")
        }
    }
    fun evenSum():Int{
        var sum = 0
        for (digit in 1..100) {
            if (digit % 2 == 0) {
                sum += digit
            }
        }
        return sum
    }
    fun reverseSum(x:Int):String{
        val reverse = x.toString().reversed()
        return ("შებრუნებული რიცხვი: $reverse")
    }
    fun polindromCheck(x:String):String{
        val xBuilder = StringBuilder(x)
        val reverseStr = xBuilder.reverse().toString()
        val check = x.equals(reverseStr, ignoreCase = true)

        return if (check){
            ("\"$x\" პოლინდრომია")
        }else{
            ("\"$x\" არ არის პოლინდრომი")
        }

    }
}