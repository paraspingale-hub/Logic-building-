package main

import "fmt"

func Addition(nos1 int, nos2 int) int {
	var sum int = nos1 + nos2

	return sum

}
func main() {
	// Printing the string to the standard output
	var nos1 int
	var nos2 int
	fmt.Println("Enter the nos")
	fmt.Scan(&nos1)

	fmt.Println("Enter the nos")
	fmt.Scan(&nos2)
	var sum int = nos1 + nos2

	sum = Addition(nos1, nos2)
	fmt.Println(sum)

}
