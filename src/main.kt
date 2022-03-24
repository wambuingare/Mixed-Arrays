fun main(){
   println(sumArray(arrayOf(2,4,6,8)))
    var output = sentence(arrayOf("I", "am","Nancy"))
    println(output)
    //println(sentence(arrayOf("I","am","Nancy")))
    var y = sumIntegers(arrayOf(23,5.2,6,32,"water",false,32.5f))
    println(y)
}
fun sumArray(nums: Array<Int>): Int{
    var sum = 0
    nums.forEach { x->
        sum+=x
    }
   return sum
}
fun sentence(name: Array<String>):String{
   var words = " "
   name.forEach { x->
        words+=x + " "
   }
    return words
}

fun sumIntegers(mixedArr:Array<Any>):Double{
    var sum = 0.0
    mixedArr.forEach { nums->
        if (nums is Double)
            sum+=nums
    }
    return sum
}