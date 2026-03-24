package org.example


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    while (true) {
        print("Enter your age: ")
        val input = readLine()!!
        val convert=input.toIntOrNull()

        if (convert==null){
            println("Invalid input")
            continue
        }
        when{
            convert>=18 -> {
                println("adult")

            }convert<18->{
                println("Kid")
            }
        }
        break;



    }

}