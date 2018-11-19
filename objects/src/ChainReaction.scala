import scala.language.postfixOps

class ChainReaction private(command:Command) {
  def ==>(chain: ChainReaction) = {
    command.execute()
    chain
  }

  def <==() = {
    "Process has finished."
  }
}

object ChainReaction {

  def apply(command:Command) = {
    new ChainReaction(command)
  }
}

trait Command {
  def execute()
}

class PrintCommand() extends Command {
  override def execute() {
    println("Printing line.")
  }
}

object PrintCommand {
  def apply() = {
    new PrintCommand()
  }
}

class UploadCommand() extends Command {
  override def execute() {
    println("Uploading file.")
  }
}

object UploadCommand {
  def apply() = {
    new UploadCommand()
  }
}

class EndCommand() extends Command {
  override def execute() {
  }
}

object EndCommand {
  def apply() = {
    new EndCommand()
  }
}

object ChainRunner extends App {
  val c1 = PrintCommand()
  val r1 = ChainReaction(c1)

  val c2 = UploadCommand()
  val r2 = ChainReaction(c2)

  val end = EndCommand()
  val r3 = ChainReaction(end)

  println(r1 ==> r2 ==> r3 <==)
}
