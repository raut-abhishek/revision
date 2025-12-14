const obj = {
  name: "JS",

  normalFunc() {
    console.log(this.name);
  },

  arrowFunc: () => {
    console.log(this.name);
  }
};

// Calling the methods
obj.normalFunc(); 

// Calling the arrow function
obj.arrowFunc(); 
