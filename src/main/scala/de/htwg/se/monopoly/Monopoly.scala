package de.htwg.se.monopoly

import de.htwg.se.monopoly.aview.Tui
import de.htwg.se.monopoly.controller.Controller
import de.htwg.se.monopoly.model._

import scala.collection.immutable.Queue


object Monopoly {

  //val controller = new Controller(new Board)
  //val Tui = new Tui(controller)
  //val Board = new Board_output_on_console
  def main(args: Array[String]): Unit = {
    println("Welcome to Monopoly")
    val size: Int = 36
    val player = Player(Figure.Boot, 0)
    val card = Card(Street_Names.Schlossallee, 0, Figure.Empty)
    val controller = Controller(Board(Queue[Player](player), Map[Int, Card]()))
    val tui = Tui(controller)
    tui.run
  }
}