package go
// Package main provides utility functions for numerical and bitwise operations.
// It includes a high-performance parity checker used to determine the bit-level 
// characteristics of integer data.
package main

import (
	"fmt"
)

// IsEvenParity checks if the given integer has even parity.
// An integer has even parity if its least significant bit (LSB) is 0,
// which mathematically identifies it as an even number.
//
// Parameters:
//   - number: The integer to be evaluated.
//
// Returns:
//   - bool: true if the number is even, false if it is odd.
//
// Performance: O(1) time complexity using bitwise AND operation.
func IsEvenParity(number int) bool {
	// A bitwise AND with 1 isolates the least significant bit.
	// If (number & 1) equals 0, the number is even.
	return (number & 1) == 0
}

// main serves as the entry point for the application.
// It demonstrates the usage of IsEvenParity with various test cases,
// including positive, negative, and zero values.
func main() {
	// Define a slice of test integers to validate the parity checker
	testNumbers := []int{42, 7, 0, -12, -5}

	fmt.Println("========================================")
	fmt.Println("        Go Parity Checker Report        ")
	fmt.Println("========================================")

	for _, num := range testNumbers {
		isEven := IsEvenParity(num)
		
		// Establish the string representation of the parity type
		var parityType string
		if isEven {
			parityType = "Even"
		} else {
			parityType = "Odd"
		}

		// Standardized formatting for console output
		fmt.Printf("Number: %5d  |  Is Even Parity? %-5t  |  Classification: %s\n", num, isEven, parityType)
	}
	
	fmt.Println("========================================")
}