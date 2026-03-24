package org.example

import kotlin.reflect.typeOf


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  println("Enter what u want")
    var thing:String?=null
    thing=readLine()
    var count=thing?.length
    println("the result is $count")


//        var a: String? = "Hello"
//        var b: String? = null
//
//        // --- Safe Call ?. ---
//        println("Safe call (?.) results:")
//        println(a?.length)  // 5, because a is not null
//        println(b?.length)  // null, because b is null (safe, no crash)
//
//        // --- Non-null assertion !! ---
//        println("\nNon-null assertion (!!) results:")
//        println(a!!.length)  // 5, a is not null
//         println(b!!.length)  // ❌ CRASH! b is null




// prints type of name: String

//println("enter what u want")
//
//    println("enter what u want")
//    var name= ""
//    name = readLine()?:""
//    println(name?.uppercase())

// prints "null" instead of crashing

//        println("enter your age")
//        val age = readLine()!!.toIntOrNull()
//        val com=age?.%2==0
//
//        println("the com is $com")

//    while (true) {
//        print("Enter your age: ")
//        val input = readLine()!!
//        val convert=input.toIntOrNull()
//
//        if (convert==null){
//            println("Invalid input")
//            continue
//        }
//        when{
//            convert>=18 -> {
//                println("adult")
//
//            }convert<18->{
//                println("Kid")
//            }
//        }
//        break;
//
//
//
//    }

}