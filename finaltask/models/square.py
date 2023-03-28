from finaltask.models.figure import Figure


class Square(Figure):

    def __init__(self, side):
        self.side = side

    def get_perimeter(self):
        return 4 * self.side

    def get_area(self):
        return self.side * self.side

    def get_side(self):
        return self.side
