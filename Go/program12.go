/*
Package main
Description: A utility to determine if an integer is even or odd using the modulo operator.
Date: May 12, 2026
*/
package main

import "fmt"

// CheckEvenOdd determines if a number is even or odd and prints the result.
// Logic: If (number % 2) is 0, it is even. Otherwise, it is odd.
func CheckEvenOdd(num int) {
	if num%2 == 0 {
		fmt.Printf("The number %d is Even.\n", num)
	} else {
		fmt.Printf("The number %d is Odd.\n", num)
	}
}

func main() {
	var input int

	fmt.Println("--- Even or Odd Checker ---")
	fmt.Print("Enter an integer: ")

	// Capturing user input similarly to your previous programs
	_, err := fmt.Scan(&input)

	if err != nil {
		fmt.Println("Error: Please enter a valid integer.")
		return
	}

	// Calling the utility function to print the result directly
	CheckEvenOdd(input)
}
