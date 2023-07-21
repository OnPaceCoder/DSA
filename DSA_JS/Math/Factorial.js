// @Problem : Factorial of a number = n!
// @Input : 5
// @Output : 120  (5! = 5 * 4 * 3 * 2 * 1 = 120)

const Factorial = (n) => {
    if (n < 2) return 1;

    return Factorial(n - 1) * n;
};

console.log(Factorial(5));
