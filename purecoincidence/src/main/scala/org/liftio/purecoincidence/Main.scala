package org.liftio.purecoincidence

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    PurecoincidenceServer.stream[IO].compile.drain.as(ExitCode.Success)
}
