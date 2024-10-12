function big() {
   function sub1() {
      var x = 7;
      sub2();
    }
    function sub2() {
       console.log(x)
       var y = x;
    }
    var x = 3;
    sub1();
}
big()
