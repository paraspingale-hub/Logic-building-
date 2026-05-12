package main

import "fmt"

func main() {
	// Printing the string to the standard output
	var nos1 int
	var nos2 int
	fmt.Println("Enter the nos")
	fmt.Scan(&nos1)

	fmt.Println("Enter the nos")
	fmt.Scan(&nos2)
	var sum int = nos1 + nos2
	fmt.Println(sum)

}
