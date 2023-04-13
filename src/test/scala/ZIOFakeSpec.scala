import zio.test._

object ZIOFakeSpec extends ZIOSpecDefault {
  def spec = suite("sum 1+1")(
    test("should be 2") {
      assertTrue(1 + 1 == 2)
    },
    test("failure") {
      assertTrue(1 + 1 == 3)
    }
  )
}
