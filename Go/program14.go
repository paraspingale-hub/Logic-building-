/*
Package main
Description: Checks if a number is even, returns a boolean, and
             displays the result as a raw integer (0 or 1).
Date: May 12, 2026
*/
package main

import "fmt"

// IsEven returns true if the integer is even, false otherwise.
func IsEven(num int) bool {
	return num%2 == 0
}

func main() {
	var input int
	fmt.Print("Enter an integer: ")
	
	// Scanning input as seen in your workspace files
	_, err := fmt.Scan(&input)
	if err != nil {
		fmt.Println("Invalid input.")
		return
	}

	// Get the boolean result
	result := IsEven(input)

	// Convert boolean to raw result (1 for true/Even, 0 for false/Odd)
	var rawResult string
	if result  {
		rawResult = "Even"
	} else {
		rawResult = "Odd"
	}

	fmt.Printf("Parity Check (1=Even, 0=Odd): %d\n", rawResult)
}