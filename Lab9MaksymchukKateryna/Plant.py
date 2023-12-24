class Plant:
    def __init__(self, age, height):
        self.__age = age
        self.__height = height

    def getAge(self):
        return self.__age

    def setAge(self, age):
        self.__age = age

    def getHeight(self):
        return self.__height

    def setHeight(self, height):
        self.__height = height
    def grow(self, add):
        self.__height += add;
