// @Problem : Determine if the number is power of 2 or not
// @Input : 8  22  
// @Output : true false


PowerOfTwo = (n) => {
    if (n < 1) return false;
    while (n > 1) {
        if (n % 2 == 0) {
            n /= 2
        }
        else return false;
    }
    return true;
}

console.log(PowerOfTwo(33))