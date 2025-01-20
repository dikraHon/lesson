package org.example

fun main() {
    var n = ""
    val menu =
            "TASK 1. является ли введённое пользователем число палиндромом    --- ENTER 1\n" +
            "TASK 2. является ли введённое пользователем число простым        --- ENTER 2\n" +
            "TASK 3. принимает на вход число и находит сумму его цифр         --- ENTER 3\n" +
            "TASK 4. выводит перевёрнутую лесенку из символов                 --- ENTER 4\n" +
            "exit --- ENTER q\n"
    while (n != "q"){
        println(menu)
        n = readln().toString()
        when(n) {
            "m" -> println(menu)
            "1" -> {
                print("Enter num: ")
                numPalindrome(readln().toInt())
            }
            "2" -> {
                print("Enter num: ")
                checkingAPrimeNumber(readln().toInt())
            }
            "3" -> {
                print("Enter num: ")
                sumOfDigits(readln().toInt())
            }
            "q" -> break
            else -> println("enter the correct num")
        }
    }




}


/* Напишите программу, которая проверяет,
является ли введённое пользователем число палиндромом
(читается одинаково слева направо и справа налево).
Используйте цикл для разбиения числа и сравнения цифр. */

fun numPalindrome(n: Int) {
    return if(n.toString() == n.toString().reversed())
        println("number is palindrome")
    else
        println("number is not palindrome")
}

/* Попросите пользователя ввести число и определите, является ли оно
простым. Простое число — это число, которое делится только на 1 и само на
себя. Используйте цикл для проверки всех возможных делителей. */

fun checkingAPrimeNumber(n: Int) {
    var i = 1
    var j = 0
    while(i < n){
        if (i == 1) {
            i++
            continue
        }
        if (n % i == 0){
            j += 1
            }
        i++
    }
    return if(j == 0)
        println("num is prime")
    else
        println("num is not prime")
}

fun sumOfDigits(n: Int){
    var str = n.toString()
    var j = 0
    var d = 12
    while (d >= 10) {
        for (i in str) {
            j += i.digitToInt()
        }
        str = j.toString()
        d = j
        j = 0
    }
    return println(d)
}

fun invertedStaircase(n: Int): Int{
    return 1
}