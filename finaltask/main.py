from models.figurecollection import FigureCollection
from models.circle import Circle
from models.rectangle import Rectangle
from models.square import Square
from models.triangle import Triangle
from presenters.presenter import Presenter
from presenters.menu import Menu
from views.view import View


def main():
    view = View()
    collection = FigureCollection()
    presenter = Presenter(view, collection)
    collection.add_figure(Triangle(3, 2, 3))
    collection.add_figure(Square(5))
    collection.add_figure(Rectangle(2, 3))
    collection.add_figure(Circle(5))
    menu = Menu(presenter, view)
    menu.start()

if __name__ == "__main__":
    main()
