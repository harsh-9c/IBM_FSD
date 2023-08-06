import { Address } from "./Address";

export class Person {
  private firstName: string;
  private lastName: string;
  private email: string;
  private address: Address;

  constructor(
    _firstName: string,
    _lastName: string,
    _email: string,
    _address: Address
  ) {
    this.firstName = _firstName;
    this.lastName = _lastName;
    this.email = _email;
    this.address = _address;
  }

  public getDetails(): string {
    return (
      "First Name: " +
      this.firstName +
      ", Last Name: " +
      this.lastName +
      ", Email: " +
      this.email +
      "\nAddress Line1: " +
      this.address._addressLine1 +
      ", Address Line2: " +
      this.address._addressLine2 +
      ", City: " +
      this.address._city
    );
  }

  public get _firstName(): string {
    return this.firstName;
  }
  public set _firstName(_firstName: string) {
    this.firstName = _firstName;
  }

  public get _lastName(): string {
    return this.lastName;
  }
  public set _lastName(_lastName: string) {
    this.lastName = _lastName;
  }

  public get _email(): string {
    return this.email;
  }
  public set _email(_email) {
    this.email = _email;
  }

  public get _address(): Address {
    return this.address;
  }
  public set _address(_address: Address) {
    this.address = _address;
  }
}
