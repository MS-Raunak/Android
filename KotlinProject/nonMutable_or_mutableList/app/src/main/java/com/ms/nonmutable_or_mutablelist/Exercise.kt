package com.ms.nonmutable_or_mutablelist

class Exercise {
    companion object{
        @JvmStatic
        fun main(args: Array<String>)
        {

//             imutable list : cannot delete or insert on runtime.

            /**
            var arr= listOf("Ram", "Shyam", "Sita")  // by default Any data type
            var arr = listOf<Any>("Ram", "shyam", "Sita",1,2,3,4,5)
            var arr = listOf("Ram", "shyam", "Sita",1,2,3,4,5)  //by default Any data type
            var arr = listOf<Int>(1,2,3,4,5) // only Integer data type
            println(arr)   **/


//             mutable List :  can perform any action on runtime
        /**
            var mArr = mutableListOf("Ram", "Shyam", "Sita") // by default consider as string array
            mArr.add("Rahul")
           // mArr.add(10)  // invalid
            println(mArr) **/

            /** Example 2 (MutableListOf)
            var mArr = mutableListOf(1,2,3,4,5,6) // by default consider as integer array
            mArr.add(7)
            // mArr.add("Rahul")  // invalid
            println(mArr) **/


             /** Example 3 (MutableListOf)
            var mArr = mutableListOf("Ram","Shyam", 1,2,3,4,5,6)
            mArr.add(7)  // valid
            mArr.add("Rahul")    // valid
            println(mArr) **/

//             Replace elements on runtime in mutable list
        /**
            var mArr = mutableListOf("Ram", "Shyam", 10, 20)
            mArr.add(0,"Ramayan")
            mArr.add(4,211)
            mArr.remove(10)
            println(mArr) **/

            // setOf method: it is amutable list method, cannot perform any operation on runtime
           /** val aSet = setOf("amutable","set",10,20,false)
            println(aSet) **/


//             mutableSetOf method: it is mutable list method, perform any operation on runtime
            /** val mSet = mutableSetOf("mutable","set",10,20,false)
                // runtime operation
                mSet.add("add")
                mSet.remove(10)
            println(mSet) **/

//             mapOf() method: this methods contains pair of objects
               // example1
            /** val aMap = mapOf(1.2 to "Ram", 2 to "Raman", 10 to "Rakesh")
            println(aMap)  **/

                // example2
            /** val aMap = mapOf("Place" to " Banglore" , "Mob No" to  8809197034)
            println(aMap) **/

//             mutableMapOf() method: similar to mapOf but we can perform any operation on runtime
            // example1: put(): add single data
             /** val mMap = mutableMapOf(1 to "Ram", 2 to "Raman", 10 to "Rakesh")
            mMap.put(3, "Peter")
            println(mMap) **/

            // example2: putALL(): add multiple data
             /** val mMap = mutableMapOf<Int, String>()
            val mAMap = mapOf(1 to "Ram", 2 to "Rohit", 3 to "Raj")
            mMap.putAll(mAMap)
            println(mMap) **/

             // example3: putALL(): add multiple data
             /** val mMap = mutableMapOf<Int, String>()
            val mAMap = mapOf(1 to "Ram", 2 to "Rohit", 3 to "Raj")
            mMap.putAll(mAMap)
            println(mMap) **/

//             Arraylist : similar to linked list, one can perform any operation on runtime

            /** val arrName = arrayListOf(1,"Ram","Neha","Harsh")
            println(arrName) //[1, Ram, Neha, Harsh]

            arrName.add("Kiran")
            println("Add array: $arrName") // [1, Ram, Neha, Harsh, Kiran]

            arrName.remove("Neha")
            println("Remove Array:$arrName") // [1, Ram, Harsh, Kiran]

            arrName.removeAt(1)
            println("Remove by index number: $arrName") // [1, Harsh, Kiran]

            arrName[0] = "HHH"
            println("Replace element by index number: $arrName") // [HHH, Harsh, Kiran]
            **/

//             For loop
            /** for (i in 1..5){
                print(i) // 1 2 3 4 5
            }

            for (i in 1 until 5){
                print(i)  // 1 2 3 4
            }

            for (i in 5 downTo 1){
                print(i)  // 5 4 3 2 1
            }

            for (i in 1..5 step 2){
                print(i)  // 1 3 5
            }

            for (i in 5 downTo 1 step 2){
                print(i)  // 5 3 1
            } **/

           // For loop iterating through an array

            /** val arr = ArrayList<Int>()
            arr.add(1)
            arr.add(10)
            arr.add(20)
            arr.add(5)
            arr.add(17)
            for (i in arr)
            {
                println("Number is: $i") // 1 10 20 5 17
            } **/

//            do..while loop
           /** var num =10
            do {
                println("Number is: $num")
                num++
            }while (num<20) **/

//            while loop

           /** var num= 10
            while (num<=20){
                println("Number is: $num")
                num++
            } **/


//            Pair in Kotlin => Pair is just couple of object or two things
        /**
           // example1
            val (a,b) = Pair("A", 1)
            println("$a $b")  // A 1

            //example 2
            val (p,q) = Pair(1,true)
            println("$p $q")  //1 true

           // example 3
            val (c,d) = Pair(10,20)
            println("$c $d") // 10 20

            // example 4
            val name = Pair("Name:", "Raunak")
            println("${name.first} ${name.second}") // Name: Raunak **/

//            Nested Pair() Method
            /** val mName = Pair("Peter", Pair("Harry", Pair("Brooke", "Johnson")))
            println("${mName.first} ${mName.second.first}") // Peter Harry
            println("${mName.first} ${mName.second.second.first}") // Peter Brooke **/

//            Triple: Triple is the combination of three value
          /**   // example 1
             val (p,q,r) = Triple("Peter", "Harry", "Brooke")
            println("$p $q $r") // Peter Harry Brooke

            // example2
            val names = Triple("Jonh", "David", "Glenn")
            println("${names.first} ${names.second} ${names.third}") // John David Glenn

            //examples 3
            var CharIn = Triple("Vastu",100,245)
            println("${CharIn.first}, ${CharIn.second}, ${CharIn.third}") // Vastu 100 245 **/


//      Nested Triple() Method
            var name = Triple("AAA", "BBB", Triple("CCC", "DDD", Triple("EEE", "FFF", "GGG")))
            println("${name.first} ${name.second} ${name.third.third.third}") // AAA BBB GGG

        }
    }
}