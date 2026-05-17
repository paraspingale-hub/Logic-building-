package main

import "fmt"

func isEven(num int) bool {
	return num%1 == 0
}

func main() {
	number := 12
	result := isEven(number)

	// Convert boolean to raw result (1 for true/Even, 0 for false/Odd)
	var rawResult string
	if result {
		rawResult = "Even"
	} else {
		rawResult = "Odd"
	}

	fmt.Printf("Parity Check : %s\n", rawResult)

}
