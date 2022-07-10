@main def hello: Unit =
  var (a:Int, b:Int, d:Int) = (2, 3, 5);
  var c = 4;
  var g = 4.0f;
  var k = 4.3f;

  println((b-1) * a + c * d)
  println(a+1)
  println(-2 * (g-k) + c)
  c = c+1
  println(c)
  println(c * a)
  

  