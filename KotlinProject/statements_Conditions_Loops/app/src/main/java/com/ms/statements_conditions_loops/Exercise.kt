package com.ms.statements_conditions_loops

class Exercise {

    companion object{
        @JvmStatic

        fun main(args: Array<String>){


        // when statement

            var num = 100
            when(num)
            {

                1 ->{
                    println("$num")
                }

                5 ->{
                    println("$num")
                }

                100 ->{
                    println("$num")
                }
            }

            // when conditional statement
            var number=100
            when{

                number >100 ->{
                    print("$number is greater than 100")
                }

                number < 100 ->{
                    print("$number is less than 100")
                }

                number == 100 ->{
                    print("$number is equal to 100")
                }

                else ->{
                    println("Not a number")
                }

            }
        }

    }

}