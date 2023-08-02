// string
let message: string = "World";
// boolean
let valid: boolean = true;
// number
let grade: number = 99.9;
// any
let val: any = 88;

console.log("Hello " + message);
console.log("Valid: " + valid);
console.log("Grade: " + grade);
console.log("Any " + val);

// loops
for (let i = 0; i < 5; i++) {
  console.log(i);
}

// arrays
let reviews: number[] = [1, 2, 3, 4.5];

for (let i = 0; i < reviews.length; i++) {
  console.log(reviews[i]);
}

let sportsOne: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];
for (let tempSport of sportsOne) {
  if (tempSport == "Cricket") {
    console.log(tempSport + " << My Favorite!");
  } else {
    console.log(tempSport);
  }
}

let sportsTwo: string[] = ["Golf", "Cricket", "Tennis"];
sportsTwo.push("Baseball");
sportsTwo.push("Futbol");
for (let tempSport of sportsTwo) {
  console.log(tempSport);
}
