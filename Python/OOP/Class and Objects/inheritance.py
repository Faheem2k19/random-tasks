class P1:
    def assign_str1(self, str1):
        self.str1 = str1

    def show_str1(self):
        return self.str1


class P2:
    def assign_str2(self, str2):
        self.str2 = str2

    def show_str2(self):
        return self.str2


class Derived(P1, P2):
    def assign_str3(self, str3):
        self.str3 = str3

    def show_str3(self):
        return self.str3


c1 = Derived()

c1.assign_str1("My first name is Asiful Alam.")
c1.assign_str2("Last name is Fahim.")
c1.assign_str3("Full name is Asiful Alam Fahim")

c1.show_str1()
c1.show_str2()
c1.show_str3()
