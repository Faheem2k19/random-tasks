class Robot:
    def __init__(self,name,color,age):
        self.name = name
        self.color = color
        self.age = age

    def introduce_self(self):
        print("my name is" + self.name + ", I'm " + self.age + "years old" + ". And my favorite color is" + self.color)

r1 = Robot("Asif", 26, "black")
r1.introduce_self()