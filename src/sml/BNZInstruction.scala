package sml

/**
  * Created by jeremysmith on 27/02/2016.
  */
class BNZInstruction(label: String, opcode: String, register: Int, value: String)
  extends Instruction(label, opcode) {

  def execute(m: Machine): Unit ={

    val labelIndex = m.labels.labels.indexOf(value)
    val valueTocheck = m.regs(register)

    if(valueTocheck != 0){
      m.execute(labelIndex)
    }

  }


  override def toString(): String = {
    super.toString + " " + value + "\n"
  }

}

object BNZInstruction{
  def apply(label: String,  register: Int, value: String) =
    new BNZInstruction(label, "bnz", register, value)
}
