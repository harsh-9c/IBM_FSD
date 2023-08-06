export class Training {
  constructor(
    private category: string,
    private title: string,
    private noOfDays: number
  ) {}
  buy() {
    console.log(
      "Buying this " +
        this.noOfDays +
        " days " +
        this.title +
        " course from category " +
        this.category
    );
  }
}

let training = new Training("CS", "Master in AI", 60);
training.buy();
