package sml

/**
  * Created by jeremysmith on 26/02/2016.
  */

class OutInstruction(label: String, opcode: String, register: Int)
  extends Instruction(label, opcode){



  override def execute(m: Machine) =
    register


  override def toString(): String = {
    super.toString + " " + register.toString + "\n"

  }

}

object OutInstruction{

  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)

}