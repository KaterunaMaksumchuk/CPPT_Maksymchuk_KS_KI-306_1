from Tree import Tree

tree = Tree(20, 14)
print("Size of tree: " + str(tree.getHeight()))
print("Age of tree: " + str(tree.getAge()))
tree.grow(12)
print("Size of tree: " + str(tree.getHeight()))
print("Age of tree: " + str(tree.getAge()))
tree.giveFruits()