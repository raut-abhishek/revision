// Schema Design: Embedded vs Referenced Documents in MongoDB

const mongoose = require('mongoose');


// Embedded schema

const addressSchema = new mongoose.Schema({
  street: String,
  city: String,
  pincode: Number
});

const userSchema = new mongoose.Schema({
  name: String,
  email: String,
  address: addressSchema
});

module.exports = mongoose.model("User", userSchema);




// Referenced schema

const orderSchema = new mongoose.Schema({
  user: {
    type: mongoose.Schema.Types.ObjectId,
    ref: "User",
    required: true
  },
  amount: Number,
  status: String
});

module.exports = mongoose.model("Order", orderSchema);
