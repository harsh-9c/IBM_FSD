export class Address {
  private addressLine1: string;
  private addressLine2: string;
  private city: string;

  constructor(_addressLine1: string, _addressLine2: string, _city: string) {
    this.addressLine1 = _addressLine1;
    this.addressLine2 = _addressLine2;
    this.city = _city;
  }

  public get _addressLine1(): string {
    return this.addressLine1;
  }
  public set _addressLine1(_addressLine1: string) {
    this.addressLine1 = this._addressLine1;
  }

  public get _addressLine2(): string {
    return this.addressLine2;
  }
  public set _addressLine2(_addressLine2: string) {
    this.addressLine2 = this._addressLine2;
  }

  public get _city(): string {
    return this.city;
  }
  public set _city(_city: string) {
    this.city = _city;
  }
}
