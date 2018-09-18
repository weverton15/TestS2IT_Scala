package main.br.com.s2it.ex9

sealed abstract class BinaryTree {
  def sum(bin: BinaryTree): Int = {
    def sums(t: BinaryTree):Int = t match {
      case Leaf(v)    => v
      case Node(l, r) => sums(l) + sums(r)
      case _       => 0
    }
    sums(bin)
  }
}
case class Node (left : BinaryTree, right : BinaryTree) extends BinaryTree
case class Leaf (value : Int) extends BinaryTree
