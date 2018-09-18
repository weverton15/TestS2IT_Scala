package main

import main.br.com.s2it.ex8.CompletingNumbers
import main.br.com.s2it.ex9.{BinaryTree, Leaf, Node}

object Main extends App {
  val compNum = new CompletingNumbers(a = 10, b = 1598)
  println(compNum.numComplete())

  val tree = Node(Leaf(15), (Node(Node(Leaf(25), null), Node(null, Leaf(10)))))
  println(tree.sum(tree))
}
