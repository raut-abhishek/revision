// Schema Design: Embedded vs Referenced Documents in MongoDB


// Embedded schema

const embeddedSchema = {
  _id: 1,
  name: "Abhishek",
  orders: [
    { orderId: 101, total: 500 },
    { orderId: 102, total: 1200 }
  ]
}


// Referenced schema

const referencedSchema = [
  { _id: 1, name: "Abhishek" },
  { orderId: 101, userId: 1, total: 500 },
  { orderId: 102, userId: 1, total: 1200 }
]