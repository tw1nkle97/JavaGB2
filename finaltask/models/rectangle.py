from finaltask.models.figure import Figure


class Rectangle(Figure):

    def __init__(self, length, width):
        self.length = length
        self.width = width

    def get_perimeter(self):
        return 2 * (self.length + self.width)

    def get_area(self):
        return self.length * self.width

    def get_length(self):
        return self.length

    def get_width(self):
        return self.width
