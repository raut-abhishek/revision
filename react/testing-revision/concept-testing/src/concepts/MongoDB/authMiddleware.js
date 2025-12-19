import { verify } from "jsonwebtoken";

export function auth(req, res, next) {
  const token = req.cookies.token;
  if (!token) return res.status(401).json({ message: "Unauthorized" });

  const decoded = verify(token, process.env.JWT_SECRET);
  req.user = decoded;
  next();
}
