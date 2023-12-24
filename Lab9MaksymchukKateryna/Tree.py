from Plant import Plant
class Tree(Plant):
    def __init__(self, age, height):
        super().__init__(age, height)
    def giveFruits(self):
        print("Tree gave fruits!")