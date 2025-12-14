

const user = {
  name: "A",
  address: { city: "Pune" }
};

// Shallow copy
const shallow = { ...user };

// Deep copy
const deep = JSON.parse(JSON.stringify(user));

shallow.address.city = "Mumbai";

console.log(user.address.city); // "Mumbai" (affected)
console.log(deep.address.city); // "Pune"
