import org.scalatest._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec
import cats.effect.IO
import org.scalatest.matchers.should.Matchers
import cats.effect.unsafe.implicits.global

class FakeSpec extends AnyFunSpec with Matchers {
  describe("sum 1+1") {
    it("should be 2") {
      (for {
        result <- IO(1 + 1)
      } yield result shouldBe 2).unsafeRunSync()
    }
    it("failure") {
      (for {
        result <- IO(1 + 1)
      } yield result shouldBe 3).unsafeRunSync()
    }
  }
}
