const rLine = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

rLine.question("What is your name ? ", (e) => {
  console.log("Your Name is ", e);
  rLine.close();
});
// console.log("Your Name is ");
