from functools import cmp_to_key

class FigureCollection:

    def __init__(self):
        self.figures = []

    def get_count(self):
        return len(self.figures)

    def get_figures(self):
        return self.figures

    def add_figure(self, figure):
        self.figures.append(figure)

    def remove_figure(self, index):
        self.figures.pop(index)

    def update_figure(self, index, figure):
        self.figures[index] = figure

    def sort_by_area(self):
        self.figures.sort(key=cmp_to_key(self.compare_areas))

    @staticmethod
    def compare_areas(f1, f2):
        return (f1.get_area() > f2.get_area()) - (f1.get_area() < f2.get_area())
