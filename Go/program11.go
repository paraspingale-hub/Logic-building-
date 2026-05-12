/*
Package main
Description: Accepts two floats, converts any negative input to positive,

	and then performs addition. (|a| + |b|)

Date: May 12, 2026
*/
package main

import (
	"fmt"
	"math"
)

// AdditionOfAbsolutes converts both inputs to their absolute
// values before adding them together.
func AdditionOfAbsolutes(nos1 float64, nos2 float64) float64 {
	// Convert inputs to absolute values first
	val1 := math.Abs(nos1)
	val2 := math.Abs(nos2)

	return val1 + val2
}

func main() {
	var nos1, nos2 float64

	fmt.Println("--- Addition of Absolute Inputs ---")

	fmt.Print("Enter first number: ")
	fmt.Scan(&nos1)

	fmt.Print("Enter second number: ")
	fmt.Scan(&nos2)

	result := AdditionOfAbsolutes(nos1, nos2)

	fmt.Printf("\nProcessing: |%v| + |%v|\n", nos1, nos2)
	fmt.Printf("Final Result: %v\n", result)
}
