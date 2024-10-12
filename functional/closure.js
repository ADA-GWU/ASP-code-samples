function makeAdder(x) {
     return function(y) {return x + y;}
   }

var add10 = makeAdder(10);
var add5 = makeAdder(5);

console.log("add 10 to 20: " + add10(20));
console.log("add 5 to 20: "+ add5(20));
