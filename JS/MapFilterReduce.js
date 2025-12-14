

const nums = [1, 2, 3, 4];

// map → transform
const squares = nums.map(n => n * n);

// filter → select
const evens = nums.filter(n => n % 2 === 0);

// reduce → combine
const sum = nums.reduce((acc, n) => acc + n, 0);

console.log(squares, evens, sum);
