package com.ms.myapplication

class MyClass {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){


            println("Hello World!")

            // value assign (first method)

            var a : Int = 7
            var b : Int = 8
            var sum : Int = a+b
            println("Sum=$sum") // 15

            // value assign (second method)
            var n1 : Int
             n1 = 7
            var n2 : Int
            n2 = 8
            var total : Int
            total= n1+n2
            println("Sum=$total") //15

            // value assign (third method)

            var num1 = 7
            var num2 = 8
            var sum2 = num1+num2
            println("Sum=$sum2")  // 15


            // input variable

            var p : Int
            var q : Int
            var s : Int

            // var & val type variable

            var number = 10
                number= 11
            println("Number = $number")  // 11

            val number1 = 10
            //    number1 = 11  // Invalid
            println("Number1 = $number1")  // 10



            // calling function(add)
            println("Sum= ${add(5,6,5)}") //16

        }

        // Create Method or Function
         fun add(a: Int, b: Int) : Any{
             return a+b
         }
        // method overloading (same name but diff parameter)
        fun add(a: Int, b: Int, c: Int) : Int{
            return a+b+c
        }


    }
}