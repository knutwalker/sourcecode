package sourcecode

object TextTests {
  def apply() = {
    assert(foo(1) == (1, "1"))
    val bar = Seq("lols")
    assert(foo(bar) == (Seq("lols"), "bar"))
    assert(foo('lol.toString * 2) == ("'lol'lol", "'lol.toString * 2"))
    assert(foo{println("Hello"); 'lol.toString * 2} == ("'lol'lol", "'lol.toString * 2"))
    val f = foo((s: String) => s.substring(1))
    assert((f._1("foo"), f._2) == ("oo", "(s: String) => s.substring(1)"))

  }
  def foo[T](v: sourcecode.Text[T]) = (v.value, v.source)
}
