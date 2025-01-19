package org.example

fun main() {
    print("Enter num: ")
    numPalindrome(readln().toInt())
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