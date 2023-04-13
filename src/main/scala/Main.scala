import zio._
import cats.effect.{ IO => CIO, IOApp }

object Main extends App {
  println("Pair programming exercise")
}

object ZIOMain extends ZIOAppDefault {
  def run = zio.Console.printLine("Pair programming exercise ZIO")
}

object CatsMain extends IOApp {
  def run(args: List[String]) = CIO(println("Pair programming exercise Cats")).as(cats.effect.ExitCode.Success)
}
