from finaltask.models.circle import Circle
from finaltask.models.rectangle import Rectangle
from finaltask.models.square import Square
from finaltask.models.triangle import Triangle


class Presenter:

    def __init__(self, view, figures):
        self.view = view
        self.figures = figures

    def sort_collection(self):
        self.figures.sort_by_area()

    def get_rectangle(self):
        self.view.print_message("Введите сторону A")
        a = float(self.view.get_input())
        self.view.print_message("Введите сторону B")
        b = float(self.view.get_input())

        return Rectangle(a, b)

    def get_square(self):
        self.view.print_message("Введите сторону")
        a = float(self.view.get_input())

        return Square(a)

    def get_circle(self):
        self.view.print_message("Введите радиус")
        r = float(self.view.get_input())

        return Circle(r)

    def get_triangle(self):
        self.view.print_message("Введите сторону A")
        a = float(self.view.get_input())
        self.view.print_message("Введите сторону B")
        b = float(self.view.get_input())
        self.view.print_message("Введите сторону C")
        c = float(self.view.get_input())

        return Triangle(a, b, c)

    def choice_figure(self):
        self.view.print_message("1 - Треугольник\n2 - Круг\n3 - Квадрат\n4 - Прямоугольник")
        user_choice = self.view.get_input()

        if user_choice == "1":
            return self.get_triangle()
        elif user_choice == "2":
            return self.get_circle()
        elif user_choice == "3":
            return self.get_square()
        elif user_choice == "4":
            return self.get_rectangle()
        else:
            self.view.print_message("Неверный ввод")
            return None

    def add_figure(self):
        figure = self.choice_figure()
        if figure is not None:
            self.figures.add_figure(figure)

    def remove_figure(self):
        index = self.get_index()
        if index >= 0:
            self.figures.remove_figure(index)

    def replace_figure(self):
        index = self.get_index()
        figure = self.choice_figure()
        if index >= 0:
            self.figures.update_figure(index, figure)

    def get_index(self):
        self.view.print_message("Введите индекс")
        figure_number = int(self.view.get_input())
        if figure_number >= self.figures.get_count():
            return -1
        return figure_number
