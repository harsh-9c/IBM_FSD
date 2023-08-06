import { Address } from "./Address";
import { Person } from "./Person";

export class Student extends Person {
  private course: string;
  constructor(
    firstName: string,
    lastName: string,
    email: string,
    address: Address,
    course: string
  ) {
    super(firstName, lastName, email, address);
    this.course = course;
  }
}
