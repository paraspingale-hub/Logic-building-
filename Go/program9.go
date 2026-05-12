package main

import "fmt"

func AdditionTwoNumbers(nos1 float64, nos2 float64) float64 {
	var sum float64 = nos1 + nos2

	return sum

}
func main() {

	var nos1 float64
	var nos2 float64
	fmt.Println("Enter the nos")
	fmt.Scan(&nos1)

	fmt.Println("Enter the nos")
	fmt.Scan(&nos2)
	var sum float64 = nos1 + nos2

	sum = AdditionTwoNumbers(nos1, nos2)
	fmt.Println(sum)

	if nos1 < 0 {
		nos1 = -nos1
	}
	if nos2 < 0 {
		nos2 = -nos2
	}

}
