class Menu:

    def __init__(self, presenter, view):
        self.presenter = presenter
        self.view = view

    def show_menu(self):
        menu = ("1 - Информация о всех фигурах\n"
                "2 - Информация о периметрах фигур\n"
                "3 - Информация о площадях фигур\n"
                "4 - Добавить фигуру\n"
                "5 - Заменить фигуру\n"
                "6 - Удалить фигуру\n"
                "7 - Выход\n")
        self.view.print_message(menu)

    def start(self):
        choice = 0
        while choice != 7:
            self.show_menu()
            choice = int(self.view.get_input())
            if choice == 1:
                self.presenter.print_all_figures()
            elif choice == 2:
                self.presenter.print_perimeters()
            elif choice == 3:
                self.presenter.print_area()
            elif choice == 4:
                self.presenter.add_figure()
            elif choice == 5:
                self.presenter.replace_figure()
            elif choice == 6:
                self.presenter.remove_figure()
