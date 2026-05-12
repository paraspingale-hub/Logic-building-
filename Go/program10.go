/*
Package main
Description: This program calculates the absolute sum of two floating-point numbers.

	The absolute sum is defined as |a + b|.

Date: May 12, 2026
*/
package main

import (
	"fmt"
	"math"
)

// AbsoluteSum takes two float64 values, adds them, and returns
// the absolute (non-negative) result of that addition.
func AbsoluteSum(a float64, b float64) float64 {
	sum := a + b
	return math.Abs(sum)
}

func main() {
	// Standard User Input Section
	var val1, val2 float64

	fmt.Println("--- Absolute Sum Calculator ---")
	fmt.Print("Enter first float: ")
	fmt.Scan(&val1)
	fmt.Print("Enter second float: ")
	fmt.Scan(&val2)

	result := AbsoluteSum(val1, val2)
	fmt.Printf("The absolute sum of %v and %v is: %v\n", val1, val2, result)

	// Validation Test Cases
	runTests()
}

// runTests executes pre-defined scenarios to ensure logic accuracy.
func runTests() {
	fmt.Println("\n--- Running Validation Tests ---")

	tests := []struct {
		a, b     float64
		expected float64
	}{
		{5.5, 4.5, 10.0},    // Positive + Positive
		{-10.5, -5.5, 16.0}, // Negative + Negative
		{-10.0, 5.0, 5.0},   // Negative + Positive (Result is |-5|)
		{0.0, 0.0, 0.0},     // Zero case
	}
	{
		fmt.Print("Hello")
	}

	for _, tc := range tests {
		actual := AbsoluteSum(tc.a, tc.b)
		if actual == tc.expected {
			fmt.Printf("PASS: |%v + %v| = %v\n", tc.a, tc.b, actual)
		} else {
			fmt.Printf("FAIL: |%v + %v| expected %v, but got %v\n", tc.a, tc.b, tc.expected, actual)
		}
	}
}
