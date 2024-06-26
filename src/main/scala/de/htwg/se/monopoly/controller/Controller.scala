package de.htwg.se.monopoly
package controller

import model.{Board, Figure, Player}
import util.Observable

class Controller(var board: Board) extends Observable{
  
  def createBoard(size: Int): Unit = {
    //board = new Board(size);
    notifyObservers
  }
  
  def addPlayer(figure: Figure): Unit = {
    board = board.addPlayer(figure)
  }

  def walkPlayer(x:Int): Unit = {
    board = board.walkPlayer(x)

  }

  override def toString: String = Board.toString

}