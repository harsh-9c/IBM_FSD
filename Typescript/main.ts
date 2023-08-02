import { Address } from "./Address";
import { Person } from "./Person";
import { RegularEmployee } from "./RegularEmployee";
import { Student } from "./Student";

let person = new Person(
  "John",
  "Doe",
  "john@email.com",
  new Address("Tech park", "Whitefield", "Banglore")
);
console.log(person);
let employee = new RegularEmployee(10000, "John", "Doe");
person._address = new Address("Hinjewadi", "phase 3", "pune");
console.log(person, employee);

console.log(employee);

let student = new Student(
  "adam",
  "wick",
  "adam@gmail.com",
  person._address,
  "AI"
);

console.log(student);
