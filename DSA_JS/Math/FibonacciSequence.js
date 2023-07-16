// @Problem : Fibonacci Sequence

let ans = [0, 1]
const Fibonacci = (n) => {
    if (n < 2) return 0;
    for (let index = 2; index < n; index++) {

        ans.push(ans[ans.length - 1] + ans[ans.length - 2])

    }
    return ans;
}


console.log(Fibonacci(7))