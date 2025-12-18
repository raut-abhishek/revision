import mongoose from 'mongoose';
// import {userSchema, orderSchema} from './schemaDesign.js';

const Order = mongoose.model("Order");

Order.aggregate([
  { $match: { status: "PAID" } },
  {
    $group: {
      _id: "$user",
      totalSpent: { $sum: "$amount" }
    }
  },
  {
    $lookup: {
      from: "users",
      localField: "_id",
      foreignField: "_id",
      as: "userDetails"
    }
  },
  { $unwind: "$userDetails" }
]);
