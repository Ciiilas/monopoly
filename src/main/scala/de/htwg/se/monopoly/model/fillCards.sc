

enum Street_Names(stringRepresentation: String):

  override def toString: String = stringRepresentation
  case Schlossallee extends Street_Names("Schlossallee")
  case Bahnhofstrasse extends Street_Names("Bahnhofstrasse")
  case Parkstrasse extends Street_Names("Parkstrasse")
  case Seestrasse extends Street_Names("Seestrasse")
  case Hafenstrasse extends Street_Names("Hafenstrasse")
  case Chausseestrasse extends Street_Names("Chausseestrasse")
  case Elisenstrasse extends Street_Names("Elisenstrasse")
  case Opernplatz extends Street_Names("Opernplatz")
  case Theaterplatz extends Street_Names("Theaterplatz")
  case Badstrasse extends Street_Names("Badstrasse")
  case Turmstrasse extends Street_Names("Turmstrasse")
  case Goethestrasse extends Street_Names("Goethestrasse")
  case Rathausplatz extends Street_Names("Rathausplatz")
  case Poststrasse extends Street_Names("Poststrasse")
  case Hauptstrasse extends Street_Names("Hauptstrasse")
  case Kirchplatz extends Street_Names("Kirchplatz")
  case Ringstrasse extends Street_Names("Ringstrasse")
  case Schillerstrasse extends Street_Names("Schillerstrasse")
  case Bismarckstrasse extends Street_Names("Bismarckstrasse")
  case Goetheplatz extends Street_Names("Goetheplatz")
  case Kaiserstrasse extends Street_Names("Kaiserstrasse")
  case Lessingstrasse extends Street_Names("Lessingstrasse")
  case Wilhelmstrasse extends Street_Names("Wilhelmstrasse")
  case Auguststrasse extends Street_Names("Auguststrasse")
  case Friedrichstrasse extends Street_Names("Friedrichstrasse")
  case Bergstrasse extends Street_Names("Bergstrasse")
  case Kurfurstendamm extends Street_Names("Kurfurstendamm")
  case Alexanderplatz extends Street_Names("Alexanderplatz")
  case Breitscheidplatz extends Street_Names("Breitscheidplatz")
  case Friedrichshain extends Street_Names("Friedrichshain")
  case Schoneberg extends Street_Names("Schoneberg")
  case Charlottenburg extends Street_Names("Charlottenburg")
  case Wedding extends Street_Names("Wedding")
  case Kreuzberg extends Street_Names("Kreuzberg")
  case Neukolln extends Street_Names("Neukolln")
  case Spandau extends Street_Names("Spandau")
  case Tempelhof extends Street_Names("Tempelhof")
  case Wilmersdorf extends Street_Names("Wilmersdorf")
  case Mitte extends Street_Names("Mitte")
  case Steglitz extends Street_Names("Steglitz")
  case Tiergarten extends Street_Names("Tiergarten")
  case Lichtenberg extends Street_Names("Lichtenberg")
  case Reinickendorf extends Street_Names("Reinickendorf")
  case Marzahn extends Street_Names("Marzahn")
  case Hellersdorf extends Street_Names("Hellersdorf")
  case Treptow extends Street_Names("Treptow")
  case Moabit extends Street_Names("Moabit")
  case Kopenick extends Street_Names("Kopenick")
  case Zehlendorf extends Street_Names("Zehlendorf")
  case Friedenau extends Street_Names("Friedenau")
  case Pankow extends Street_Names("Pankow")
  case Adlershof extends Street_Names("Adlershof")
  case Hohenschonhausen extends Street_Names("Hohenschonhausen")
  case Grunewald extends Street_Names("Grunewald")
  case Rummelsburg extends Street_Names("Rummelsburg")
  case Nikolassee extends Street_Names("Nikolassee")
  case Gesundbrunnen extends Street_Names("Gesundbrunnen")
  case Britz extends Street_Names("Britz")
  case Weissensee extends Street_Names("Weissensee")
  case Fennpfuhl extends Street_Names("Fennpfuhl")
  case Mahlsdorf extends Street_Names("Mahlsdorf")
  case Buch extends Street_Names("Buch")
  case Wilhelmstadt extends Street_Names("Wilhelmstadt")
  case Karow extends Street_Names("Karow")
  case Falkenberg extends Street_Names("Falkenberg")
  case Heinersdorf extends Street_Names("Heinersdorf")
  case Baumschulenweg extends Street_Names("Baumschulenweg")
  case Rahnsdorf extends Street_Names("Rahnsdorf")
  case Borsigwalde extends Street_Names("Borsigwalde")
  case Rosenthal extends Street_Names("Rosenthal")
  case Karolinenhof extends Street_Names("Karolinenhof")
  case Buchholz extends Street_Names("Buchholz")
  case Kolln extends Street_Names("Kolln")
  case Schmockwitz extends Street_Names("Schmockwitz")
  case Schmargendorf extends Street_Names("Schmargendorf")
  case Kaulsdorf extends Street_Names("Kaulsdorf")
  case Lankwitz extends Street_Names("Lankwitz")
  case Frohnau extends Street_Names("Frohnau")
  case Altglienicke extends Street_Names("Altglienicke")
  case Friedrichsfelde extends Street_Names("Friedrichsfelde")
  case Bohnsdorf extends Street_Names("Bohnsdorf")
  case Karlshorst extends Street_Names("Karlshorst")
  case Planterwald extends Street_Names("Planterwald")
  case Wartenberg extends Street_Names("Wartenberg")
  case Kladow extends Street_Names("Kladow")
  case Empty extends Street_Names(" ")

enum Figure(stringRepresentation: String):
  override def toString: String = stringRepresentation
  case Boot extends Figure("Boot")
  case Schuh extends Figure("Schuh")
  case Hut extends Figure("Hut")
  case Katze extends Figure("Katze")
  case Hund extends Figure("Hund")
  case Auto extends Figure("Auto")
  case Bügeleisen extends Figure("Bügeleisen")
  case Schubkarre extends Figure("Schubkarre")
  case Geldsack extends Figure("Geldsack")
  case Fingerhut extends Figure("Fingerhut")
  case Empty extends Figure(" ")


case class Card(streetName: Street_Names = Street_Names.Empty, houses: Int = 0, owner: Figure = Figure.Empty) {


}

case class Player(figure: Figure = Figure.Empty, position: Int = 0) {
  
}

case class Board(players: Set[Player]=Set(), cards: Vector[Card]=Vector()) {
  def this(figure: Figure) = {
    this(Set(new Player(figure)))
}
  def getCards: Vector[Card] = {
    this.cards
  }
}

val cards: Vector[Card] = Street_Names.values.dropRight(Street_Names.values.length-3).map(street=>Card(streetName=street)).toVector

cards.zipWithIndex.map { case (street_name, i) => s"│ ${street_name.streetName}" + (" " * (19 - street_name.streetName.toString.length))}.mkString




