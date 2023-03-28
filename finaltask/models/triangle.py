import math

from finaltask.models.figure import Figure

class Triangle(Figure):

    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_perimeter(self):
        return self.a + self.b + self.c

    def get_area(self):
        p = self.get_perimeter() / 2.0
        return math.sqrt(p * (p - self.a) * (p - self.b) * (p - self.c))

    def get_a(self):
        return self.a

    def get_b(self):
        return self.b

    def get_c(self):
        return self.c
