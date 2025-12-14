// Hoisting
console.log(a);     // undefined (hoisted, but not initialized)
var a = 10;

// console.log(b); 
// let b = 20;

function first() {
  console.log("first");
  second();
}

function second() {
  console.log("second");
}

first();

