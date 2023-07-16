// @Problem : Determine if the number is prime or not
// @Input : 13  12
// @Output : true false


PrimeNumber = (n) => {
    if (n < 2) return false

    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false
    }

    return true
}

console.log(PrimeNumber(13))